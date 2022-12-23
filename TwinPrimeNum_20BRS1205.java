import primepackage.*;

import java.util.Scanner;

public class TwinPrimeNum_20BRS1205 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int n1=s1.nextInt();
        System.out.println("Enter the number 2 : ");
        int n2=s2.nextInt();
        PrimeNum_20BRS1205 obj = new PrimeNum_20BRS1205();

        for (int i = n1; i <=n2; i++) {

            if (obj.checkForPrime(i)  && obj.checkForPrime(i+2) && (i+2)<n2 ) {
                    System.out.print("(" + i + "," + (i+2) + ")" + ",");
                }
            }
        }
}
