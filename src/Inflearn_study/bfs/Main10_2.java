package Inflearn_study.bfs;
import java.io.*;
import java.util.*;

public class Main10_2 {
    static int [][] board;
    static boolean[][] visited;
    static int[] xar = {-1,0,1,0};
    static int[] yar = {0,1,0,-1};

    public int bfs (int x , int y , int sum) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{x,y,sum});

        int result = 0;
        while(!deque.isEmpty()) {
            int[] block = deque.poll();
            if(block[0] == 6 && block[1] == 6) {
                result = block[2];
                return result;
            }
            for(int i = 0 ; i < 4 ; i++) {
                int sum2 = block[2];
                int nx = block[0] + xar[i];
                int ny = block[1] + yar[i];

                if(nx < 0 || nx > 6 || ny < 0 || ny > 6) continue;
                if(visited[nx][ny] || board[nx][ny] == 1 )continue;
                visited[nx][ny] = true;
                deque.offer(new int[]{nx,ny,sum2+1});
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception{
        Main10_2 m = new Main10_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[7][7];
        visited = new boolean[7][7];

        for(int i = 0 ; i < 7 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 7 ; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(m.bfs(0,0,0));
    }
}
