
import java.util.Scanner;

class Workshop_Thread extends Thread{
    int workshop_count=0;
    int workshop_money= 0;
    public void run(){
        System.out.println("You have registered for the workshop event!");
        workshop_count++;
        workshop_money+=100;
    }
    public void display(){
        System.out.println("The total number of people who registered for the workshop event are: "+workshop_count);
        System.out.println("The total money for workshop registration is: "+workshop_money);
    }
}

class Poster_Thread extends Thread{
    int poster_count=0;
    int poster_money= 0;
    public void run(){
        System.out.println("You have registered for the poster event!");
        poster_count++;
        poster_money+=200;

    }
    public void display(){
        System.out.println("The total number of people who registered for the poster event are: "+poster_count);
        System.out.println("The total money for poster registration is: "+poster_money);
    }
}


class Hackathon_Thread extends Thread{
    int hackathon_count=0;
    int hackathon_money= 0;
    public void run(){
        System.out.println("You have registered for the hackathon event!");
        hackathon_count++;
        hackathon_money+=300;

    }
    public void display(){
        System.out.println("The total number of people who registered for the hackathon event are: "+hackathon_count);
        System.out.println("The total money for hackathon registration is: "+hackathon_money);
    }
}


public class Registration_20BRS1205 {
    public static void main(String [] args){
        Workshop_Thread thd1= new Workshop_Thread();
        Poster_Thread thd2 = new Poster_Thread();
        Hackathon_Thread thd3 = new Hackathon_Thread();
        System.out.println("Yes to start: ");
        Scanner s2= new Scanner(System.in);
        String input2 = s2.nextLine();


        do{
            System.out.println("Enter workshop to register for the workshop event");
            System.out.println("Enter poster to register for the poster event");
            System.out.println("Enter hackathon to register for the hackathon event");
            Scanner s = new Scanner(System.in);
            String input= s.nextLine();
            if(input.equals("workshop")){
                thd1.run();
                thd1.display();
            }
            else if(input.equals("poster")){
                thd2.run();
                thd2.display();
            }
            else if(input.equals("hackathon")){
                thd3.run();
                thd3.display();
            }
            System.out.println("Enter Yes to continue further and No to exit");
            input2 = s2.nextLine();
            if(input2.equals("No")){
                break;
            }
        }while(input2.equals("Yes"));

    }

}
