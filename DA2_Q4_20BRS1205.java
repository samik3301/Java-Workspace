import java.util.ArrayList;
import java.util.Scanner;

public class DA2_Q4_20BRS1205 {
    public static void NotPresent(boolean a) throws RegNotFound{
        if(a){
            throw new RegNotFound(false);
        }

    }
    public static void main(String [] args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        n=s.nextInt();
        s.nextLine();
        ArrayList <String> regnums = new ArrayList<>();
        int flag=0;
        for(int i=0;i<n;i++){
            Scanner s2 = new Scanner(System.in);
            System.out.println("Enter the Registration number of the student: ");
            String reg_num = s2.nextLine();
            regnums.add(reg_num);
        }
        System.out.println("Enter the registration number to check from the list: ");
        String input_reg_num = s.nextLine();
        for (String i : regnums){
            if(!i.equals(input_reg_num)){
                flag=1;
            }
        }

        try{
            if(flag==1){
                NotPresent(true);
            }
            else{
                System.out.println("The registration number is in the list!");
            }
        }
        catch (RegNotFound r){
            r.NotFound();
            r.printStackTrace();
        }


    }
}
