package refactoring.dfs;
import java.io.*;
import java.util.*;

public class Main13 {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0,-1,-1,1,1};
    static int[] dy = {0,1,0,-1,-1,1,-1,1};

    public void dfs (int x , int y) {

        if(x < 0 || x >= 7 || y < 0 || y >= 7) return;

        if(arr[x][y] == 0 || visited[x][y]) return;
        visited[x][y] = true;

        for(int i = 0 ; i  < 8 ; i++) {
            dfs(x + dx[i] , y + dy[i]);
        }
    }
    public static void main(String[] args) throws Exception{
        Main13 m = new Main13();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        arr = new int[size][size];
        visited = new boolean[size][size];

        for(int i = 0 ; i < size ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < size ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int count = 0;

        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    m.dfs(i , j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
