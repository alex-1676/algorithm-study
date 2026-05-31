package Inflearn_study.sort;
import java.util.*;
import java.io.*;

public class Main6 {
    public String solution  (int size , String str) {
        int[] ary = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] copy = ary.clone();
        Arrays.sort(copy);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < size ; i++) {
            if(ary[i] != copy[i]) {
                sb.append(i+1).append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main (String[] args) throws Exception {
        Main6 m = new Main6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(m.solution(size , str));
    }
}



