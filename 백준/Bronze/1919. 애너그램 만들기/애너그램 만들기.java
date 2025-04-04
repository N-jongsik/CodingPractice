import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();

        int [] alphaA = new int[26];
        int [] alphaB = new int[26];

        for(Character ch : a.toCharArray()){
            alphaA[ch-'a'] += 1;
        }

        for(Character ch : b.toCharArray()){
            alphaB[ch-'a'] += 1;
        }

        int result = 0;
        for(int i = 0; i < 26; i++){
            result += Math.abs(alphaA[i] - alphaB[i]);
        }
        System.out.println(result);
    }
}