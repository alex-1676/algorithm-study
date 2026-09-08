package refactoring.array;
import java.io.*;
import java.util.*;
public class Main3 {
    public int solution (int[] arr1 , int[] arr2) {
        int size = arr1[0];
        int array_size = arr1[1];
        int result = 0;

        for(int i = 0 ; i < array_size ; i++) {
            result += arr2[i];
        }
        int now = result;
        for(int i = 3 ; i < size ; i++) {
            now = now - arr2[i - array_size] + arr2[i];
            result = Math.max(result,now);
        }
        return result;
    }
    public static void main (String[] args) throws Exception{
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(arr1 , arr2));
    }
}
