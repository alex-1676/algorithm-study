package Inflearn_study.dfs;
import java.io.*;
import java.util.*;

public class Main2 {
    static int size = 0;
    static int maxValue = 0;
    static int result = 0;
    public void dfs (int[] weight , int index , int sum) {
        if(sum > maxValue) return;
        if(index == size) {
            if(sum > result) {
                result = sum;
            }
            return;
        };

        dfs(weight, index + 1, sum);
        dfs(weight, index + 1, sum + weight[index]);
    }
    public static void main(String[] args) throws Exception {
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        size = arr[1];
        maxValue = arr[0];
        int[] weight = new int[size];
        for(int i = 0 ; i < size ; i++) {
            weight[i] = Integer.parseInt(br.readLine());
        }
        m.dfs(weight , 0 , 0);
        System.out.println(result);
    }
}
