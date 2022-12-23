import java.util.Scanner;

public class Q2_DA1_20BRS1205 {
    static void removeEven(int [] array,int num_of_elements){
        for(int i=0;i<num_of_elements;i++){
            if(array[i]%2!=0){
                System.out.print(array[i]+" ");
            }
        }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array" );
        int num_of_elements = s.nextInt();
        int [] array = new int[num_of_elements];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<num_of_elements;i++){
            array[i]= s.nextInt();
        }
        System.out.println("The given array is: ");
        for(int i=0;i<num_of_elements;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("The odd numbers in the array are: ");
        removeEven(array,num_of_elements);
    }
}
