package Inflearn_study.math;

import java.util.*;

public class Main4 {
    public int[] solution (int cnt) {
        int[] result = new int[cnt];
        result[0] = 1;
        if(cnt >=2) result[1] = 1;
        for(int i = 2 ; i < cnt ; i++) {
            result[i] = result[i-2] + result[i-1];
        }
        return result;
    }

    public static void main (String[] args) {
        Main4 m = new Main4();
        Scanner in = new Scanner (System.in);
        int cnt = in.nextInt();
        for(int i : m.solution(cnt)) {
            System.out.print(i + " ");
        }
    }
}
