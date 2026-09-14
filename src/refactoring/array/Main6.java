package refactoring.array;
import java.io.*;
import java.util.*;
//14 2
//1 1 0 0 1 1 0 1 1 0 1 1 0 1
public class Main6 {
    public int solution(int[] arr , int[] arr2) {
        int size = arr[0];
        int standard = arr[1];
        int result = 0;

        int left = 0;
        int right = 0;
        int zero = 0;


        for(int i = 0 ; i < size ; i++) {
            right++;

            if(arr2[i] ==0) {
                zero++;
            }
            if(zero > standard) {

                while(arr2[left] != 0) {
                    left++;
                }
                zero--;
                left = left + 1;
            }
            result = Math.max(result , right - left);

        }
        return result;

    }
    public static void main(String[] args) throws Exception{
        Main6 m =new Main6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(m.solution(arr , arr2));
    }
}
