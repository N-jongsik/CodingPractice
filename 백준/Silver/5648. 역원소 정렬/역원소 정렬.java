import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List<Long> lst = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            long num = sc.nextLong();
            lst.add(reverser(num));
        }

        Collections.sort(lst);

        for(long item : lst){
            System.out.println(item);
        }

    }

    public static long reverser(long num){
        long reversed = 0;

        while(num !=0){
            long digit = num % 10;
            reversed = reversed * 10 + digit;
            num/=10;
        }
        return reversed;
    }
}