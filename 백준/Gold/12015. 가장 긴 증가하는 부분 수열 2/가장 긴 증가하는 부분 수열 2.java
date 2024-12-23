import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] lst = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> lis = new ArrayList<>();

        for(int i = 0; i<N; i++){
            int pos = Collections.binarySearch(lis,lst[i]);
            if(pos < 0){
                pos = -(pos+1);
            }
            if(lis.size() == pos){
                lis.add(lst[i]);
            }else{
                lis.set(pos,lst[i]);
            }
        }
        System.out.println(lis.size());
    }
}