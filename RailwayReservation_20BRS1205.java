public class RailwayReservation_20BRS1205 {
    String passengerName;
    int passengerAge;
    int passengerSeatno;
    int passengerTrainno;
    boolean freedomFighter;
    String source;
    String destination;
    double ticketFare;
    public double populateFare(){
        if (source.equals("Chennai") && destination.equals("Mumbai")){
            ticketFare= 500;
        }
        else if(source.equals("Chennai") && destination.equals("Delhi")){
            ticketFare = 800;
        }
        else if(source.equals("Chennai") && destination.equals("Kolkata")){
            ticketFare= 700;
        }
        else if(source.equals("Delhi") && destination.equals("Mumbai")){
            ticketFare= 800;
        }
        else if(source.equals("Delhi") && destination.equals("Kolkata")){
            ticketFare= 700;
        }
        else if(source.equals("Mumbai") && destination.equals("Kolkata")){
            ticketFare = 800;
        }
        return ticketFare;
    }
    public RailwayReservation_20BRS1205(String passengerName,int passengerAge,int passengerSeatno,int passengerTrainno,boolean freedomFighter,String source,String destination){
        this.passengerName= passengerName;
        this.passengerAge = passengerAge;
        this.passengerSeatno= passengerSeatno;
        this.passengerTrainno = passengerTrainno;
        this.source = source;
        this.destination= destination;
        this.freedomFighter = freedomFighter;  //if the passenger is a freedom fighter
        this.ticketFare = populateFare();
        if(freedomFighter){
            ticketFare= ticketFare-ticketFare*0.5;
        }

    }

    public RailwayReservation_20BRS1205(String passengerName,int passengerAge,int passengerSeatno,int passengerTrainno,String source,String destination) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.passengerSeatno = passengerSeatno;
        this.passengerTrainno = passengerTrainno;
        this.source= source;
        this.destination = destination;
        //this.freedomFighter = freedomFighter;  if the passenger isnt a freedom, this constructor is used
        this.ticketFare = populateFare();

    }


    public void display(){
        System.out.println("The passenger name is: "+passengerName);
        System.out.println("The passenger age is: "+passengerAge);
        System.out.println("The passenger seat number is: "+passengerSeatno);
        System.out.println("The passenger train number is: "+passengerTrainno);
        System.out.println("The passenger source is: "+source);
        System.out.println("The passenger destination is: "+destination);
        System.out.println("The passenger ticket fare is: "+ticketFare);
        System.out.println(" ");
    }
    public static void main(String[] args){
        RailwayReservation_20BRS1205 p1 = new RailwayReservation_20BRS1205("Sam",21,40,46290,"Chennai","Delhi");
        RailwayReservation_20BRS1205 p2 = new RailwayReservation_20BRS1205("Raj",80,41,46290,true,"Chennai","Delhi");
        RailwayReservation_20BRS1205 p3 = new RailwayReservation_20BRS1205("Tom",44,24,46291,"Chennai","Mumbai");
        //p1.isFreedomFighter();
        p1.display();
        p2.display();
        p3.display();
    }
}
