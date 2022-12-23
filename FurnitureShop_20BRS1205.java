import java.util.Scanner;

public class FurnitureShop_20BRS1205 {
    String furnitureName;
    String customerName;
    String customerAddress;
    String customerPhoneNum;
    int distanceFromShop;
    String customization;
    int transportationCharge;

    public void getFurnitures(){
        System.out.println("The furniture we have is Chair");
        System.out.println("The furniture we have is Couch");
        System.out.println("The furniture we have is Bed");
        System.out.println("The furniture we have is Table");
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your furniture of need from the list ");
        furnitureName = s.nextLine();

    }
    public void displayFurnitureDetails(){
        System.out.println("The selected furniture is :"+furnitureName);
    }
    public void getCustomerDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the customer name: ");
        //in.nextLine();
        customerName = in.nextLine();
        System.out.println("Enter the customer address: ");
        //in.nextLine();
        customerAddress = in.nextLine();
        System.out.println("Enter the customer phone number: ");
        customerPhoneNum = in.nextLine();
        System.out.println("Enter the customer's distance from the shop: ");
        distanceFromShop = in.nextInt();
    }

    public void displayCustomerDetails(){
        System.out.println("The customer name is: "+customerName);
        //System.out.println("The customer address is: "+customerAddress);
        //System.out.println("The customer phone number is: "+customerPhoneNum);

    }

    public static void main(String [] args){

        System.out.println("Do you want to buy some furniture or not(if yes then press 1, if not then press 2)");
        int choice;
        Scanner input= new Scanner(System.in);
        choice= input.nextInt();
        if(choice==1){
            FurnitureShop_20BRS1205 obj= new FurnitureShop_20BRS1205();
            CustomizeFurniture_20BRS1205 obj2 = new CustomizeFurniture_20BRS1205();
            Transport_20BRS1205 obj3 = new Transport_20BRS1205();
            obj.getCustomerDetails();
            obj.getFurnitures();

            obj2.doCustomization();
            obj.displayCustomerDetails();
            obj.displayFurnitureDetails();

            obj3.transportCharges(obj.distanceFromShop);
        }
        else{
            System.out.println("Enter correct choice!");
        }

    }
}


