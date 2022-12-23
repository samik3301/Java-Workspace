import java.io.*;
import java.util.Scanner;

public class WordsAndSentences_20BRS1205 {
    public static void main(String[] args){
        byte[] array = new byte[100];
        try{

            InputStream input = new FileInputStream("C:\\Users\\Guest User\\IdeaProjects\\first_program\\src\\input.txt");
            input.read(array);
            String data = new String(array);
            System.out.println("Reading from the file: ");
            System.out.println(data);

            Scanner sc = new Scanner(new FileInputStream(new File("C:\\Users\\Guest User\\IdeaProjects\\first_program\\src\\input.txt")));
            int count = 0;
            while (sc.hasNext()) {

                String[] s = sc.next().split("d*[.@:=#-]");

                for (int i = 0; i < s.length; i++) {
                    if (!s[i].isEmpty()){
                        //System.out.println(s[i]);
                        count++;
                    }
                }
            }
            System.out.println("The word count of the given file is : "+count);

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Guest User\\IdeaProjects\\first_program\\src\\input.txt"));
            int lines = 0;
            while (reader.readLine() != null)
                lines++;
            reader.close();
            System.out.println("The number of lines in the file are: "+lines);
            input.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
