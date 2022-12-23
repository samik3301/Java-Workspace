
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class weekDay_20BRS1205 {
    public static void main(String[] args) {

        List<String> list_days = new ArrayList <>();
        Scanner s = new Scanner(System.in);
        System.out.println("Adding all the weekdays to the list except Wednesday");
        for(int i=0;i<6;i++){
            System.out.println("enter the weekday to enter into the list: ");
            list_days.add(s.nextLine());
        }

        System.out.println("The list contains: "+list_days);

        for(String days: list_days){
            System.out.println(days);
        }

        //adding sunday to the beginning of the list and saturday to the ending of the list and tuesday after wednesday
        //0-mon, 1-tues,2-thurs,3-fri,4-sat,5-sun
        //removing  sunday first from the list
        System.out.println("Adding sunday to the first position in the list ");
        list_days.add(0,"Sunday");
        list_days.remove(6);
        System.out.println("the list is : "+list_days);
        System.out.println("Adding saturday to the last position in the list ");
        list_days.add("Saturday");
        list_days.remove(5);
        System.out.println("the list is : "+list_days);
        System.out.println("Adding wednesday to the list ");
        list_days.add(3,"wednesday");

        System.out.println("To check how list looks after last operation: "+list_days);

        list_days.set(0,"Holiday");
        list_days.set(6,"Holiday");

        System.out.println("To check whether the list contains Holidays: "+list_days.contains("Holiday"));
        System.out.println("the list is ,after last operation (removing holidays): "+list_days);
        list_days.remove(0);
        list_days.remove(5);
        System.out.println("the list is ,after last operation (removing holidays): "+list_days);
        //making new list weekdays

        List<String> week_days = new ArrayList <>();
        week_days.addAll(list_days);
        System.out.println("The unsorted  new list is: "+week_days);
        Collections.sort(week_days);
        System.out.println("The sorted  new list is: "+week_days);

        Collections.shuffle(list_days);
        System.out.println("List after shuffling: "+list_days);

        System.out.println("Checking and comparing the 2 lists: ");
        if(list_days.equals(week_days)){
            System.out.println("The lists are equal");
        }
        else{
            System.out.println("the lists aren't equal");
        }

        System.out.println("Sorting the list_days list: ");
        Collections.sort(list_days);
        System.out.println("Sorted list: "+list_days);
        System.out.println("Sorting the week_days list: ");
        Collections.sort(week_days);
        System.out.println("Sorted list: "+week_days);

        System.out.println("Reversing the list_days list: ");
        Collections.reverse(list_days);
        System.out.println("Reversed list: "+list_days);
        System.out.println("Reversing the week_days list: ");
        Collections.reverse(week_days);
        System.out.println("Reversed list: "+week_days);

        System.out.println("Removing all the elements from the list, list_days");
        list_days.clear();

        System.out.println("Checking whether the list is empty or not now: "+list_days.isEmpty());

    }
}
