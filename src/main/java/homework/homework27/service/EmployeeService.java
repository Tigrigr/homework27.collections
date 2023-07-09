package homework.homework27.service;

import homework.homework27.data.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName, int salary, int departamentID);
    Employee delEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);

    Collection<Employee> findAll();
}
