import java.util.Scanner;

/*
    BAEKJOON 11720번 숫자의 합
    https://www.acmicpc.net/problem/11720
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String str = scanner.next();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
