package Inflearn_study.stack;
import java.io.*;
import java.util.*;

public class Main3 {
    public int solution (int boardSize , int[][] board , int movesSize , int[] moves) {

        int result = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0 ; i < movesSize ; i++) {
            int now = moves[i]-1;
            for(int j = 0 ; j < boardSize ; j++) {
                if(board[j][now] != 0) {
                    if(!deque.isEmpty()) {
                        int top = deque.peek();
                        if(top == board[j][now]) {
                            deque.pop();
                            result+=2;
                        }else {
                            deque.push(board[j][now]);
                        }
                    }else {
                        deque.push(board[j][now]);
                    }
                    board[j][now] = 0;
                   break;
                }
            }
        }
        return result;
    }
    public static void main (String[] args) throws Exception{
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int boardSize = Integer.parseInt(br.readLine());

        int[][] board = new int[boardSize][boardSize];

        for(int i = 0 ; i < boardSize ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < boardSize ; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int movesSize = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] moves = new int[movesSize];
        for(int j = 0 ; j < movesSize ; j++){
            moves[j] = Integer.parseInt(st1.nextToken());
        }
        System.out.println(m.solution(boardSize , board , movesSize,moves));
    }
}
