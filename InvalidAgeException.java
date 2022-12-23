//User defined exception 2- InvalidAgeException
public class InvalidAgeException extends Exception {
    public boolean ageValid=false;

    public InvalidAgeException(boolean ageValid){
        this.ageValid = ageValid;
    }

    public void isAgeValid(){
        System.out.println("Not eligible because the age is less than 18 ");
    }
}
