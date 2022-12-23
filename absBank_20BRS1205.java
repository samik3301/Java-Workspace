import java.util.Scanner;

abstract class absBank_20BRS1205 {
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
    public abstract void checkPrivilegeCustomer(int a,int y);

}


class Bank1 extends absBank_20BRS1205{
    public void checkPrivilegeCustomer(int a,int y){
        if(a>=100000 && y>5){
            System.out.println("You are a privileged customer in our bank 1.");
        }
        else{
            System.out.println("You are not a privileged customer in our bank 1.");
        }
    }
}


class Bank2 extends absBank_20BRS1205{
    public void checkPrivilegeCustomer(int a,int y){
        if(a>=200000 && y>4){
            System.out.println("You are a privileged customer in our bank 2.");
        }
        else{
            System.out.println("You are not a privileged customer in our bank 2.");
        }
    }
}


