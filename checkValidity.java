//Checking class for validity
public class checkValidity {
    public void CheckingSwimmingValidity(boolean a) throws SwimmingNotKnownException{
        if(!a){
            //System.out.println("Doesn't know swimming!");
            throw new SwimmingNotKnownException(false);
        }

    }

    public void CheckingAgeValidity(int b) throws InvalidAgeException{
        if(b<18){
            //System.out.println("Age is below 18!");
            throw new InvalidAgeException(false);
        }
    }
}
