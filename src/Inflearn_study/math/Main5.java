package Inflearn_study.math;

import java.util.*;

public class Main5 {

    public int solution(int n) {
        boolean[] isNotPrime = new boolean[n+1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        int cnt = 0;
        for( int i = 2 ; i < n+1 ; i++) {
            if(!isNotPrime[i]) {
                for(int j = i * 2 ; j < n+1 ; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        for(int i = 2 ; i < n+1 ; i++) {
            if(!isNotPrime[i]) {
                cnt++;
            }
        }
       return cnt;

    }

    public static void main(String[] args) {
        Main5 m = new Main5();
        Scanner in = new Scanner(System.in);
        System.out.println(m.solution(in.nextInt()));
    }
}

