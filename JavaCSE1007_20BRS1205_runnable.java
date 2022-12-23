import java.util.Scanner;

class Input_runnable {
    synchronized public void num_D1(){
        try{
            String input;
            Scanner s = new Scanner(System.in);
            int count=0;

            do{
                System.out.print("Do you want to join the D1 slot for Java, (Yes or No): ");
                //s.nextLine();
                input = s.nextLine();
                if(input.equals("Yes"))
                    count++;
                if(input.equals("No")){
                    break;
                }
            }while(input.equals("Yes"));
            System.out.println("The total number of students that registered in Java D1 is: "+count);

        }
        catch (Exception e){
            System.out.println("Some exception is caught");
            e.printStackTrace();
        }
    }
    synchronized public void num_D2(){
        try{
            String input2;
            Scanner s2 = new Scanner(System.in);
            int count2=0;
            do{
                System.out.print("Do you want to join the D2 slot for Java, (Yes or No): ");
                //s.nextLine();
                input2 = s2.nextLine();
                if(input2.equals("Yes"))
                    count2++;
                if(input2.equals("No")){
                    break;
                }
            }while(input2.equals("Yes"));
            System.out.println("The total number of students that registered in Java D2 is: "+count2);
        }
        catch (Exception e){
            System.out.println("Some exception is caught");
            e.printStackTrace();
        }
    }

}
class D1_runnable implements Runnable{
    Input_runnable f;
    D1_runnable(Input_runnable f){
        this.f = f;
    }
    public void run(){
        f.num_D1();
    }
}

class D2_runnable implements Runnable{
    Input_runnable g;
    D2_runnable(Input_runnable g){
        this.g = g;
    }
    public void run(){
        g.num_D2();
    }
}


public class JavaCSE1007_20BRS1205_runnable {
    public static void main(String[] args){
        Input_runnable x = new Input_runnable();
        D1_runnable obj = new D1_runnable(x);
        D2_runnable obj2 = new D2_runnable(x);


        Scanner in = new Scanner(System.in);
        String choice;
        System.out.println("Enter D1 to register for D1 slot and enter D2 to register for D2 slot: ");
        choice = in.nextLine();
        if(choice.equals("D1")){
            //System.out.println("The thread for D1 slot is running.....");
            obj.run();
        }
        else if(choice.equals("D2")){
            //System.out.println("The thread for D2 slot is running.....");
            obj2.run();
        }
        else{
            System.out.println("Invalid choice !");
        }

    }

}
