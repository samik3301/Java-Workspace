import java.util.Scanner;
interface ThemePark_int_20BRS1205 {
    void getVisitorDetails();
    void playDiving(int a,boolean s);
    class ThemePark1_20BRS1205 extends MainThemePark_20BRS1205{
        public void playDiving(int a, boolean s) {
            if (a >= 18 & s) {
                System.out.println("You are eligible for playing in Theme Park1.");
            }
            else {
                System.out.println("You are not eligible for playing in  Theme Park 1");
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
        public  void DisplayDetails(){
            System.out.println("The Visitor name is : "+VisitorName);
            System.out.println("The Visitor age is: "+VisitorAge);
            System.out.println("The Visitor gender is: "+VisitorGender);
            System.out.println("The Visitor city is: "+VisitorCity);
            System.out.println("The Visitor swimming (Y/N)? output is: "+VisitorSwimming_Input);
            System.out.println();
        }
    }

    class ThemePark2_20BRS1205 extends MainThemePark_20BRS1205{
        public void playDiving(int a, boolean s) {
            if (a >= 21 & s) {
                System.out.println("You are eligible for playing in Theme Park2 .");
            }
            else {
                System.out.println("You are not eligible for playing in  Theme Park 2");
            }
        }
        public void playWaterSports(int a,boolean s){
            if(a>=21 &s){
                System.out.println("You are eligible for playing watersports in Theme Park2 .");
            }
            else {
                System.out.println("You are not eligible for playing watersports in  Theme Park 2");
            }

        }
        public void DisplayDetails(){
            getVisitorDetails();
            System.out.println("The Visitor name is : "+VisitorName);
            System.out.println("The Visitor age is: "+VisitorAge);
            System.out.println("The Visitor gender is: "+VisitorGender);
            System.out.println("The Visitor city is: "+VisitorCity);
            System.out.println("The Visitor swimming (Y/N)? output is: "+VisitorSwimming_Input);
            System.out.println();
        }
    }
}


