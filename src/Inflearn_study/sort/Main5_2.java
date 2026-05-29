package Inflearn_study.sort;
import java.util.*;
import java.io.*;

public class Main5_2 {
    public String solution (int size , String nums) {
        int[] ary = Arrays.stream(nums.split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = new HashSet<>();

        for(int a : ary) {
            if(!set.add(a)) return "D";
        }
        return "U";
    }
    public static void main (String[] args) throws Exception {
        Main5_2 m = new Main5_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        System.out.println(m.solution(size , nums));
    }
}
