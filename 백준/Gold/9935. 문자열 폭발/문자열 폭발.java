import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String bomb = br.readLine();

        int len = bomb.length();

        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt(i));

            if(sb.length() >= len && sb.substring(sb.length() - len).equals(bomb)){
                sb.delete(sb.length() - len, sb.length());
            }
        }
        if(sb.length() == 0) System.out.println("FRULA");
        else System.out.println(sb.toString());
    }
}
