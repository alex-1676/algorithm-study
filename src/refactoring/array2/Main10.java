package refactoring.array2;
import java.io.*;
import java.util.*;

public class Main10 {
    public int solution (int[] any , int[] arr) {
        int size = any[0];
        int cnt = any[1];

        Arrays.sort(arr);

        int left = 1;
        int right = arr[size - 1] - arr[0];
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) /2;
            int sum = 0 ;
            int length = 1;
            for(int i = 0 ; i < size - 1; i++) {
                sum += arr[i+1] - arr[i];
                if(sum >= mid) {
                    length++;
                    sum = 0;
                }
            }
            if(length >= cnt) {
                result = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main (String[] args) throws Exception{
        Main10 m = new Main10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] any = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(m.solution(any , arr));
    }
}
