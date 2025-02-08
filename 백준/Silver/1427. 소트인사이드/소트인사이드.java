import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int k = str.length();
        int N = Integer.parseInt(str);
        Integer[] lst = new Integer[k];  // Integer 배열로 선언

        // 자릿수 분리
        for (int i = 0; i < k; i++) {
            lst[i] = N % 10;  // N의 마지막 자릿수를 lst에 저장
            N /= 10;  // 마지막 자릿수를 제외한 나머지 숫자
        }

        // 내림차순 정렬
        Arrays.sort(lst, Collections.reverseOrder());

        // 결과 출력
        for (int item : lst) {
            System.out.print(item);
        }
    }
}
