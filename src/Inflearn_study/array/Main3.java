package Inflearn_study.array;

import java.util.*;

public class Main3 {
    public int solution (String first , String second) {
        int[] standard = Arrays.stream(first.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums = Arrays.stream(second.split(" ")).mapToInt(Integer::parseInt).toArray();
        int size = standard[0] -standard[1] + 1;
        int cnt = standard[1];
        int result = 0;
        for(int i = 0 ; i < size ; i++) {
            int sum = 0;
            for(int j = i ; j < i + cnt ; j++) {
                sum += nums[j];
            }
            if(sum > result) result = sum;
        }
        return result;
    }
    public static void main (String[] args) {
        Main3 m = new Main3();
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        System.out.println(m.solution(first , second));
    }
}
