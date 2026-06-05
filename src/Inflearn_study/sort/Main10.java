package Inflearn_study.sort;
import java.util.*;
import java.io.*;

public class Main10 {
    public int solution (String str , String str2) {
        int[] standard = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums = Arrays.stream(str2.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nums);
        int size = standard[0];
        int instant = standard[1];
        int left = 1;
        int right = nums[nums.length-1] - nums[0];
        int startNum = nums[0];
        while(left <= right) {
            int mid = (left + right) / 2;
            int cnt =  0;
            int val = 0;
            for(int i = 0 ; i < size-1 ; i++) {
                val += nums[i+1] - nums[i];
                if(val  > mid) {
                    cnt++;
                    i--;
                    val = 0;
                }
            }
            if(cnt >instant) {
                left  = mid + 1;
            }else{
                right = mid;
            }
        }
        return right;
    }
    public static void main (String[] args)throws Exception {
        Main10 m = new Main10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();
        System.out.println(m.solution(str, str2));
    }
}
