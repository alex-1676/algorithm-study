package refactoring.array2;
import java.io.*;
import java.util.*;

public class Main3 {
    public String solution(int size  , int[] arr) {



            for(int i = 1 ; i < size ; i++) {
                int now = arr[i];
                int j;
                for(j = i ; j > 0 ; j--) {
                    if(now < arr[j-1]) {
                        arr[j] = arr[j-1];
                    }else {
                        break;
                    }
                }
                arr[j] = now;
            }


        StringBuilder sb = new StringBuilder();
        for(int a : arr) {
            sb.append(a);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args)throws Exception {
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(size, arr));
    }
}
