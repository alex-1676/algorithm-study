package refactoring.dfs;
import java.io.*;
import java.util.*;

public class Main2 {
    static int[] arr;
    static int max;
    static int size;
    static int result;

    public int dfs (int index , int sum) {
        if(sum >= max) return 0;
        if(index >= size) return 0;

        dfs(index + 1 , sum + arr[index]);
        dfs(index + 1 , sum);
        return 0;
    }
    public static void main(String[] args) throws Exception{
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        max = Integer.parseInt(st.nextToken());
        size = Integer.parseInt(st.nextToken());

        arr = new int[size];
        for(int i = 0 ; i < size ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = m.dfs(0,0);
    }
}
