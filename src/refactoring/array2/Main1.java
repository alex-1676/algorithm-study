package refactoring.array2;
import java.io.*;
import java.util.*;

public class Main1 {
    public String solution(int size , int[] arr) {

        for(int i = 0 ; i < size ; i++) {
            int now = arr[i];
            int index = i;
            for(int j = i ; j < size ; j++) {
                if(now > arr[j]) index = j;
            }
            if(index != i) {
                int temp = arr[i];
                arr[i]  = arr[index];
                arr[index] = temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < size ; i++) {
            sb.append(arr[i]).append(" ");
        }

        return sb.toString().trim();

    }
    public static void main(String[] args) throws Exception{
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(size , arr));
    }
}
