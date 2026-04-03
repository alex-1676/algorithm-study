package Inflearn_study.math;

import java.util.*;

public class Main2 {

    public int solution (List<Integer>list) {
        int standard = list.get(0);
        int result = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > standard) {
                standard = list.get(i);
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Main2 m = new  Main2();
        Scanner in = new Scanner (System.in);

        int cnt = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < cnt ; i++) {
            list.add(in.nextInt());
        }
        System.out.println(m.solution(list));
    }
}
