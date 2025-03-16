import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  // 큐 크기 N 입력

        Queue<Integer> q = new LinkedList<>();

        while(true){
            int k = Integer.parseInt(br.readLine());

            if(k == -1){  // 종료 조건
                break;
            } else if(k == 0){  // 큐에서 값 제거
                q.poll();
            } else {
                if(q.size() < N){  // 큐의 크기가 N보다 작은 경우에만 추가
                    q.offer(k);
                }
            }
        }

        // 큐의 크기가 0인 경우
        if(q.isEmpty()){
            System.out.println("empty");
        } else {
            // 큐의 값을 출력
            for(int item : q){
                System.out.print(item + " ");
            }
        }
    }
}
