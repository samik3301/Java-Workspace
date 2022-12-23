import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int flag=0;
        String str = s.nextLine();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(i+2)){
                flag=1;
                //System.out.println("true");
            }
            else{
                flag=0;
                //System.out.println("false");
            }

        }
        /*
        int temp=0;
        for(int i=str.length();i<str.length()/2;i--){
            if(str.charAt(i-1)==str.charAt(i-3)){
                temp=1;
            }
            else{
                temp=0;
            }
        }*/
        if(flag==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
