public class RegNotFound extends Exception{
    public boolean regfound = true;
    public RegNotFound(boolean regfound){
        this.regfound=regfound;
    }
    public void NotFound(){
        System.out.println("The registration number wasn't found in the list");
    }
}
