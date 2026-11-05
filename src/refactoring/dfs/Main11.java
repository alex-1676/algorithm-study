package refactoring.dfs;
import java.io.*;
import java.util.*;

public class Main11 {

    static int[][] board;
    static boolean[][] visited;
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};

    public int bfs (int x , int y , int sum) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerLast(new int[]{x,y,sum});

        while(!deque.isEmpty()) {
            int[] block = deque.pollFirst();

            int nx = block[0];
            int ny = block[1];
            int sum2 = block[2];

            if(nx < 0 || nx > 6 || ny < 0 || ny > 6) continue;
            if(visited[nx][ny] || board[nx][ny] == 1) continue;

            if(nx == 6 && ny == 6) return sum2;

            for(int i = 0 ; i < 4 ; i++) {
                int nx2 = nx + dx[i];
                int ny2 = ny + dy[i];
                deque.offerLast(new int[]{nx2 , ny2 , sum2 + 1});
            }
            visited[x][y] = true;

        }
        return -1;
    }
    public static void main (String[] args) throws Exception {
        Main11 m = new Main11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[7][7];
        visited = new boolean[7][7];
        for (int i = 0 ; i < 7 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 7 ; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(m.bfs(0,0,0));
    }
}