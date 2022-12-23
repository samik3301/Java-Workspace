class printTable{
    synchronized public void print(int n){
        try{
            //int count=0;
            for(int i=1;i<=10;i++){
                System.out.println(n+"X"+i+"="+(n*i));
            }
            System.out.println();
        }
        catch (Exception e){
            System.out.println("Some exception is caught!");
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread{
    printTable p1;
    Thread2(printTable p1){
        this.p1= p1;
    }
    public void run(){
        p1.print(2);
    }
}

class Thread3 extends Thread{
    printTable p2;
    Thread3(printTable p2){
        this.p2= p2;
    }
    public void run(){
        p2.print(3);
    }
}

class Thread5 extends Thread{
    printTable p3;
    Thread5(printTable p3){
        this.p3= p3;
    }
    public void run(){
        p3.print(5);
    }
}

public class TableUsingThreads_20BRS1205 {
    public static void main(String[] args){
        printTable obj = new printTable();
        Thread2 t1= new Thread2(obj);
        Thread3 t2= new Thread3(obj);
        Thread5 t3= new Thread5(obj);
        t1.start();
        t2.start();
        t3.start();
    }
}
