//main class for Swimming I/O
import java.util.Scanner;

public class Swimming_20BRS1205 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        boolean Swim=false;
        System.out.println("Enter Yes if you know swimming and No if you don't");
        s.nextLine();
        String swim = s.nextLine();
        if(swim.equals("Yes")){
            Swim = true;
        }
        else if(swim.equals("No")){
            Swim = false;
        }
        else{
            System.out.println("Invalid answer!");
        }
        checkValidity c = new checkValidity();
        try{
            c.CheckingAgeValidity(age);
            c.CheckingSwimmingValidity(Swim);
        }
        catch (InvalidAgeException e){
            e.printStackTrace();
            e.isAgeValid();

        }
        catch (SwimmingNotKnownException x){
            x.checkSwimming();
            x.printStackTrace();
        }
        if(age>18 & swim.equals("Yes")){
            System.out.println("Permitted to Swim");
        }
        else{
            System.out.println("Not permitted to Swim");
        }

    }

}
