import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WritingOnFile_20BRS1205 {
    public static void main(String[] args){
        try{
            File f = new File("C:\\Users\\Guest User\\IdeaProjects\\first_program\\src\\input.txt");
            Scanner s = new Scanner(f);
            int count_word=0;
            int count_sentence=0;
            int count_byte=0;
            int count_wordswithJ=0;
            while (s.hasNextLine()) {
                String str = s.nextLine();
                count_byte += str.length();
                String[] words = str.split(" ");
                count_word += words.length;
                for (String word : words) {
                    if (word.contains(".") ||
                            word.contains("?") || word.contains("!")) {
                        count_sentence++;
                    }
                    if (word.startsWith("J")||word.startsWith("j")) {
                        count_wordswithJ++;
                    }
                }
            }
            FileWriter w= new FileWriter("C:\\Users\\Guest User\\IdeaProjects\\first_program\\src\\output.txt");
            w.write("The byte count of the text file input is: "+count_byte);
            w.write("\n");
            w.write("The word count of the text file input is: "+count_word);
            w.write("\n");
            w.write("The sentence count of the text file input is: "+count_sentence);
            w.write("\n");
            w.write("The count of the words starting with J in input file is: "+count_wordswithJ);
            w.close();
            File f1 = new File("C:\\Users\\Guest User\\IdeaProjects\\first_program\\src\\output.txt");
            Scanner s1 = new Scanner(f1);
            while(s1.hasNextLine()){
                String str2 = s1.nextLine();
                System.out.println(str2);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
