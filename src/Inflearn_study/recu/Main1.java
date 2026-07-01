package Inflearn_study.recu;
import java.io.*;
import java.util.*;

public class Main1 {
    public int dfs (int first , int second) {
        if(first == second || second == 0) {
            return 1;
        }
        return dfs(first -1 , second -1) + dfs(first -1 , second);
    }
    public static void main (String[] args) throws Exception {
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        System.out.println(m.dfs(first, second));
    }
}
