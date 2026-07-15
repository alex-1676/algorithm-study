설명
N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.
Image1.jpg
만약 위와 같다면 섬의 개수는 5개입니다.
입력
첫 번째 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 격자판 정보가 주어진다.
출력
첫 번째 줄에 섬의 개수를 출력한다.
예제 입력
7
1 1 0 0 0 1 0
0 1 1 0 1 1 0
0 1 0 0 0 0 0
0 0 0 1 0 1 1
1 1 0 1 1 0 0
1 0 0 0 1 0 0
1 0 1 0 1 0 0
예제 출력
5

```java
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
```