package za.co.sita.api.service;

import org.springframework.stereotype.Component;

import za.co.sita.api.data.models.Employee;
import za.co.sita.api.data.request.EmployeeRequest;
import za.co.sita.api.data.response.MessageResponse;

import java.util.List;
import java.util.Optional;

@Component
public interface EmployeeService {
    MessageResponse createEmployee(EmployeeRequest employeeRequest);
    Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest);
    void deleteEmployee(Integer employeeId);
    Employee getASingleEmployee(Integer employeeId);
    List<Employee> getAllEmployee();
}
