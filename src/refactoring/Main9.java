package refactoring;
import java.io.*;
import java.util.*;

public class Main9 {
    public int solution (String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        int result = Integer.parseInt(sb.toString());
        return result;
    }
    public static void main (String[] args) throws Exception{
        Main9 m = new Main9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
