package Inflearn_study.sort;
import java.util.*;
import java.io.*;

public class Main9 {

    public int solution (String str , String str2) {
        int[] n = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Arrays.stream(str2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int right = Arrays.stream(arr).sum();
        int left = Arrays.stream(arr).max().getAsInt();
        int size = n[0];
        int cnt = n[1];
        int result = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            int vol = 0;
            int dbdCnt = 1;
            for(int i = 0 ; i < size ; i++) {
                vol += arr[i];
                if(vol > mid) {
                    dbdCnt++;
                    vol = 0;
                    i--;
                }
            }
            if(dbdCnt <= cnt) {
                right = mid;
            }else {
                left = mid+1;
            }

        }
        return left;
    }
    public static void main (String[] args) throws Exception {
        Main9 m = new Main9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();
        System.out.println(m.solution(str , str2));
    }
}
