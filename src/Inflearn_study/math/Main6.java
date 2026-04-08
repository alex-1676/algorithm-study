package Inflearn_study.math;

import java.util.*;

public class Main6 {

    public boolean isPrime (int n) {
        if(n < 2) return false;
        int sqrt = (int) Math.sqrt(n);

        for(int i = 2 ; i <= sqrt ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int change (String str) {
        int left = str.length()-1;
        int right = 0;
        char temp;
        char[] chs = str.toCharArray();
       while(left > right) {
            temp = chs[left];
            chs[left] = chs[right];
            chs[right] = temp;
            left--;
            right++;
       }
       int exam_prime = Integer.parseInt(new String(chs));
       if(isPrime(exam_prime)) {
        return exam_prime;
       }
       return 0;
    }
    public List<Integer> solution (String num_str, int cnt) {
        List<Integer> result = new ArrayList<>();

        String[] strs = num_str.split(" ");
       for(int i = 0 ; i < cnt ; i++) {
           int prime = change(strs[i]);
           if(prime != 0) {
               result.add(prime);
           }
       }
       return result;
    }

    public static void main (String[] args) {
        Main6 m = new Main6();
        Scanner in = new Scanner (System.in);
        int cnt = in.nextInt();
        in.nextLine();
        String num_str = in.nextLine();
        for(int i : m.solution(num_str , cnt)) {
            System.out.print(i + " ");
        }
    }
}
