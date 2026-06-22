package Inflearn_study.dfs;
import java.io.*;
import java.util.*;

public class Main3 {
    static int size;
    static int maxTime;
    static int sum;
    static int[][] nums;

    public void dfs (int index , int time , int sum2) {
        if(maxTime < time) {
            return;
        }
        if(index == size) {
            sum =  Math.max(sum , sum2);
            return;
        }
        dfs(index + 1 , time + nums[index][1] , sum2 + nums[index][0]);
        dfs(index + 1 , time , sum2);
    }
    public static void main (String[] args) throws Exception{
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] ss = s.split(" ");
        int[] standard = Arrays.stream(ss).mapToInt(Integer::parseInt).toArray();
        size = standard[0];
        maxTime = standard[1];
        nums = new int[size][2];
        for(int i = 0 ; i < size ; i++) {
            String str = br.readLine();
            String[] strs = str.split(" ");
            nums[i][0] = Integer.parseInt(strs[0]);
            nums [i][1] = Integer.parseInt(strs[1]);
        }
        m.dfs(0 , 0 , 0);
        System.out.println(sum);
    }
}
