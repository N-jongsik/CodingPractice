import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] sensor = new int[N];

        for(int i = 0; i < N; i++){
            sensor[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sensor);

        List<Integer> distance = new ArrayList<>();

        for(int i = 1; i < N; i++){
            distance.add(sensor[i] - sensor[i-1]);
        }

        Collections.sort(distance);

        int sum = 0;

        for(int i = 0; i < N-K; i++){
            sum += distance.get(i);
        }

        System.out.println(sum);
    }
}
