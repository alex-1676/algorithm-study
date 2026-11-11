package refactoring.dfs;
import java.io.*;
import java.util.*;

// 숫자 0, 1, 2, 3, 4, 5 중에서 4개를 골라, 모든 조합을 출력하라.
// 4 6
// 0 1 2 3 4 5
public class Practice {
    static int[] arr;
    static int cnt;
    static int[] selected;
    static int result;
    public void dfs(int start , int count) {

        if(count == cnt) {
            result++;
        }

        for(int i = start ; i< arr.length ; i++) {
            selected[count] = arr[i];
            dfs(i+1 , count + 1);
        }
    }
    public static void main(String[] args) throws Exception{
        Practice p = new Practice();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        cnt = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());
        arr = new int[size];
        selected = new int[size];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        p.dfs(0,0);
        System.out.println(result);
    }
}
