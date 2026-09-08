package refactoring.array;
import java.io.*;
import java.util.*;

public class Main4 {
    public int solution (int[] arr1 , int[] arr2) {
        int result = 0;

        int size = arr1[0];
        int num = arr1[1];
        int index = 0;
        int sum = 0;

        for(int i = 0 ; i < size ; i++) {
            sum += arr2[i];
            if(sum == num) {
                result++;
            }
            if(sum > num) {
                while(sum > num) {
                    sum -= arr2[index++];
                    if(sum == num)result ++;
                }
            }
        }
        return result;
    }
    public static void main (String[] args) throws Exception{
        Main4 m = new Main4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(arr1 , arr2));
    }
}
