import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num % 42;
        }

        for (int item : arr) {
            hash.add(item);
        }
        System.out.println(hash.size());

    }
}