package CompanyRoster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {
    String name;
    List<Employee> employeeList;

    public Department() {
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }
    public double getAverageSalary() {
        double avgSalary = 0.0;
        for (Employee employee : employeeList) {
        avgSalary += employee.getSalary();
        }
        return avgSalary / this.employeeList.size();
    }

    public List<Employee> getEmployeeList() {
        return Collections.unmodifiableList(this.employeeList);
    }
}
