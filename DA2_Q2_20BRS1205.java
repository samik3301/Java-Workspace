import java.io.*;
import java.util.Scanner;
public class DA2_Q2_20BRS1205 {
    public static long getFileSize(String filename) {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
            System.out.println("File doesn\'t exist");
            return -1;
        }
        return file.length();
    }
    public static void main(String[] args){
        byte[] array = new byte[100];
        try{
            InputStream input = new FileInputStream("/Users/samik/Desktop/Programming/Java/Java_Workspace/src/inputDA2.txt");
            input.read(array);
            String data = new String(array);
            System.out.println("Reading from the file: ");
            System.out.println(data);
            Scanner sc = new Scanner(new FileInputStream(new File("/Users/samik/Desktop/Programming/Java/Java_Workspace/src/inputDA2.txt")));
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

            long size = getFileSize("/Users/samik/Desktop/Programming/Java/Java_Workspace/src/inputDA2.txt");


            //System.out.println("The word count of the given file is : "+count);
            BufferedReader reader = new BufferedReader(new FileReader("/Users/samik/Desktop/Programming/Java/Java_Workspace/src/inputDA2.txt"));

            int lines = 0;
            while (reader.readLine() != null)
                lines++;
            reader.close();
            //System.out.println("The number of lines in the file are: "+lines);
            input.close();
            FileWriter writer = new FileWriter("/Users/samik/Desktop/Programming/Java/Java_Workspace/src/outputDA2.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("The word count of the given file is : "+count);
            bw.write("\n");
            bw.write("The number of lines in the file are: "+lines);
            bw.write("\n");
            bw.write("The size of the file in bytes is: " + size);
            bw.close();
            //input.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}