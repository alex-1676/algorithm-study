package Inflearn_study.math;

import java.util.*;

public class Main3 {

    public List<Character> solution(int[] a_list,int[] b_list) {
        List<Character> result = new ArrayList<>();

        for( int i = 0 ; i < a_list.length ; i++) {
            if(a_list[i] == b_list[i]) {
                result.add('D');
            }else if (a_list[i] - b_list[i] == 1 || a_list[i] - b_list[i] == -2) {
                result.add('A');
            }else {
                result.add('B');
            }
        }
        return result;
    }

    public static void main (String[] args) {
        Main3 m = new Main3();
        Scanner in = new Scanner (System.in);

        int cnt = in.nextInt();
        int[] a_list = new int[cnt];
        int[] b_list = new int[cnt];

        for(int i = 0 ; i < cnt ; i++) {
            a_list[i] = in.nextInt();
        }
        for(int i  = 0 ; i < cnt ; i++) {
            b_list[i] = in.nextInt();
        }

        for(char c : m.solution(a_list , b_list)) {
            System.out.println(c);
        }
    }
}
