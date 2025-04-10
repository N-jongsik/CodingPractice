import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        char M = st.nextToken().charAt(0);

        Set<String> set = new HashSet<>();

        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }

        int answer = 0;

        if(M == 'Y'){
            answer = set.size() / 1;
        }else if(M == 'F'){
            answer = set.size() / 2;
        }else{
            answer = set.size() / 3;
        }

        System.out.println(answer);

    }
}
