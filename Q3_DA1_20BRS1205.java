import java.util.Scanner;

public class Q3_DA1_20BRS1205 {
    static int largest(int [] array,int num_of_elements){
        int max=0;
        for(int i=0;i<num_of_elements;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    static int smallest(int [] array,int num_of_elements){
        int min= 100000;        //large value
        for(int i=0;i<num_of_elements;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
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
        int largest_element = largest(array,num_of_elements);
        int smallest_element = smallest(array,num_of_elements);
        int difference = largest_element - smallest_element;
        System.out.println("The difference of the largest and the smallest value is: "+difference);
    }
}
