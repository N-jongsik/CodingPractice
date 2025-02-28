import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(st.nextToken());
        String x = sb.reverse().toString();

        sb = new StringBuilder();
        sb.append(st.nextToken());
        String y = sb.reverse().toString();

        sb = new StringBuilder();
        sb.append(Integer.parseInt(x)+Integer.parseInt(y));
        String result = sb.reverse().toString();
        System.out.println(Integer.parseInt(result));
    }
}
