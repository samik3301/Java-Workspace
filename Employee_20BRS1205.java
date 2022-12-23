public class Employee_20BRS1205 {
    int EmployeeID;
    String EmployeeName;
    String EmployeeDepartment;
    double EmployeeSalary;
    String EmployeeDesignation;
    boolean exceptional_emp;

    public Employee_20BRS1205(int EmployeeID, String EmployeeName, String EmployeeDepartment, double EmployeeSalary,String EmployeeDesignation, boolean exceptional_emp){
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.EmployeeDepartment = EmployeeDepartment;
        this.EmployeeSalary = EmployeeSalary;
        this.EmployeeDesignation = EmployeeDesignation;
        this.exceptional_emp = exceptional_emp;
    }

    public void Incentive(){
        if(exceptional_emp){
            EmployeeSalary = EmployeeSalary*0.1+EmployeeSalary + 10000;
        }
        else{
            EmployeeSalary = EmployeeSalary*0.1+EmployeeSalary;
        }
    }

    public void display(){
        System.out.println("The employee ID is: "+EmployeeID);
        System.out.println("The employee name is: "+EmployeeName);
        System.out.println("The employee salary is: "+EmployeeSalary);
        System.out.println("The employee department is: "+EmployeeDepartment);
        System.out.println("The employee designation is: "+EmployeeDesignation);
        System.out.println(" ");
    }

    public static void main(String[] args){
        Employee_20BRS1205 emp1 = new Employee_20BRS1205(1,"Sam","Finances",5000,"Manager",false);
        Employee_20BRS1205 emp2 = new Employee_20BRS1205(2, "Tom","HR",15000,"Sr. Manager",true);
        Employee_20BRS1205 emp3 = new Employee_20BRS1205(3, "Hank", "Media Relations", 10000, "Executive", false);

        emp1.Incentive();
        emp2.Incentive();
        emp3.Incentive();
        emp1.display();
        emp2.display();
        emp3.display();
    }

}
