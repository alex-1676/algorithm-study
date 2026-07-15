package Inflearn_study.bfs;

import java.io.*;
import java.util.*;

public class Main10 {
    static int[][] board;
    static boolean[][] visited = new boolean[7][7];
    static int distant;
    static int[] xArrays = {-1, 0, 1, 0};
    static int[] yArrays = {0, 1, 0, -1};

    public void dfs(int x, int y, int sum) {
        if (x < 0 || x > 6 || y < 0 || y > 6) return;
        if(board[x][y] == 1)return;
        if (x == 6 && y == 6) {
            distant = sum;
            return;
        }
        if(visited[x][y]) return;
        visited[x][y] = true;
        for(int i = 0 ; i < 4 ; i++) {
            dfs(x+xArrays[i] , y+yArrays[i],sum + 1);
        }
        visited[x][y] = false;

    }

    public static void main(String[] args) throws Exception {
        Main10 m = new Main10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[7][7];
        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        m.dfs(0, 0, 0);
        System.out.println(distant);
    }
}
