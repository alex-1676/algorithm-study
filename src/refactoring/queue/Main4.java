package refactoring.queue;
import java.io.*;
import java.util.*;

public class Main4 {
    public static int circulate(int a , int b , char c) {
        switch(c) {
            case '+' : return a + b;
            case '-' : return a - b;
            case '*' : return a * b;
            case '/' : return a / b;
            default : return 0;
        }
    }
    public int solution(String str) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) deque.offerLast(Integer.parseInt(String.valueOf(c)));

            if(!Character.isDigit(c) && deque.size() >= 2) {
                int b = deque.pollLast();
                int a = deque.pollLast();
                int circulated = circulate(a , b , c);
                deque.offerLast(circulated);
            }
        }
        return deque.pollFirst();
    }
    public static void main (String[] args)throws Exception {
        Main4 m = new Main4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
