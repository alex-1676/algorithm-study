package Inflearn_study.stack;
import java.util.*;
import java.io.*;

public class Main5 {
    public int solution (String scope) {
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = scope.toCharArray();
        int open = 0;
        int count = 0;
        for(int i = 0 ; i < chars.length ; i++) {
            if(chars[i] == '(') {
                open++;
                deque.push(chars[i]);
            }else if(chars[i] == ')') {
                if(deque.peek() == '(') {
                    open--;
                    count += open;
                    deque.push(chars[i]);
                }else {
                    count += 1;
                    open--;
                    deque.push(chars[i]);
                }
            }
        }
        return count;
    }
    public static void main (String[] args) throws Exception {
        Main5 m = new  Main5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String scope = br.readLine();
        System.out.println(m.solution(scope));
    }
}
