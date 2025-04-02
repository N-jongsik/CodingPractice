import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        List<String> lst = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String serial = br.readLine();

            lst.add(serial);
        }

        Collections.sort(lst, (a,b)->{
            if(a.length() != b.length()){
                return a.length() - b.length();
            }

            int a_sum = getSum(a);
            int b_sum = getSum(b);

            if(a_sum != b_sum){
                return a_sum - b_sum;
            }


            return a.compareTo(b);
        });

        for(String number : lst){
            System.out.println(number);
        }
    }

    public static int getSum(String str){
        int sum = 0;

        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                sum += ch - '0';
            }
        }

        return sum;
    }
}