package refactoring.dfs;

import java.io.*;
import java.util.*;


public class Main4 {
    static int arr[];
    static int size;
    static int target;
    static int coin;

    public int dfs (int sum , int coin) {
        if(sum > target) return target + 1;
        if(sum == target) return coin;


        int result = target + 1;

        for(int i = 0 ; i < size ; i++) {
            result = Math.min( dfs(sum + arr[i] , coin + 1),result);
        }

        return result;
    }

    public static void main(String[] args) throws Exception{
        Main4 m = new Main4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        target= Integer.parseInt(br.readLine());

        int result = m.dfs(0,0);
        System.out.println(result);
    }
}
