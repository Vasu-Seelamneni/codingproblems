package memorymanagement;

/*
* This class is created to understand how the memory management occurs during the program execution.
* */
public class Employee {

    int orgId = 4252;
    String orgName = "Dell Technologies";
    String ceo = "Seelamneni Vasu";
    int noOfDepts = 2;
    static Double netWorth = 500.00;

    public static void main(String[] args) {
        int eid = 101;
        String empName = "John";
        double salary = 5000.00;

        Employee e1 = new Employee();
        e1.getOrgId();
        System.out.println(Employee.getNetWorth());

        Employee e2 = new Employee();
        e2.deleteEmployee();

    }

    public int getOrgId(){
        return orgId;
    }

    public static double getNetWorth() {
        return netWorth;
    }

    public void deleteEmployee(){
        //code to delete employee
    }
}
