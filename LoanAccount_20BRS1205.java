import java.util.Scanner;

public class LoanAccount_20BRS1205 extends BankCustomer_20BRS1205 {
    int LoanAccountNum;
    int LoanAmount;
    String LoanType;

    public void getLoanDetails(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the bank account number for Loan sanction: ");
        LoanAccountNum = s.nextInt();
        System.out.println("Enter the Loan amount to be sanctioned: ");
        LoanAmount = s.nextInt();
        System.out.println("Enter the loan type: ");
        LoanType = s.nextLine();
    }

    public void displayLoanDetails(){
        System.out.println("The bank account number for the Loan account is: "+LoanAccountNum);
        System.out.println("The loan amount of the customer is: "+LoanAmount);
        System.out.println("The loan type of the customer is : "+LoanType);
        System.out.println();
    }

}
