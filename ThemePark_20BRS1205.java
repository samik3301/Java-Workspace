import java.util.Scanner;

public class ThemePark_20BRS1205 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Press 1 for theme park 1 and press 2 for theme park 2.");

        int choose = s.nextInt();
        if(choose==1){
            Themepark1 p1 = new Themepark1();
            p1.getInfo();
            p1.playDiving(p1.VisitorAge,p1.VisitorSwimming);
        }
        else if(choose==2){
            Themepark2 p2 = new Themepark2();
            p2.getInfo();
            p2.playDiving(p2.VisitorAge,p2.VisitorSwimming);
        }
        else{
            System.out.println("Wrong choice.");
        }
    }
}
