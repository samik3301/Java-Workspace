import java.util.Scanner;

public class BankCustomer_20BRS1205 {
    protected String customerPAN;
    protected int customerAadhar;
    protected String customerAddress;
    String customerName;
    String customerDate;


    public void getCustomerDetails(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the bank customer name: ");
        customerName = s.nextLine();
        System.out.println("Enter the bank customer date of birth: ");
        customerDate = s.nextLine();
        System.out.println("Enter the bank customer PAN: ");
        customerPAN= s.nextLine();
        System.out.println("Enter the bank customer Aadhar number: ");
        customerAadhar = s.nextInt();
        System.out.println("Enter the bank customer address: ");
        s.nextLine();
        customerAddress = s.nextLine();
    }

    public void display(){
        System.out.println("The name of the bank customer is: "+customerName);
        System.out.println("The date of birth of the bank customer is: "+customerDate);
        System.out.println("The PAN of the bank customer is : "+customerPAN);
        System.out.println("The aadhar number of the bank customer is: "+customerAadhar);
        System.out.println("The address of the bank customer is: "+customerAddress);
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int choice=0;
        System.out.println("Enter 1 for Saving's account details and Enter 2 for Loan Details");
        choice = input.nextInt();
        if(choice ==1){
            SavingsAccount_20BRS1205 s1 = new SavingsAccount_20BRS1205();
            s1.getCustomerDetails();
            s1.getSBdetails();
            System.out.println();
            s1.display();
            s1.displaySBdetails();
        }
        else if(choice==2){
            LoanAccount_20BRS1205 l1 = new LoanAccount_20BRS1205();
            l1.getCustomerDetails();
            l1.getLoanDetails();
            System.out.println();
            l1.display();
            l1.displayLoanDetails();
        }
        else{
            System.out.println("Enter a valid choice(either 1 or 2) !");
        }
    }

}
