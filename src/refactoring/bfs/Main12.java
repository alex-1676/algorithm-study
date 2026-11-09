package refactoring.bfs;
import java.io.*;
import java.util.*;
//6 4
//0 0 -1 0 0 0
//0 0 1 0 -1 0
//0 0 -1 0 0 0
//0 0 0 0 -1 1

public class Main12 {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};


    public int bfs (int x , int y) {
        Deque<int[]> deque = new ArrayDeque<>();
        int result = 0;
        boolean check = false;
        for(int i = 0 ; i  < x ; i++) {
            for(int j = 0 ; j < y ; j++) {
                if(arr[i][j] == 1) {
                    deque.offerLast(new int[]{i,j});
                    visited[i][j] = true;
                }else if(arr[i][j] == 0){
                    check = true;
                }
            }
        }
        if(!check) return 0;

        while(!deque.isEmpty()) {
            int[] block = deque.pollFirst();
            for(int i = 0 ; i < 4 ; i++) {
                    int nx = block[0] + dx[i];
                    int ny = block[1] + dy[i];
                    if(nx < 0 || nx >= x || ny < 0 || ny >= y) continue;

                    if(visited[nx][ny] || arr[nx][ny] == -1) continue;

                    arr[nx][ny] += arr[block[0]][block[1]] + 1;
                    visited[nx][ny] = true;
                    result = Math.max(result, arr[nx][ny]);

                    deque.offerLast(new int[]{nx,ny});
            }
        }
        boolean check2 = false;

        for(int i = 0 ; i < x ; i++) {
            for(int j = 0 ; j < y ; j++) {
                if(arr[i][j] == 0){
                    check2 = true;
                }
            }
        }
        if(check2) return -1;

        return result - 1;
    }
    public static void main (String[] args) throws Exception{
        Main12 m = new Main12();
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        arr = new int[x][y];
        visited = new boolean[x][y];

        for(int i = 0 ; i < x ; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < y ; j++) {
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        System.out.println(m.bfs(x,y));
    }
}
