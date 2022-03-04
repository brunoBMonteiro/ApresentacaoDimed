package net.guides.springboot2.springboot2jpacrudexample.controller;


import lombok.AllArgsConstructor;
import net.guides.springboot2.springboot2jpacrudexample.exeption.ResourceNotFoundException;
import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.service.EmployeeService;
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

  /*  @GetMapping("/employees")
    ResponseEntity<CollectionModel<EntityModel<Employee>>> findAll() {
        List<EntityModel<Employee>> employeeResources = StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(employee -> EntityModel.of(employee,
                        linkTo(methodOn(EmployeeController.class).findOne(employee.getId())).withSelfRel()
                                .andAffordance(afford(methodOn(EmployeeController.class).updateEmployee(null, employee.getId())))
                                .andAffordance(afford(methodOn(EmployeeController.class).deleteEmployee(employee.getId()))),
                        linkTo(methodOn(EmployeeController.class).findAll()).withRel("employees")))
                .collect(Collectors.toList());
        return ResponseEntity.ok(CollectionModel.of( //
                employeeResources, //
                linkTo(methodOn(EmployeeController.class).findAll()).withSelfRel()
                        .andAffordance(afford(methodOn(EmployeeController.class).newEmployee(null)))));
    }
*/

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