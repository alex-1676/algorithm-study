package Inflearn_study.sort;
import java.util.*;
import java.io.*;

public class Main8 {
    public int solution (int[]first , int[] nums) {

        int searchNum = first[1];
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right)/2;
            if(nums[mid] == searchNum)return mid + 1;

            else if(nums[mid] < searchNum) {
                left = mid + 1;
            }else if(nums[mid] > searchNum) {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        Main8 m = new Main8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        int[] first = Arrays.stream(str1.split(" ")).mapToInt(Integer::parseInt).toArray();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[first[0]];
        for(int i = 0 ; i < first[0]; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        System.out.println(m.solution(first , nums));
    }
}
