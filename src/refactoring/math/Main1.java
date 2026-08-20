package refactoring.math;

import java.io.*;
import java.util.*;

public class Main1 {
    public String solution (int size , String str) {
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ");
        for(int i = 1 ; i < size ; i++) {
            if(arr[i-1] < arr[i]) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) throws Exception{
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(m.solution(size , str));
    }
}
