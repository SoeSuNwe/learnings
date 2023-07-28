package oop.composite.employee;

public class Company {
    public static void main(String[] args){
        Developer developer1=new Developer(1,"Mg","Pro Developer");
        Developer developer2=new Developer(2,"Ma","Developer");

        CompanyDirectory engDirectory=new CompanyDirectory();
        engDirectory.addEmployee(developer1);
        engDirectory.addEmployee(developer2);

        Manager manager1=new Manager(3,"ko","SEO Manger");
        Manager manager2=new Manager(4,"Hla"," Manger");
        CompanyDirectory accountDirectory=new CompanyDirectory();
        accountDirectory.addEmployee(manager1);
        accountDirectory.addEmployee(manager2);

        CompanyDirectory directory=new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accountDirectory);
        directory.showEmployeeDetails();
        System.out.println("**********After remove employee************");
        directory.removeEmployee(accountDirectory);
        directory.showEmployeeDetails();

    }
}
