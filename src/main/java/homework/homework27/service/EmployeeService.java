package homework.homework27.service;

import homework.homework27.data.Employee;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);
    Employee delEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
}
