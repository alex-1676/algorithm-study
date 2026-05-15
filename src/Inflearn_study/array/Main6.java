package Inflearn_study.array;

import java.util.*;

public class Main6 {
    public int solution (String str , String nums) {
        int[] m = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = Arrays.stream(nums.split(" ")).mapToInt(Integer::parseInt).toArray();

        int lt = 0;
        int rt = 0;
        int length = 0;
        int result = 0;
        int cnt = m[1];
        while(rt < m[0]) {
            if(numbers[rt] == 1) {
                rt++;
                length++;
            }else if(numbers[rt] == 0 && cnt > 0) {
                cnt --;
                rt++;
                length++;

            }else if(numbers[rt] == 0 && cnt == 0) {

                if(numbers[lt] == 0) {
                    length--;
                    lt++;
                    cnt++;
                }else if(numbers[lt] == 1) {
                    lt++;
                    length--;
                }
            }
            if(result < length) result = length;
        }
        return result;
    }
    public static void main (String[] args) {
        Main6 m = new Main6();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String nums = in.nextLine();
        System.out.println(m.solution(str , nums));
    }
}
