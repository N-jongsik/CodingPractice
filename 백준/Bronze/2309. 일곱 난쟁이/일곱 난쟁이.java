import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] lst = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            lst[i] = Integer.parseInt(br.readLine());
            sum += lst[i];
        }

        Arrays.sort(lst);
        
        int fake1 = -1, fake2 = -1;
        
        outerLoop:
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (lst[i] + lst[j]) == 100) {
                    fake1 = i;
                    fake2 = j;
                    break outerLoop;  // 전체 루프 종료
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i != fake1 && i != fake2) {
                System.out.println(lst[i]);
            }
        }
    }
}
