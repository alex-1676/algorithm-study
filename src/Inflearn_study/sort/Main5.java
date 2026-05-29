package Inflearn_study.sort;
import java.io.*;
import java.util.*;

public class Main5 {
    public String solution (int size , String str) {
        int[] nums = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();


        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size - i - 1 ; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }else if(nums[j] != 0 && nums[j] == nums[j+1]) {
                    return "D";
                }
            }
        }
        return "U";
    }
    public static void main (String[] args) throws Exception {
        Main5 m = new Main5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(m.solution(size , str));
    }
}
