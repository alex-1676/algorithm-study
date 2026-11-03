package refactoring.dfs;
import java.io.*;
import java.util.*;

public class Main10 {
    static int[][] arr;

    public int dfs (int x , int y , boolean[][] visited) {

        if (x < 0 || x > 6 || y < 0 || y > 6) return 0;
        if(arr[x][y] == 1) return 0;
        if(visited[x][y]) return 0;
        visited[x][y] = true;
        int count  = 0;
        if(x == 6 && y == 6){
            visited[x][y] = false;
            return 1;
        }
        count += dfs(x + 1 , y , visited);
        count += dfs(x - 1 , y , visited);
        count += dfs(x , y + 1 , visited);
        count += dfs(x , y - 1 , visited);

        visited[x][y] = false;
        return count;
    }
    public static void main(String[] args) throws Exception{
        Main10 m = new Main10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[7][7];
        for(int i = 0 ; i < 7 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 7 ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result = m.dfs(0,0, new boolean[7][7]);
        System.out.println(result);
    }
}
