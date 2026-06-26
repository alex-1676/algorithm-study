package Inflearn_study.dfs;
import java.util.*;
import java.io.*;

public class Main4 {
    static int payBack; //15
    static int result; //15
    static int[] coin;
    static int cnt;
    public void dfs (int sum , int count) {
        if(sum > payBack) return;

        if(sum == payBack) {
            result = Math.min(result , count);
            return;
        }

        for(int i = 0 ; i < cnt ; i++) {
            dfs(sum + coin[i] , count + 1);
        }
    }
    public static void main(String[] args) throws Exception{
        Main4 m = new Main4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        coin = new int[cnt];
        for(int i = 0 ; i < cnt ; i++) {
             coin[i] = Integer.parseInt(st.nextToken());
        }
        payBack = Integer.parseInt(br.readLine());
        result = payBack;
        m.dfs(0,0);
        System.out.println(result);
    }
}
