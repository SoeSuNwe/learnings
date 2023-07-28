package oop.composite.employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{

    List<Employee> employeeList=new ArrayList<>();
    @Override
    public void showEmployeeDetails() {
        for(Employee e: employeeList){
            e.showEmployeeDetails();
        }
    }
    public void addEmployee(Employee e){
        employeeList.add(e);
    }
    public void removeEmployee(Employee e){
        employeeList.remove(e);
    }
}
