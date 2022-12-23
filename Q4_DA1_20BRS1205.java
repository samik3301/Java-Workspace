import java.util.Scanner;

public class Q4_DA1_20BRS1205 {
    static void array_rotate(int [] array,int num_of_elements){
        int temp = array[num_of_elements-1];
        for(int i=num_of_elements-1;i>0;i--){
            array[i]= array[i-1];
        }
        array[0]= temp;
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
        array_rotate(array,num_of_elements);
        System.out.println("Array after cyclically rotating once: ");
        for(int i=0;i<num_of_elements;i++){
            System.out.print(array[i]+" ");
        }
    }
}
