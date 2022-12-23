import java.util.Scanner;

public class MainThemePark_20BRS1205 implements ThemePark_int_20BRS1205{
    String VisitorName;
    int VisitorAge;
    String VisitorGender;
    String VisitorCity;
    String VisitorSwimming_Input;
    boolean VisitorSwimming;
    Scanner s = new Scanner(System.in);
    public void DisplayDetails(){
        getVisitorDetails();
        System.out.println("The Visitor name is : "+VisitorName);
        System.out.println("The Visitor age is: "+VisitorAge);
        System.out.println("The Visitor gender is: "+VisitorGender);
        System.out.println("The Visitor city is: "+VisitorCity);
        System.out.println("The Visitor swimming (Y/N)? output is: "+VisitorSwimming_Input);
        System.out.println();
    }
    public void playDiving(int a,boolean s){

    }
    public void playWaterSports(int a, boolean s){

    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println("Enter 1 or 2 for Theme Park 1 or Theme Park 2 eligibilty: ");
        choice = s.nextInt();
        if(choice==1){
            ThemePark1_20BRS1205 Obj1 = new ThemePark1_20BRS1205();
            Obj1.getVisitorDetails();
            Obj1.playDiving(Obj1.VisitorAge, Obj1.VisitorSwimming);

        }
        else if(choice==2){
            ThemePark2_20BRS1205 Obj2 = new ThemePark2_20BRS1205();
            Obj2.getVisitorDetails();
            Obj2.playDiving(Obj2.VisitorAge, Obj2.VisitorSwimming);
            Obj2.playWaterSports(Obj2.VisitorAge, Obj2.VisitorSwimming);

        }
        else{
            System.out.println("Invalid choice, enter 1 or 2 only !");
        }
    }
    public void getVisitorDetails(){
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
        VisitorSwimming_Input = s.nextLine();
        if(VisitorSwimming_Input.equals("Y")){
            VisitorSwimming = true;
        }
        else{
            VisitorSwimming = false;
        }
    }


}
