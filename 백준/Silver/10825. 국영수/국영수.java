import java.io.*;
import java.util.*;

public class Main{

    public static class Class{
        String name;
        int korean;
        int english;
        int math;

        Class(String name, int korean, int english, int math){
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        List<Class> lst = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            lst.add(new Class(name, korean, english, math));

        }
        
        Collections.sort(lst, (a,b) ->{
            if(a.korean == b.korean){
                if(a.english == b.english){
                    if(a.math == b.math){
                        return a.name.compareTo(b.name);
                    }
                    return b.math - a.math;
                }
                return a.english - b.english;
            }
            return b.korean - a.korean;
        });

        for(Class student : lst){
            System.out.println(student.name);
        }
    }

}