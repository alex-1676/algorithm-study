package refactoring.array2;

import java.io.*;
import java.util.*;

public class Main6 {
    public String solution (int size , int[] arr) {
        int[] arr2 = Arrays.stream(arr).sorted().toArray();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < size ; i++) {
            if(arr[i] != arr2[i]) {
                sb.append(i+1).append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[]args)throws Exception{
        Main6 m = new Main6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(m.solution(size , arr));
    }
}
