package com.example.contract.controller;




//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


import java.util.Map;

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