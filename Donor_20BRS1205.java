import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Donor_20BRS1205 {
    public static void main(String[] args){

        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of donors: ");
            int n = s.nextInt();
            s.nextLine();
            File f= new File("C:\\Users\\Guest User\\IdeaProjects\\first_program\\src\\donor.txt");
            FileWriter w = new FileWriter(f);
            for(int i=0;i<n;i++){
                System.out.println("Enter your name: ");
                String name = s.nextLine();
                System.out.println("Enter your age: ");
                int age = s.nextInt();
                s.nextLine();
                System.out.println("Enter your address: ");
                String address= s.nextLine();
                System.out.println("Enter your contact number: ");
                String contact_num = s.nextLine();
                System.out.println("Enter your blood group: ");
                String blood_grp = s.nextLine();
                System.out.println("Enter the date (month) of your last donation: ");
                String date = s.nextLine();
                w.write(name+" "+age+" "+address+" "+contact_num+" "+blood_grp+" "+date+" ");
                w.write("\n");
                //w.close()
            }
            w.close();

            try(Scanner s1 = new Scanner(f)){
                //System.out.println(s1.hasNext());
                while(s1.hasNext()){
                    String input= s1.nextLine();
                    String [] words = input.split(" ");
                    //System.out.println(Arrays.toString(words));

                    if(words[4].equals("A+")&&(words[5].equalsIgnoreCase("August")||words[5].equals("8"))){
                        for(String word :words){
                            System.out.println(word);
                        }
                    }

                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
