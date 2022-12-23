import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class PhonebookMap_20BRS1205 {
    public static void main(String[] args){
        Map<String,String> phonebookmap= new HashMap<>();
        File file = new File("/Users/samik/Desktop/Programming/Java/Java_Workspace/src/phonebook.txt");
        BufferedReader br = null;
        try
        {
            //File file = new File("/Users/samik/Desktop/Programming/Java/Java_Workspace/src/phonebook.txt");
            br = new BufferedReader(new FileReader(file));
            String str;
            while ((str = br.readLine()) != null)
            {
                String[] parts = str.split(" ");
                String name = parts[0].trim();
                String number = parts[1].trim();
                if (!name.equals("") && !number.equals(""))
                {
                    phonebookmap.put(name, number);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Some exception raised");
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close(); //closing the bufferedreader
                }
                catch (Exception c)
                {
                    c.printStackTrace();
                }
            }
        }

        String repeat_menu;
        System.out.println("Welcome to the phonebook :D");
        do{
            System.out.println("1. Look up a phone number.\n" +
                    "2. Add or change a phone number.\n" +
                    "3. Remove an entry from your phone directory. \n" +
                    "4. List the entire phone directory.\n" +
                    "5. Exit from the program.");
            System.out.println("Enter your choice [1-4] for the phonebook operations and 5 to exit: ");
            String choice;
            Scanner s = new Scanner(System.in);
            choice = s.nextLine();
            Iterator hmIterator = phonebookmap.entrySet().iterator();

            if(choice.equals("1")){
                String lookup_number;
                Scanner s3 = new Scanner(System.in);
                System.out.println("Enter the number you want to search from the phonebook: ");
                lookup_number= s3.nextLine();
                while (hmIterator.hasNext()) {

                    Map.Entry m = (Map.Entry)hmIterator.next();

                    if(m.getValue().equals(lookup_number)){
                        System.out.println("The phone number has been found in the phonebook and it is : "+m.getValue()+" with the name: "+m.getKey());
                    }
                    /*
                    else {
                        //System.out.println("Phone number wasnt found in the phonebook!");
                    }*/
                }
            }
            else if(choice.equals("2")){
                Scanner s4 = new Scanner(System.in);
                System.out.println("Enter the name you want to add/replace in the phonebook: ");
                String new_name = s4.nextLine();
                System.out.println("Enter the phone number associated with the above entered name you want to add/replace in the phonebook: ");
                String new_number = s4.nextLine();
                phonebookmap.put(new_name,new_number);
            }
            else if(choice.equals("3")){
                String remove_name;
                Scanner s5= new Scanner(System.in);
                System.out.println("Enter the name of the record you want to remove from the phonebook: ");
                remove_name=s5.nextLine();
                phonebookmap.remove(remove_name);
            }
            else if(choice.equals("4")){
                for (Map.Entry<String, String> m : phonebookmap.entrySet())
                {
                    System.out.println(m.getKey() + "->" + m.getValue());
                }
            }
            else if (choice.equals("5")) {
                System.exit(0); //process finished with exit code 0
            }
            else{
                System.out.println("Invalid choice, please enter a valid choice!");
            }
            //String repeat_menu;
            Scanner s2 = new Scanner(System.in);
            System.out.println("Enter Y to go back to the menu and enter N to exit loop");
            repeat_menu=s2.nextLine();

        }while(repeat_menu.equalsIgnoreCase("Y"));
        //writing onto the file
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file)))
        {
            for (Map.Entry<String, String> entry : phonebookmap.entrySet())
            {
                bf.write(entry.getKey() + " " + entry.getValue());
                bf.newLine();
            }
            bf.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
