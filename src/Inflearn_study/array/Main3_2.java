package Inflearn_study.array;

import java.util.*;

public class Main3_2 {
    public int solution (String first , String second) {
        int[] standard = Arrays.stream(first.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums = Arrays.stream(second.split(" ")).mapToInt(Integer::parseInt).toArray();
        int size = standard[0]-standard[1]+1;
        int cnt = standard[1];
        int result = 0;
        int number = 0;
        for(int i = 0 ; i < standard[1] ; i++) {
            number += nums[i];
        }
        result = number;
        for(int i = 1 ; i < size ; i++) {
            number = number+nums[i+cnt-1]-nums[i-1];
            if(result < number) result = number;
        }
        return result;
    }
    public static void main (String[] args) {
        Main3_2 m = new  Main3_2();
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        System.out.println(m.solution(first , second));
    }
}
