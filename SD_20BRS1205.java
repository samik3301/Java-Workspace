import java.util.Scanner;

public class SD_20BRS1205 {
    static int flag = 202201;
    static class studentDetails_20BRS1205{
        String StudentName;
        int Regnum;
        String StudentDepartment;
        String StudentDOB;
        String StudentEmail;
        String StudentMobileNum;

        studentDetails_20BRS1205(String StudentName, String StudentDepartment, String StudentDOB, String StudentEmail, String StudentMobileNum){
            this.StudentName = StudentName;
            this.Regnum = flag++;
            this.StudentDepartment= StudentDepartment;
            this.StudentDOB = StudentDOB;
            this.StudentEmail = StudentEmail;
            this.StudentMobileNum = StudentMobileNum;
        }
        void display(){
            System.out.println("The Student name is : "+StudentName);
            System.out.println("The Student registration number is : "+Regnum);
            System.out.println("The Student department is: "+StudentDepartment);
            System.out.println("The Student date of birth is: "+StudentDOB);
            System.out.println("The Student email is: "+StudentEmail);
            System.out.println("The Student Mobile number is: "+StudentMobileNum);
            System.out.println(" ");
        }
    }
    public static void main(String[] args){

        studentDetails_20BRS1205 s1 = new studentDetails_20BRS1205("Samik","BRS","30/08/2001","samik.saraswat2020@vitstudent.ac.in","9872618921");
        studentDetails_20BRS1205 s2 = new studentDetails_20BRS1205("Abdul","BRS","13/08/2002","abdul.aziz2020@vitstudent.ac.in","9198291829");
        studentDetails_20BRS1205 s3 = new studentDetails_20BRS1205("Abhinav","BRS","29/10/2002","abhinav.bhatia2020@vitstudent.ac.in","9312783192");
        studentDetails_20BRS1205 s4 = new studentDetails_20BRS1205("Metul","BRS","07/08/2002","metul.prabhu2020@vitstudent.ac.in","9189123722");
        studentDetails_20BRS1205 s5 = new studentDetails_20BRS1205("Aman","BRS","24/09/2001","aman.gupta2020@vitstudent.ac.in","9182197323");
        //displaying details
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();

    }

}
