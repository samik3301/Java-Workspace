import java.util.Scanner;

public class CustomizeFurniture_20BRS1205 extends FurnitureShop_20BRS1205 {
    public void doCustomization(){
        System.out.println("Enter the type of customization you want; if not , enter nil");
        //String customization;
        Scanner s= new Scanner(System.in);
        customization = s.nextLine();
        if(customization.equals("nil")){
            System.out.println("No customization of the furniture was selected");
        }
        else{
            System.out.println("The customization of the furniture selected is: "+customization);
        }

    }
}
