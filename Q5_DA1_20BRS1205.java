import java.util.Scanner;

public class Q5_DA1_20BRS1205 {
    static void count(char [] array,int name_length){
        int vowel_count=0;
        int consonant_count =0;
        for(int i=0;i<name_length;i++){
            if(array[i]== 'a' || array[i]=='e' || array[i] =='i' || array[i]=='o' || array[i]=='u'){
                vowel_count++;
            }
            else {
                consonant_count++;
            }
        }
        System.out.println("The vowel count in the given string is: "+vowel_count);
        System.out.println("The consonant count in the given string is: "+consonant_count);

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
        count(array,name_length);

    }
}
