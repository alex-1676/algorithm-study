package Inflearn_study.bfs;
import java.io.*;
import java.util.*;

public class Main13 {
    static int[][] board;
    static boolean[][] visited;
    static int result;
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};
    public void bfs(int x , int y) {
        Deque<int[]> deque = new ArrayDeque<>();
        visited[x][y] =true;
        deque.offer(new int[]{x,y});

        while(!deque.isEmpty()) {
            int[] block = deque.poll();

            for(int i = 0 ; i < 8 ; i++) {
                int nx = block[0] + dx[i];
                int ny = block[1] + dy[i];
                if(nx < 0 || nx >= board.length || ny < 0 || ny >= board.length) continue;
                if(visited[nx][ny] || board[nx][ny] == 0) continue;
                visited[nx][ny] = true;
                deque.offer(new int[]{nx,ny});
            }
        }
        result++;
    }
    public static void main(String[] args) throws Exception{
        Main13 m = new Main13();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        board = new int[size][size];
        visited = new boolean[size][size];
        for(int i = 0 ; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < size ; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                if(board[i][j]==1 && !visited[i][j]) {
                    m.bfs(i,j);
                }
            }
        }
        System.out.println(result);
    }
}
