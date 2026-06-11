package Inflearn_study.sort;
import java.util.*;
import java.io.*;


public class Main10 {
    public int solution (int[] stand , int[] far) {
        Arrays.sort(far);
        int left = 1;
        int right  = far[far.length-1] - far[0];
        int result = 0;
        while(left <= right) {
            int start = far[0];
            int mid = left + (right - left) / 2;
            int pus = 1;
            for(int i = 0 ; i < far.length ; i++) {
                if(far[i] - start >= mid) {
                    pus++;
                    start = far[i];
                    i++;
                }
            }
            if(pus >= stand[1]) {
                result = mid;
                left = mid + 1;
            }else if (pus < stand[1]) {
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        Main10 m = new Main10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();

        int[] stand = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] far = Arrays.stream(str2.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(stand , far));
    }
}
