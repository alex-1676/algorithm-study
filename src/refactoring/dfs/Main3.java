package refactoring.dfs;
import java.io.*;
import java.util.*;
//5 20
//10 5
//25 12
//15 8
//6 3
//7 4
public class Main3 {
    static int[][] arr;
    static int size;
    static int max_time;
    public int dfs (int index , int sum , int time) {
        if(time > max_time) return 0;
        if(index > size - 1) {
            return sum;
        }

        int a  = dfs(index + 1 , sum + arr[index][0] , time + arr[index][1] );
        int b  = dfs(index + 1 , sum , time);

        return Math.max(a , b);
    }
    public static void main (String[] args)throws Exception {
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         size = Integer.parseInt(st.nextToken());
         max_time = Integer.parseInt(st.nextToken());
         arr = new int[size][2];

        for(int i = 0 ; i < size ; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st2.nextToken());
            arr[i][1] = Integer.parseInt(st2.nextToken());
        }
        int result = m.dfs(0,0,0);
        System.out.println(result);
    }
}
