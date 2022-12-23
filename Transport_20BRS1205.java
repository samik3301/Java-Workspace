public class Transport_20BRS1205 extends FurnitureShop_20BRS1205{
    public void transportCharges(int a){
        if(a<5){
            transportationCharge =0;
            System.out.println("The transportation charge is: "+transportationCharge);
        }
        else{
            transportationCharge=500;
            System.out.println("The transportation charge is: "+transportationCharge);
        }
    }

}
