
//User defined exception- SwimmingNotKnownException
public class SwimmingNotKnownException extends Exception {
    public boolean KnowsSwimming = false;
    public SwimmingNotKnownException(boolean knowsSwimming){
        this.KnowsSwimming = KnowsSwimming;
    }
    public void checkSwimming(){
        System.out.println("Not eligible for swimming as swimming status is: "+KnowsSwimming);

    }
}
