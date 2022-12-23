import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentException_20BRS1205 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the student's registration number: ");
        String StudentRegNum = s.nextLine();
        System.out.println("Enter the student's mobile phone number: ");
        String StudentMobileNum = s.nextLine();
        int StudentRegLength = StudentRegNum.length();
        int StudentMobileLength = StudentMobileNum.length();
        boolean RegNumCheck= true;
        boolean MobileNumCheck = true;
        boolean checkDigit=true;
        boolean checkAlphaNum = true;
        if(StudentRegLength !=9) {
            RegNumCheck= false;
            throw new IllegalArgumentException("Registration Number does not contain 9 characters");
        }

        if(StudentMobileLength !=10){
            MobileNumCheck = false;
            throw new IllegalArgumentException("Mobile number does not contain 10 digits");
        }

        for(int i=0;i<StudentMobileLength;i++){
            if(!Character.isDigit(StudentMobileNum.charAt(i))){
                checkDigit= false;
            }
        }
        if(checkDigit==false){
            throw new NumberFormatException("Mobile number contains something other than digits");
        }


        for(int i=0;i<StudentRegLength;i++){
            if(!Character.isDigit(StudentRegNum.charAt(i)) & !Character.isAlphabetic(StudentRegNum.charAt(i))){
                checkAlphaNum = false;
            }
        }

        if(checkAlphaNum== false){
            throw new NoSuchElementException("Registration number contains something other than digits and alphabets");
        }

        if(RegNumCheck & MobileNumCheck & checkDigit & checkAlphaNum){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }

    }
}
