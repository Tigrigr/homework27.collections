package homework.homework27.service;

import homework.homework27.data.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findEmployeeMaxSalary(int departmentID);
    Employee findEmployeeMinSalary(int departmentID);
    Collection<Employee> findEmployeeFromDepartment(int departmentID);
    Map<Integer, List<Employee>> findAllEmployees();
}
