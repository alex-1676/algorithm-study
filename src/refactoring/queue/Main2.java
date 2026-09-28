package refactoring.queue;
import java.io.*;
import java.util.*;

public class Main2 {
    public String solution(char[] arr) {
        Deque<Character> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == '(') {
                deque.offerLast(arr[i]);
                continue;
            }else if(arr[i] == ')') {
                deque.pollLast();
                continue;
            }

            if(deque.isEmpty()) {
                sb.append(arr[i]);
            }

        }
        return sb.toString().trim();
    }
    public static void main(String[] args) throws Exception{
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        System.out.println(m.solution(arr));
    }
}
