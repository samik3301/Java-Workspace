import java.util.Scanner;

public class Bank_20BRS1205 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice, 1 for bank 1 and 2 for bank 2 (checking eligibility)");
        int choose;
        choose= s.nextInt();
        if(choose == 1){
            Bank1 b1 = new Bank1();
            b1.getCustomerDetails();
            b1.checkPrivilegeCustomer(b1.accountAvgYearlyBalance, b1.diffYears);
        }
        else if(choose==2){
            Bank2 b2 = new Bank2();
            b2.getCustomerDetails();
            b2.checkPrivilegeCustomer(b2.accountAvgYearlyBalance, b2.diffYears);
        }
        else{
            System.out.println("Invalid choice, please enter only 1 or 2 when I recompile and run the program");
        }
    }
}
