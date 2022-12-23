import java.util.Scanner;

public class PaintCostFinder_20BRS1205 {

    static double area_calculate(int length, int width, int height){
        int area_rectangular_room = length*width*height;
        double amount= calculate_gallons_needed(area_rectangular_room);
        return amount;
    }

    static double calculate_gallons_needed(int area_rectangular_room){
        double amount_gallon = area_rectangular_room/300;
        System.out.println("The amount of gallons of paint needed is: "+amount_gallon);
        double price_calculate = amount_gallon*30;
        return price_calculate;
    }
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        int length;
        int width;
        int height;
        double final_result;
        System.out.println("Enter the length in feet: ");
        length = inp.nextInt();
        System.out.println("Enter the width in feet: ");
        width = inp.nextInt();
        System.out.println("Enter the height in feet: ");
        height= inp.nextInt();
        final_result= area_calculate(length,width,height);
        System.out.println("The final cost for the given dimensions and according to the total area is :"+"$"+final_result);
    }
}
