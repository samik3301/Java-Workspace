import java.io.*;
import java.util.*;
public class File_20BRS1205 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Guest User\\IdeaProjects\\first_program\\src\\ReadContent1.txt"); //where file doesnt exist
            //File file = new File("C:\\Users\\Guest User\\IdeaProjects\\first_program\\src\\ReadContent.txt"); //where file exists
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
