import java.io.*;
import java.util.*;

public class Main {
    public static class Info{
        int age;
        String name;
        
        public Info(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        List<Info> lst = new ArrayList<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            lst.add(new Info(Integer.parseInt(st.nextToken()), st.nextToken()));
            
        }

        Collections.sort(lst, (a,b) -> Integer.compare(a.age, b.age));

        for(Info person : lst){
            sb.append(person.age).append(" ").append(person.name).append("\n");
        }

        System.out.println(sb);
    }
}