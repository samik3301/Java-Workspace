import java.util.Scanner;

public class MainBank_20BRS1205_Q5 implements Bank_int_20BRS1205{
    String accountNumber;
    int accountOpenYear;
    String accountHolderName;
    int accountHolderAge;
    int accountAvgYearlyBalance;
    int currentYear= 2022;
    int diffYears;

    Scanner s = new Scanner(System.in);
    public void getCustomerDetails(){
        System.out.println("Enter the account holder name: ");
        accountHolderName = s.nextLine();
        System.out.println("Enter the account number: ");
        accountNumber = s.nextLine();
        System.out.println("Enter the account opening year: ");
        accountOpenYear = s.nextInt();
        System.out.println("Enter the account holder age: ");
        accountHolderAge = s.nextInt();
        System.out.println("Enter the account's yearly average balance: ");
        accountAvgYearlyBalance = s.nextInt();
        diffYears = 2022-accountOpenYear;
    }
    public  void checkPrivilegeCustomer(int a,int y){

    }

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println("Enter 1 or 2 for Bank 1 or Bank 2 eligibilty: ");
        choice = s.nextInt();
        if (choice == 1) {
            Bank1_20BRS1205_Q5 b1 = new Bank1_20BRS1205_Q5();
            b1.getCustomerDetails();
            b1.checkPrivilegeCustomer(b1.accountAvgYearlyBalance,b1.diffYears);
        }
        else if(choice==2){
            Bank2_20BRS1205_Q5 b2= new Bank2_20BRS1205_Q5();
            b2.getCustomerDetails();
            b2.checkPrivilegeCustomer(b2.accountAvgYearlyBalance,b2.diffYears);
        }
    }
}
