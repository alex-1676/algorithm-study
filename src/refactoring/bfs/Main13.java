package refactoring.bfs;
//7
//1 1 0 0 0 1 0
//0 1 1 0 1 1 0
//0 1 0 0 0 0 0
//0 0 0 1 0 1 1
//1 1 0 1 1 0 0
//1 0 0 0 1 0 0
//1 0 1 0 1 0 0

import java.io.*;
import java.util.*;
public class Main13 {
    static int[][] arr;
    static boolean[][] visited;
    static int size;
    static int[] dx = {-1,0,1,0,-1,-1,1,1};
    static int[] dy = {0,1,0,-1,-1,1,-1,1};

    public void bfs(int x , int y) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerLast(new int[]{x,y});
        while(!deque.isEmpty()) {
            int[] block = deque.pollFirst();

            for(int i = 0 ; i < 8 ; i++) {
                int nx = block[0] + dx[i];
                int ny = block[1] + dy[i];

                if(nx < 0 || nx >= size || ny < 0 || ny >= size) continue;

                if(visited[nx][ny]) continue;
                if(arr[nx][ny] == 0) continue;
                visited[nx][ny] = true;
                deque.offerLast(new int[]{nx,ny});
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Main13 m = new Main13();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        arr = new int[size][size];
        visited = new boolean[size][size];

        for(int i = 0 ; i < size ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < size ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result = 0;

        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    m.bfs(i , j);
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
