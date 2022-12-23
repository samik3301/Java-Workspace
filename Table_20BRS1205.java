
class divide_tables{
    synchronized void table1_orders(int n){
        for(int i=1;i<=n;i++){
            System.out.println("The order number, "+i+" is being catered at Table number 1");
            if(i==5){
                break;
            }
        }
    }

    synchronized void table2_orders(int n){
        for(int i=6;i<=n;i++){
            System.out.println("The order number, "+i+" is being catered at Table number 2");
            if(i==10){
                break;
            }
        }
    }

    synchronized void table3_orders(int n){
        for(int i=11;i<=n;i++){
            System.out.println("The order number, "+i+" is being catered at Table number 3");
            if(i==15){
                break;
            }
        }
    }

    synchronized void table4_orders(int n){
        for(int i=16;i<=n;i++){
            System.out.println("The order number, "+i+" is being catered at Table number 4");
        }
    }

}

class Table1 extends Thread{
    divide_tables d1;
    Table1 (divide_tables d1){
        this.d1=d1;
    }
    public void run(){
        d1.table1_orders(20);
    }

}

class Table2 extends Thread{
    divide_tables d2;
    Table2 (divide_tables d2){
        this.d2=d2;
    }
    public void run(){
        d2.table2_orders(20);
    }
}

class Table3 extends Thread{
    divide_tables d3;
    Table3 (divide_tables d3){
        this.d3=d3;
    }
    public void run(){
        d3.table3_orders(20);
    }
}

class Table4 extends Thread{
    divide_tables d4;
    Table4 (divide_tables d4){
        this.d4=d4;
    }
    public void run(){
        d4.table4_orders(20);
    }
}

public class Table_20BRS1205 {
    public static void main(String[] args){
        divide_tables obj = new divide_tables();
        Table1 thd1= new Table1(obj);
        Table2 thd2= new Table2(obj);
        Table3 thd3= new Table3(obj);
        Table4 thd4= new Table4(obj);
        thd1.run();
        thd2.run();
        thd3.run();
        thd4.run();
    }
}
