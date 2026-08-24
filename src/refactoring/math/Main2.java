package refactoring.math;
import java.io.*;
import java.util.*;

public class Main2 {
    public int solution (int size , String str) {
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int standard = arr[0];
        int result = 1;

        for(int i = 1 ; i < size ; i++) {
             if(arr[i] > standard) {
                 result++;
                 standard = arr[i];
             }
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(m.solution(size , str));
    }
}
