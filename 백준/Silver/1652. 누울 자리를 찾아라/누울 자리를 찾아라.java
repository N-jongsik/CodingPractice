import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        char [][] lst = new char [N][N];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++){
                lst[i][j] = str.charAt(j);
            }
        }

        int row = 0;

        for(int i = 0; i < N; i++){
            Stack<Character> st = new Stack<>();
            boolean flag = true;

            for(int j = 0; j < N; j++){
                if(lst[i][j] == '.'){
                    st.push(lst[i][j]);
                    if(st.size() == 2 && flag){
                        row ++;
                        flag = false;
                    }
                }else{
                    st.clear();
                    flag = true;
                }
            }
        }

        int col = 0;

        for(int i = 0; i < N; i++){
            Stack<Character> st = new Stack<>();
            boolean flag = true;

            for(int j = 0; j < N; j++){
                if(lst[j][i] == '.'){
                    st.push(lst[j][i]);
                    if(st.size() >= 2 && flag){
                        col ++;
                        flag = false;
                    }
                }else{
                    st.clear();
                    flag = true;
                }
            }
        }

        System.out.println(row + " " + col);
  
    }
}
