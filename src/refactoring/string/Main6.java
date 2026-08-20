package refactoring.string;
import java.io.*;
import java.util.*;

public class Main6 {
    public String solution (String str) {
        char[] ch = str.toCharArray();

        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char c : ch) {
            if(!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        Main6 m = new Main6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
