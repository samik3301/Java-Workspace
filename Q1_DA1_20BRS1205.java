import java.util.Scanner;

public class Q1_DA1_20BRS1205 {
    static int greatest(int [] array,int num_of_elements){
        int max=0;
        for(int i=0;i<num_of_elements;i++){
            if(max<array[i]){
                max= array[i];
            }
        }
        return max;
    }

    static int greatest_position(int [] array,int num_of_elements){
        int max=0,i;
        for(i=0;i<num_of_elements;i++){
            if(max<array[i]){
                max= array[i];
            }
        }
        int index =0;
        for(int j=0;j<num_of_elements;j++){
            if(array[j]==max){
                index = j;
            }
        }
        return index+1;  //because the indexing starts from 0 in java
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num_of_elements = 10;
        int [] array = new int[num_of_elements];
        System.out.println("Enter the elements of the array(such that the greatest element is neither the first or last)");
        for(int i=0;i<num_of_elements;i++){
            array[i] = s.nextInt();
        }

        System.out.println("The given array is :");
        for(int i=0;i<num_of_elements;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int greatest_element = greatest(array,num_of_elements);
        int greatest_element_position = greatest_position(array,num_of_elements);
        System.out.println("The greatest element is: "+greatest_element);
        System.out.println("The position of the greatest element is: "+greatest_element_position);

    }
}
