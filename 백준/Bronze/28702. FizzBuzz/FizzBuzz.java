import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 3의 배수 : FIZZ
        // 3의 배수 아니고 5의 배수도 아니면 그냥 출력
        // 5의 배수 : BUZZ
        // 15의 배수 : FIZZBUZZ
        String [] lst = new String[3];
        for(int i = 0; i < 3; i++){
            lst[i] = br.readLine();
        }

        List<Integer> digit = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < 3; i++){
            if(lst[i].equals("Fizz") || (lst[i].equals("Buzz") || (lst[i].equals("FizzBuzz")))){
                continue;
            } else{
                digit.add(i);
                map.put(i,Integer.parseInt(lst[i]));
            }   
        }
        
        int k = 0;
        int num = 0;

        for(int i : digit){
            k=i;
            num = map.get(i);
        }

        switch(k){
            case 0:
                if((num+3)%15 == 0){
                    System.out.println("FizzBuzz");
                } else if((num+3)%3 == 0){
                    System.out.println("Fizz");
                } else if((num+3)%5 == 0){
                    System.out.println("Buzz");
                } else{
                    System.out.println(num+3);
                }
            break;
            case 1:
            if((num+2)%15 == 0){
                System.out.println("FizzBuzz");
            } else if((num+2)%3 == 0){
                System.out.println("Fizz");
            } else if((num+2)%5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(num+2);
            }
            break;
            case 2:
            if((num+1)%15 == 0){
                System.out.println("FizzBuzz");
            } else if((num+1)%3 == 0){
                System.out.println("Fizz");
            } else if((num+1)%5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(num+1);
            }
        }
    }
}