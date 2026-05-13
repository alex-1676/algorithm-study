package Inflearn_study.array;

import java.util.*;

public class Main4 {
    public int solution (String first , String second) {
        int[] firstAry = Arrays.stream(first.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondAry = Arrays.stream(second.split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for(int i = 0 ; i < firstAry[0] ; i++) {
            int standard = 0;
            for(int j = i ; j < firstAry[0] ; j++) {
                standard += secondAry[j];
                if(standard == firstAry[1]) {
                    result++;
                    break;
                }

            }
        }
        return result;
    }
    public static void main(String[] args) {
        Main4 m = new Main4();
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        System.out.println(m.solution(first , second));
    }
}
