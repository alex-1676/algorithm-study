설명
7*7 격자판 미로를 탈출하는 최단경로의 길이를 출력하는 프로그램을 작성하세요.
경로의 길이는 출발점에서 도착점까지 가는데 이동한 횟수를 의미한다.
출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 도로이다.
격자판의 움직임은 상하좌우로만 움직인다. 미로가 다음과 같다면
Image1.jpg
위와 같은 경로가 최단 경로의 길이는 12이다.
입력
첫 번째 줄부터 7*7 격자의 정보가 주어집니다.
출력
첫 번째 줄에 최단으로 움직인 칸의 수를 출력한다. 도착할 수 없으면 -1를 출력한다.
예제 입력
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0
예제 출력
12

```java
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
```