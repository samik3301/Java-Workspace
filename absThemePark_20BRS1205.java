import java.util.Scanner;

abstract class absThemePark_20BRS1205 {
    String VisitorName;
    int VisitorAge;
    String VisitorGender;
    String VisitorCity;
    String VisitorSwimming_input;
    boolean VisitorSwimming;


    public  void getInfo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the visitor name: ");
        VisitorName = s.nextLine();
        System.out.println("Enter the visitor age: ");
        VisitorAge = s.nextInt();
        s.nextLine();
        System.out.println("Enter the gender: ");
        VisitorGender = s.nextLine();
        System.out.println("Enter the visitor city: ");
        VisitorCity = s.nextLine();
        System.out.println("Swimming ?(Y/N): ");
        VisitorSwimming_input = s.nextLine();
        if(VisitorSwimming_input.equals("Y")){
            VisitorSwimming = true;
        }
        else{
            VisitorSwimming = false;
        }

    }
    public abstract void playDiving(int a,boolean s);

}

class Themepark1 extends absThemePark_20BRS1205{
    public void playDiving(int a,boolean s){
        if(a>=18 && s){
            System.out.println("Permission to play in theme part 1 : granted");
        }
        else{
            System.out.println("Permission to play in theme park 1 : not granted");
        }
    }
}
class Themepark2 extends absThemePark_20BRS1205{
    public void playDiving(int a,boolean s){
        if(a>=21 && s){
            System.out.println("Permission to play in theme part 2 : granted");
        }
        else{
            System.out.println("Permission to play in theme park 2 : not granted");
        }
    }
}

