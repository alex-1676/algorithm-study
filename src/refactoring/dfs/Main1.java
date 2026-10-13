package refactoring.dfs;
import java.io.*;
import java.util.*;

public class Main1 {
    static int[] arr;
    static int target;
    public String dfs (int index , int sum) {
        if(sum == target) return "YES";

        if(index >= arr.length) return "NO";
        if(sum > target) return "NO";

        String a = dfs(index + 1 , sum + arr[index]);
        if(a.equals("YES")) return "YES";
        String b = dfs(index + 1 , sum);
        if(b.equals("YES")) return "YES";

        return "NO";
    }
    public static void main(String[] args) throws Exception{
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        arr = new int[size];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int total = Arrays.stream(arr).sum();
        target = total /2;

        System.out.println(m.dfs(0,0));
    }
}
