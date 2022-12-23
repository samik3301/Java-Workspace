
import java.util.*;
class produceConsume {
    int i;
    boolean produced = false;
    synchronized public void produce(int i) {
        if (produced)
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        this.i = i;
        System.out.println("Data Delivered: " + i);
        produced = true;
        notify();
    }
    synchronized public int consume() {
        if (!produced)
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        System.out.println("Data Received:  " + i);
        produced = false;
        notify();
        return i;
    }
}
class Producer extends Thread {
    produceConsume obj;
    Producer(produceConsume obj) {
        this.obj = obj;
    }
    public void run() {
        for (int i = 0; i <=5; i++) {
            obj.produce(i);
        }}
}
class Consumer extends Thread {
    produceConsume obj;
    Consumer(produceConsume obj) {
        this.obj = obj;
    }
    public void run() {
        for (int i = 0; i <=5; i++) {
            obj.consume();
        }
    }
}
class withITC_20BRS1205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        produceConsume obj = new produceConsume();
        Producer prod = new Producer(obj);
        prod.start();
        Consumer cons = new Consumer(obj);
        cons.start();
    }
}