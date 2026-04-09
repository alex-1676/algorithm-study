package Inflearn_study.math;

import java.util.*;

public class Main8_1 {

    public int[] solution (int n , String s) {
        String[] ss = s.split(" ");
        int[] result = new int[n];
        int[] scores = new int[n];
        int rank = 1;
        Integer[] stored = new Integer[n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++) {
            scores[i] = Integer.parseInt(ss[i]);
            stored[i] = scores[i];
        }
        Arrays.sort(stored , Collections.reverseOrder());

        for(int i = 0 ; i < n ; i++) {
            if(!map.containsKey(stored[i])) {
                map.put(stored[i], rank++);
            }
        }
        for(int i = 0 ; i < n ; i++) {
            result[i] = map.get(scores[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        Main8_1 m = new Main8_1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        for(int i : m.solution(n,s)) {
            System.out.print(i + " ");
        }
    }
}
