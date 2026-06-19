package Inflearn_study.dfs;
import java.io.*;
import java.util.*;

public class Practice4 {
    public int dfs (int n) {
        if(n == 1)return 1;
        return n*dfs(n-1);
    }
    public static void main(String[] args) throws Exception{
        Practice4 p = new Practice4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(p.dfs(num));
    }
}
