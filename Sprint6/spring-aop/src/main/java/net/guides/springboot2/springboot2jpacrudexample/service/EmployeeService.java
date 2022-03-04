package net.guides.springboot2.springboot2jpacrudexample.service;

import lombok.AllArgsConstructor;
import net.guides.springboot2.springboot2jpacrudexample.exeption.ResourceNotFoundException;
import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EmployeeService {

    //    public List<Employee> getAllEmployees() {
////        List<Employee> employeeList = employeeRepository.findAll();
////
////        for (Employee employee : employeeList) {
////            long id = employee.getId();
////            employee.add(L)
////
////                    EntityModel<Employee> one(@PathVariable Long id){
////
////            }
////
////        }
//
//
//        return employeeRepository.findAll();
//    }
    private final EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // exeption
    public Optional<Employee> getEmployeeById(Long employeeId) {

        return employeeRepository.findById(employeeId);
    }

    public Employee createEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    //exeption
    public Employee updateEmployee(Long employeeId,
                                   Employee employeeDetails) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        employee.setEmailId(employeeDetails.getEmailId());
        employee.setLastName(employeeDetails.getLastName());
        employee.setFirstName(employeeDetails.getFirstName());
        return employeeRepository.save(employee);
    }

    // exeption
    public Map<String, Boolean> deleteEmployee(Long employeeId)
            throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
