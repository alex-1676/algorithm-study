package Inflearn_study.stack;

import java.io.*;
import java.util.*;
public class Main8 {
    public int solution (String str , String pats) {
        int[] standard = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] patients = Arrays.stream(pats.split(" ")).mapToInt(Integer::parseInt).toArray();
        int size = standard[0];
        int num = standard[1];
        int result = 0;


        Deque<int[]> deque = new ArrayDeque<>();

        for(int i = 0 ; i < size ; i++){
            int[] priority = new int[2];
            priority[0] = i;
            priority[1] = patients[i];
            deque.offerLast(priority);
        }

        while(true) {
                int[] pri = deque.pop();
                boolean flag = false;
                for(int[] ary : deque) {
                    if(pri[1] < ary[1]) {
                        deque.offerLast(pri);
                        result--;
                        flag = true;
                        break;
                    }
                }
                result++;
                if(!flag && pri[0] == num) return result;
        }
    }
    public static void main (String[] args) throws Exception {
        Main8 m = new Main8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String pats = br.readLine();
        System.out.println(m.solution(str,pats));
    }
}
