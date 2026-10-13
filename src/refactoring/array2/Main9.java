package refactoring.array2;
//9 3
//1 2 3 4 5 6 7 8 9

import java.io.*;
import java.util.*;

public class Main9 {
    public int solution (int[]sac , int[] arr) {
        int size = sac[0];
        int sec = sac[1];

        int left = Arrays.stream(arr).max().getAsInt(); // 9
        int right = Arrays.stream(arr).sum(); // 45
        int mid = 0;
        while(left < right) {
            mid = left + (right - left) / 2;
            int check = 1;
            int sum = 0;
            for(int i = 0 ; i < size ; i++) {
                sum += arr[i];
                if(sum > mid) {
                    check++;
                    sum = arr[i];
                }
            }
            if(check >sec) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }

        return left;
    }
    public static void main (String[] args) throws Exception{
        Main9 m = new Main9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] sac = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(sac , arr));
    }
}
