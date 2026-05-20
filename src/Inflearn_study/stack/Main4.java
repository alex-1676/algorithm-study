package Inflearn_study.stack;

import java.util.*;
import java.io.*;

public class Main4 {
    public int calculation(int first, char sign, int second) {
        if(sign == '+') {
            return first + second;
        }else if(sign == '-') {
            return first - second;
        }else if(sign == '*') {
            return first * second;
        }else if(sign == '/') {
            return first / second;
        }
        return 0;
    }

    public int solution(String str) {
        char[] chars = str.toCharArray();
        Deque<Integer> deque = new ArrayDeque<>();

        for (char c : chars) {
            if (Character.isDigit(c)) {
                deque.push(c - '0');
            } else {
                // 앞뒤 주의
                    int second = deque.pollFirst();
                    int first = deque.pollFirst();
                    int next = this.calculation(first , c , second);
                    deque.push(next);
            }
        }
        return deque.pop();
    }

    public static void main(String[] args) throws Exception {
        Main4 m = new Main4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
