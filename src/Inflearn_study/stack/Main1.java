package Inflearn_study.stack;
import java.util.*;
import java.io.*;

public class Main1 {
    public String solution (String str) {
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = str.toCharArray();
        if(chars[0] == ')') {
            return "NO";
        }
        deque.offerFirst(chars[0]);
        for(int i = 1 ; i < chars.length ; i++) {
            if(chars[i] == '(') {
                deque.offerFirst(chars[i]);
            }
            else if(chars[i] == ')' && !deque.isEmpty()) {
                deque.poll();
            } else {
                return "NO";
            }
        }
       return deque.isEmpty() ? "YES" : "NO";
    }
    public static void main (String[] args) throws Exception {
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
