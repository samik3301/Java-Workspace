import java.util.Scanner;

public class Q8_DA1_20BRS1205 {
    static class AccountDetails_20BRS1205{
        String AccountHolderName;
        int AccountHolderAge;
        String AccountHolderDOB;
        String AccountHolderIdentity;
        int AccountBalance;
        String AccountType;

        AccountDetails_20BRS1205(String AccountHolderName,int AccountHolderAge, String AccountHolderDOB,String AccountHolderIdentity,int AccountBalance,String AccountType){
            this.AccountHolderName= AccountHolderName;
            this.AccountHolderAge = AccountHolderAge;
            this.AccountHolderDOB= AccountHolderDOB;
            this.AccountHolderIdentity=AccountHolderIdentity;
            this.AccountBalance= AccountBalance;
            this.AccountType= AccountType;

        }

        public void Deposit(){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the amount you want to deposit in your bank account: ");
            int amount = s.nextInt();
            AccountBalance+=amount;
            System.out.println();
        }

        public void Withdraw(){
            Scanner s2 = new Scanner(System.in);
            System.out.println("Enter the amount to be withdrawn from your bank account: ");
            int amount_withdraw = s2.nextInt();
            if(amount_withdraw<=AccountBalance){
                System.out.println("The amount to be withdraw is: "+amount_withdraw);
                AccountBalance-=amount_withdraw;
                System.out.println();
            }
            else{
                System.out.println("Insufficient amount in your bank balance, withdrawl failed!");
            }
        }

        public void display(){
            System.out.println("The account holder name is: "+AccountHolderName);
            System.out.println("The account holder age is: "+AccountHolderAge);
            System.out.println("The account holder date of birth is: "+AccountHolderDOB);
            System.out.println("The account holder identity is: "+AccountHolderIdentity);
            System.out.println("The account holder bank balance is: "+AccountBalance);
            System.out.println("The account type is: "+AccountType);
            System.out.println();
        }

    }

    public static void main(String [] args){
        AccountDetails_20BRS1205 p1 = new AccountDetails_20BRS1205("Samik",21,"30/08/2001","PAN",20000,"Savings");
        AccountDetails_20BRS1205 p2 = new AccountDetails_20BRS1205("Abdul",20,"13/08/2002","PAN",200000,"Checkings");
        p1.display();
        p1.Deposit();
        p1.Withdraw();
        p1.display();
        p2.display();
        p2.Deposit();
        p2.Withdraw();
        p2.display();
    }
}
