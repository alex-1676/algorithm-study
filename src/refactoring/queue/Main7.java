package refactoring.queue;
import java.io.*;
import java.util.*;

public class Main7 {
    public String solution (char[] str , char[] courses) {
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : str) {
            deque.offer(c);
        }

        for(char c : courses) {
            if(!deque.isEmpty() && deque.peekFirst() == c) {
                deque.pollFirst();
            }
        }
        if(deque.isEmpty()) return "YES";
        return "NO";
    }
    public static void main(String[] args)throws Exception {
        Main7 m = new Main7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        char[] courses = br.readLine().toCharArray();
        System.out.println(m.solution(str , courses));
    }
}
