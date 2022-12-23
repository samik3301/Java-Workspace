import java.util.Scanner;

class StudentAverage_20BRS1205{
    public static double computeAverage(int [] marks){
        int sum = 0;
        double average =0;
        for(int i=0;i<marks.length;i++){
            sum += marks[i];
        }
        average = sum/marks.length;
        return average;
    }
    public static int computeGPA(int [] marks){
        int [] credits = {3,3,3,3,3};
        int creditTotal =0;
        for(int j=0;j<credits.length;j++){
            creditTotal +=credits[j];
        }
        int score= 0;
        int GPA = 0;
        int scoreSum=0;
        for(int i=0;i<marks.length;i++){
            if(marks[i]>=95){
                score =10;
            }
            else if(marks[i]>=90 & marks[i]<95){
                score =9;
            }
            else if(marks[i]>=80 & marks[i]<90){
                score =8;
            }
            else if(marks[i]>=70 & marks[i]<80){
                score =7;
            }
            else if(marks[i]>=60 & marks[i]<70){
                score =6;
            }
            else if(marks[i]>=50 & marks[i]<60){
                score=5;
            }
            else{
                score =0;
            }
            scoreSum += score;
        }
        GPA = scoreSum*credits[0]/(creditTotal);
        return GPA;
    }

}


public class StudentDetails_20BRS1205 {

    public static void getMarks(int[] marks){
        Scanner s = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the marks of course "+(i+1)+" : ");
            marks[i]= s.nextInt();
        }

    }
    public static void main(String[] args){
        int [] marks = new int[5];

        //StudentDetails_20BRS1205 obj = new StudentDetails_20BRS1205();
        getMarks(marks);
        double average = StudentAverage_20BRS1205.computeAverage(marks);
        System.out.println("The student average is: "+average);

        int studentGPA= StudentAverage_20BRS1205.computeGPA(marks);
        System.out.println("The student GPA based on the marks and credit score is: "+studentGPA);

    }


}

