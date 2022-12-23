class DivideParcel{
    synchronized public void Customer1(int n){
        int Customer1_count=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                Customer1_count++;
                System.out.println("The customer 1 got the Parcel number: "+i);
            }
        }
        System.out.println("The total number of parcels for Customer 1 is: "+Customer1_count);
    }

    synchronized public void Customer2(int n){
        int Customer2_count=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                Customer2_count++;
                System.out.println("The customer 2 got the Parcel number: "+i);
            }
        }
        System.out.println("The total number of parcels for Customer 2 is: "+Customer2_count);
    }
}

class OddParcel extends Thread{
    DivideParcel d1;
    OddParcel(DivideParcel d1){
        this.d1 = d1;
    }
    public void run(){
        d1.Customer1(10);
    }
}

class EvenParcel extends Thread{
    DivideParcel d2;
    EvenParcel(DivideParcel d2){
        this.d2 = d2;
    }
    public void run(){
        d2.Customer2(10);
    }
}

public class OddEven_Parcel {
    public static void main(String[] args){
        DivideParcel obj = new DivideParcel();
        OddParcel thd1 = new OddParcel(obj);
        EvenParcel thd2 = new EvenParcel(obj);
        thd1.run();
        thd2.run();
    }
}
