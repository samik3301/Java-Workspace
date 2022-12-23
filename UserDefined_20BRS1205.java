import java.util.Scanner;

public class UserDefined_20BRS1205 {
    public static void nullpointercheck(String s){
        if(s.length()==0){
            throw new NullPointerException("Manipulation of null value is not correct");
        }
    }
    public static void divisionbyzero(int a,int b){
        if(b==0){
            throw new ArithmeticException("Division by zero is not permitted");
        }
    }
    public static void digitcheck(String x){
        for(int i=0;i<x.length();i++){
            if(!Character.isDigit(x.charAt(i))){
                throw new NumberFormatException("Input string contains non numeric data");
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = s.nextLine();
        nullpointercheck(string);
        digitcheck(string);
        System.out.println("Enter the first number a: ");
        int a = s.nextInt();
        System.out.println("Enter the second number b: ");
        int b = s.nextInt();
        System.out.println("The result of a/b is: ");
        int c = a/b;
        divisionbyzero(a,b);
        System.out.println(c);

    }
}
