package Inflearn_study.dfs;
import java.io.*;
import java.util.*;

public class Practice3 {
    static StringBuilder sb = new StringBuilder();

    public void dfs (int n) {
        if(n == 0) return;
        int num2 = n % 2;
        sb.append(num2);
        dfs(n / 2);
    }
    public static void main (String[] args) throws Exception{
        Practice3 p = new Practice3();
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        p.dfs(num);
        System.out.println(sb.reverse().toString());
    }
}
