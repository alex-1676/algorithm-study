package Inflearn_study.stack;

import java.io.*;
import java.util.*;
public class Main2 {
    public String solution (String str) {
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : chars) {
            if(deque.isEmpty() && Character.isAlphabetic(c)) {
                sb.append(c);
            }else if(c == '(') {
                deque.push(c);
            }else if(c == ')' && !deque.isEmpty()) {
                deque.pop();
            }
        }
        return sb.toString();
    }
    public static void main (String[] args) throws Exception {
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
