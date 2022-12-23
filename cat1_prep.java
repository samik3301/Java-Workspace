
import java.util.Scanner;

public class cat1_prep {
    static void display(String string){
        string = string.toLowerCase();
        int wordcount=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==' '){
                wordcount++;
            }
        }
        System.out.println("the word count of the string is: "+wordcount);
    }
    static void reverse(String string){
        char [] reverse_string = new char[string.length()];
        for(int i=0;i<string.length();i++){
            reverse_string[i] = string.charAt(string.length()-i-1);
        }
        for(int i=0;i<string.length();i++){
            System.out.print(reverse_string[i]+"");
        }
    }
    static void largest_smallest(String string){
        string = string.toLowerCase();
        String word="";
        String[] words= new String[10];
        int temp=0;
        string = string +" ";
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!= ' '){
                word = word+ string.charAt(i);
            }
            else{
                words[temp]=word;
                temp++;
                word="";
            }
        }
        int max=0;
        int min= 1000;
        for(int i=0;i<temp;i++){
            if(max<words[i].length()){
                max = words[i].length();
            }
            if(min>words[i].length()){
                min = words[i].length();
            }
        }
        System.out.println("The maximum length of the word in string is: "+max);
        System.out.println("The minimum length of the word in string is: "+min);
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        /*
        Integer x=5;
        int y=6;
        int z=5;
        System.out.println(x.byteValue());
        System.out.println(x.compareTo(3)); //returns 1 for incorrect and 0 for correct
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        double x2= 3.244;
        //to access Math functions use, Math.method_name(parameter);
        //Math.ceil(x);
        System.out.println(Math.ceil(x2));
        */

        String string = s.nextLine();
        //display(string);
        //reverse(string);
        largest_smallest(string);

    }
}
