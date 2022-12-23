public class JQ_20BRS1205 {
    static int studentCount;
    static public class JavaQuiz_20BRS1205{
        String StudentName;
        String StudentRegNum;
        String StudentEmailID;
        String StudentMobileNum;

        JavaQuiz_20BRS1205(String StudentName,String StudentRegNum,String StudentEmailID,String StudentMobileNum){
            this.StudentName= StudentName;
            this.StudentRegNum=StudentRegNum;
            this.StudentEmailID= StudentEmailID;
            this.StudentMobileNum= StudentMobileNum;
            studentCount++;
        }
        void display(){
            System.out.println("The Student name is : "+StudentName);
            System.out.println("The Student registration number is : "+StudentRegNum);
            System.out.println("The Student email is: "+StudentEmailID);
            System.out.println("The Student Mobile number is: "+StudentMobileNum);
            System.out.println(" ");
        }

    }
    public static void main(String[] args){

        JavaQuiz_20BRS1205 s1= new JavaQuiz_20BRS1205("Samik","20BRS1205","samik.saraswat2020@vitstudent.ac.in","9872618921");
        JavaQuiz_20BRS1205 s2 = new JavaQuiz_20BRS1205("Abdul","20BRS1185","abdul.aziz@vitstudent.ac.in","9198291829");
        JavaQuiz_20BRS1205 s3 = new JavaQuiz_20BRS1205("Abhinav","20BRS1209","abhinav.bhatia2020@vitstudent.ac.in","9312783192");

        s1.display();
        s2.display();
        s3.display();
        System.out.println();
        System.out.println("The total number of students is: "+studentCount);
    }

}
