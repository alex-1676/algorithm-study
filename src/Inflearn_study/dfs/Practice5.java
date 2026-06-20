package Inflearn_study.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice5 {
    public void dfs (int[] arr , int index , String str) {
        if(index == arr.length) {
            System.out.println(str.trim());
            return;
        }
        dfs(arr , index + 1, str + arr[index]+" ");
        dfs(arr , index + 1, str);
    }
    public static void main (String[] args) throws Exception{
        Practice5 p = new Practice5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for(int i = 0 ; i < num ; i++) {
            arr[i] = i + 1;
        }
        p.dfs(arr , 0 , "");
    }
}
