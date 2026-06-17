package Inflearn_study.dfs;
import java.io.*;
import java.util.*;

public class Practice1 {
    static StringBuilder sb = new StringBuilder();
    static int num;
    public void dfs (int index) {
        if(index > num ) return;
        sb.append(index).append(" ");
        dfs(index + 1);

    }
    public static void main(String[] args) throws Exception{
        Practice1 p = new Practice1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        p.dfs(1);
        System.out.println(sb.toString().trim());
    }
}
