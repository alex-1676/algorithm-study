package Inflearn_study.bfs;
import java.io.*;
import java.util.*;
import java.util.concurrent.DelayQueue;

public class Main12 {
    static int[][] tomato;

    public int bfs () {
        Deque<int[]> deque = new ArrayDeque<>();
        int[] xArrays = {-1,0,1,0};
        int[] yArrays = {0,1,0,-1};

        for(int i = 0 ; i < tomato.length ; i++) {
            for(int j = 0 ; j < tomato[0].length ; j++) {
                if(tomato[i][j] == 1) {
                    deque.offer(new int[]{i,j});
                }
            }
        }

        while(!deque.isEmpty()) {
            int[] a = deque.poll();
            for(int i = 0 ; i < 4 ; i++) {
                int nx = a[0] +  xArrays[i];
                int ny = a[1] + yArrays[i];
                if(nx >= 0 && nx < tomato.length && ny >= 0 && ny < tomato[0].length) {
                     if( tomato[nx][ny] == 0) {
                         tomato[nx][ny] = tomato[a[0]][a[1]] + 1;
                        deque.offer(new int[]{nx,ny});
                     }
                }
            }
        }
        int max = 0;
        for(int i = 0 ; i < tomato.length ; i++) {
            for(int j = 0 ; j < tomato[0].length ; j++) {
                max = Math.max(max, tomato[i][j]);
            }
        }
        return max -1;

    }
    public static void main(String[] args) throws Exception {
        Main12 m = new Main12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int []aa = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        tomato = new int[aa[1]][aa[0]];
        for(int i = 0 ; i < aa[1] ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < aa[0] ; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(m.bfs());
    }
}
