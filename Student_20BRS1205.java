public class Student_20BRS1205{
    int rollno;
    String name;
    float fee;
    Student_20BRS1205(int rollno,String name,float fee){
        this.rollno=rollno; this.name=name; this.fee=fee;
    }
    void display() {
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class TestThis{
    public static void main(String args[]){
        Student_20BRS1205 s1=new Student_20BRS1205(111,"Bala",5000f);
        Student_20BRS1205 s2=new Student_20BRS1205(112,"Sundaram",6000f);
        s1.display();
        s2.display();
    }
}
