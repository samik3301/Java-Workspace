package primepackage;

import java.util.Scanner;

public class PrimeNum_20BRS1205 {

    public boolean checkForPrime(int num) {

        if (num <= 1) {
            //System.out.println("Not prime number!");
            return false;
        }

        else if(num==2){
            return true;
        }
        else if(num%2==0){
            return false;
        }
        for(int i = 3; i < num; i += 1) {
            if (num % i == 0) {
                return false;   //factor so not prime
            }
            return true; //not a factor so prime
        }

        return true;
    }
}
    /*


         */



