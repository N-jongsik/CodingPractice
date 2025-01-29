import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String [] lst = new String[N];

        for(int i = 0; i < N; i++){
            lst[i] = br.readLine();
        }

        int result = N;

        for(int i = 0; i < N; i++){

            boolean [] check = new boolean[26];

            for (int j = 0; j < lst[i].length(); j++){
                char ch = lst[i].charAt(j);
                if(check[ch - 'a'] == false){
                    check[ch - 'a'] = true;
                } else if(j > 0 && ch!= lst[i].charAt(j-1)){
                    result -= 1;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}