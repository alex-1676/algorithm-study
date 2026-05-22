package Inflearn_study.stack;

import java.io.*;
import java.util.*;

public class Main6 {
    public int solution (String str) {
        int[] nums = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt = nums[1];
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = nums[0] ; i >= 1 ; i--) {
            deque.push(i);
        }
        int result = 0;

        while (!deque.isEmpty()) {

            for(int i = 0 ; i < cnt-1 ; i++) {
                int temp = deque.pop();
                deque.offerLast(temp);
            }
            result = deque.pop();
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        Main6 m = new Main6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
