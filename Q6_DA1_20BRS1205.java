import java.util.Scanner;

public class Q6_DA1_20BRS1205 {
    static void frequency(char [] array, int length_string){
        int [] frequency = new int[length_string];
        for(int i=0;i<length_string;i++){
            frequency[i]=1;
            for(int j=i+1;j<length_string;j++){
                if(array[i]==array[j]){
                    frequency[i]++;
                    array[j]='0';
                }
            }
        }
        for(int i=0;i<length_string;i++){
            if(array[i]!=' ' && array[i]!='0'){
                System.out.println("The character "+array[i]+" and its frequency is: "+frequency[i]);
            }
        }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();
        int name_length = name.length();
        char [] array = new char[name_length];
        for(int i=0;i<name.length();i++){
            array[i]= name.charAt(i);
        }
        System.out.println();
        frequency(array,name_length);
    }
}
