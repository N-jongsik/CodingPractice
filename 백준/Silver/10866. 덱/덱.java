import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력 최적화를 위해 사용

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "front":
                    sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
                    break;

                case "back":
                    sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
                    break;

                case "size":
                    sb.append(dq.size()).append("\n");
                    break;

                case "empty":
                    sb.append(dq.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "pop_front":
                    sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
                    break;

                case "pop_back":
                    sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb.toString()); // 한 번에 출력하여 성능 향상
    }
}
