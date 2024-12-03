import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int [] arr = new int[26];

        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)-65]++;
        }

        int max = -1;
        int cnt = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
                cnt = 1;
            }else if(max == arr[i]) {
                cnt++;
            }
        }

        if(cnt == 1){
            System.out.println((char)(index+65));
        }else{
            System.out.println("?");
        } 
    }
}