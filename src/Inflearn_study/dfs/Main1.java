package Inflearn_study.dfs;
import java.io.*;
import java.util.*;

public class Main1 {
    static int size;
    static int total;
    boolean flag = false;
    static String answer = "NO";
    public void dfs (int level ,int sum ,int[] arr) {
        if(flag) return;
        if(sum > total/2) return;
        if(level == size) {
            if(sum == total / 2) {
                answer = "YES";
                flag = true;
            }
        }else {
            dfs(level + 1 , sum + arr[level] , arr);
            dfs(level + 1 , sum , arr);
        }

    }
    public static void main(String[] args) throws Exception{
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[size];

        for(int i = 0 ; i < size ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        total = Arrays.stream(arr).sum();
        m.dfs(0,0,arr);
        System.out.println(answer);
    }
}
