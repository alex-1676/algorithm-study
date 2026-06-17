package Inflearn_study.dfs;
import java.io.*;
import java.util.*;

public class Practice2 {
    static int num;

    public void dfs(int index) {
        if (index == num) {
            System.out.print(num);
        }else if( index > num ){
            return;
        }else {
            System.out.print(index + " ");
        }
        dfs(index + 1);

    }
    public static void main(String[] args) throws Exception{
        Practice2 p = new Practice2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());

        p.dfs(1);

    }
}
