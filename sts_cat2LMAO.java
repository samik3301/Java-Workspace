import java.util.Scanner;

public class sts_cat2LMAO {
    public static String swap(String s){
        if (s == null || s.isEmpty())
            return s;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length - 1; i += 2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        return new String(ch);
    }
    public static void value(String f){
        String new_str= swap(f);
        char ch;
        for(int i=0;i<new_str.length();i++){
            int ascii = 122-(int)new_str.charAt(i)+97; //ascii of z = 122 , ascii of a = 97
            ch = (char) ascii;
            System.out.print(ch);
        }
    }
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            value(s);
    }
}


