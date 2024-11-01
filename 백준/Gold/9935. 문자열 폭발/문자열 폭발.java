import java.util.*;

public class Main {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.next();
//        String bomb = sc.next();
//
//        String answer = "";
//        int len = bomb.length();
//
//        while(str.contains(bomb)){
//            int idx = str.indexOf(bomb);
//            str = str.substring(0,idx)+ str.substring(idx+len);
//        }
//        if(str.length() != 0) System.out.println(str);
//        else System.out.println("FRULA");
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String bomb = sc.next();

        StringBuilder sb = new StringBuilder();
        int len = bomb.length();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));  // 문자열을 한 글자씩 StringBuilder에 추가

            // 현재 StringBuilder의 마지막 부분이 bomb와 일치하는지 확인
            if (sb.length() >= len && sb.substring(sb.length() - len).equals(bomb)) {
                sb.delete(sb.length() - len, sb.length());  // 일치하는 부분 제거
            }
        }

        // 남은 문자열이 있으면 출력하고, 없으면 "FRULA" 출력
        if (sb.length() != 0) System.out.println(sb.toString());
        else System.out.println("FRULA");
    }
}