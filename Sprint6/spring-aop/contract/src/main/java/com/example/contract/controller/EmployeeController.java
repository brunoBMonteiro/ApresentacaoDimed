package com.example.contract.controller;



import com.example.implementation.exeption.ResourceNotFoundException;
import com.example.implementation.model.Employee;
import com.example.implementation.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class EmployeeController {


    private final EmployeeService employeeService;



    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() throws ResourceNotFoundException {
        List<Employee> employeeList = employeeService.getAllEmployees();
        for (Employee employee : employeeList) {
            long id = employee.getId();
            employee.add(linkTo(methodOn(EmployeeController.class).getEmployeeById(id)).withSelfRel());
        }
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }



    @GetMapping("/employees/{id}")

    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException {

        Optional<Employee> employeeOptional = employeeService.getEmployeeById(employeeId);
        if(employeeOptional.isEmpty()){
            return new ResponseEntity<>(employeeOptional.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId)),HttpStatus.NOT_FOUND);
        }else {
            employeeOptional.get().add(linkTo(methodOn(EmployeeController.class).getAllEmployees()).withRel("Lista de Produtos"));
            return new ResponseEntity<>(employeeOptional.get(), HttpStatus.OK);
        }

    }






    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    /*Quando o Spring Boot encontra um argumento anotado com @Valid , ele inicializa automaticamente a implementação JSR 380 padrão — Hibernate Validator — e valida o argumento.
Quando o argumento de destino não passa na validação, o Spring Boot lança uma exceção MethodArgumentNotValidException .*/
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                   @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
        Employee updatedEmployee = employeeService.updateEmployee(employeeId, employeeDetails);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException {
        return employeeService.deleteEmployee(employeeId);
    }
}