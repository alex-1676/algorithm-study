package refactoring.queue;
import java.io.*;
import java.util.*;

public class Main1 {
    public String solution (char[] chs) {
        Deque<Character> deque = new ArrayDeque<>();

        for(int i = 0 ; i < chs.length ; i++) {
            if(chs[i] == '(') {
                deque.offerLast(chs[i]);
            }
            if(chs[i] == ')') {
                if(deque.isEmpty()) {
                    return "NO";
                }
                deque.pollLast();
            }
        }
        return deque.isEmpty() ? "YES" : "NO";
    }
    public static void main(String[] args) throws Exception{
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chs = br.readLine().toCharArray();
        System.out.println(m.solution(chs));
    }
}
