import java.util.Scanner;

public class SavingsAccount_20BRS1205 extends BankCustomer_20BRS1205{
    int SBaccountNum;
    int SBaccountBalance;
    //BankCustomer_20BRS1205 sb= new BankCustomer_20BRS1205();
    public void getSBdetails(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the saving bank account number: ");
        SBaccountNum = s.nextInt();
        System.out.println("Enter the saving account balance: ");
        SBaccountBalance = s.nextInt();
    }

    public void displaySBdetails(){
        System.out.println("The account number for Savings Bank is :"+SBaccountNum);
        System.out.println("The amount for the Saving Bank account is: "+SBaccountBalance);
        System.out.println();
    }
}
