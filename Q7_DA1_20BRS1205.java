import java.util.Scanner;

public class Q7_DA1_20BRS1205 {
    static void print_n_equal(char [] array, int name_length, int n){
        int equal_size = name_length/n;
        if(name_length%n!=0){
            System.out.println("The string isn't divisible in equal parts");
        }
        for(int i=0;i<name_length;i++){
            if(i%equal_size==0){
                System.out.println(" ");
            }
            System.out.print(array[i]);
        }
    }
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Enter the number of parts you want to split the string equally: ");
        int n= s.nextInt();
        int name_length = name.length();
        char[] array = new char[name_length];
        for (int i = 0; i < name.length(); i++) {
            array[i] = name.charAt(i);
        }
        System.out.println();
        print_n_equal(array,name_length,n);
    }
}
