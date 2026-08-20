package refactoring.string;
import java.io.*;
import java.util.*;

public class Main5_1 {

    public String solution(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        char[] ch = str.toCharArray();
        for(int i = 0 ; i < ch.length ; i++) {
            if(Character.isAlphabetic(ch[i])) {
                deque.offer(ch[i]);
            }
        }
        for(int i = ch.length-1 ; i >= 0 ; i--) {
            if(Character.isAlphabetic(ch[i])) {
                ch[i] = deque.pollFirst();
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) throws Exception {
        Main5_1 m = new Main5_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
