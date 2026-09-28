package refactoring.queue;
import java.io.*;
import java.util.*;

public class Main3 {
    static int[][] board;

    public int solution(int size , int[] moves , int moves_size) {
        Deque<Integer> deque = new ArrayDeque<>();
        int result = 0;
        for(int i = 0 ; i < moves_size ; i++) {
            int index = moves[i]-1;
            for(int j = 0 ; j < size ; j++) {
                if(board[j][index] != 0) {
                    if(!deque.isEmpty()) {
                        if(deque.peekLast() == board[j][index]) {
                            deque.pollLast();
                            result += 2;
                        }else {
                            deque.offerLast(board[j][index]);
                        }
                    }else {
                        deque.offerLast(board[j][index]);
                    }
                    board[j][index] = 0;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        board = new int[size][size];
        for(int i = 0 ; i < size ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < size ; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int move_size = Integer.parseInt(br.readLine());

        int[] moves = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(size , moves , move_size));
    }
}
