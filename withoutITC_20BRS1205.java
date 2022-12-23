class Produce_Consume{
    int i;
    synchronized void Produce(int i) {
        this.i = i; System.out.println("Data Delivered: " +i);
    }
    synchronized int Consume() {
        System.out.println("Data Received: " + i);
        return i;
    }
}
class ProduceThread extends Thread{
    Produce_Consume obj;
    ProduceThread(Produce_Consume obj){ this.obj = obj; }
    public void run() {
        for(int k = 0; k <= 5; k++) obj.Produce(k);
    }
}

class ConsumeThread extends Thread {
    Produce_Consume obj;
    ConsumeThread(Produce_Consume obj){ this.obj = obj; }
    public void run() {
        for(int k = 0; k <= 5; k++) obj.Consume();
    }
}

public class withoutITC_20BRS1205 {
    public static void main(String[] args) {
        Produce_Consume obj = new Produce_Consume();
        ProduceThread P = new ProduceThread(obj);
        P.start();
        ConsumeThread C = new ConsumeThread(obj);
        C.start();
    }
}
