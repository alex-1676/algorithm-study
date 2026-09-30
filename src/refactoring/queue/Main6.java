package refactoring.queue;
import java.io.*;
import java.util.*;

public class Main6 {
    public int solution(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        int result = 0;
        int cnt = arr[1];
        int prince = arr[0];

        for(int i = 1 ; i <= prince ; i++) {
            deque.offerLast(i);
        }

        while(deque.size() != 1) {
            for(int i = 1 ; i <= cnt ; i++) {
                if(i < cnt) {
                    int prc = deque.pollFirst();
                    deque.offerLast(prc);
                }else {
                    deque.pollFirst();
                }
            }
        }
        return deque.poll();
    }
    public static void main (String[] args) throws Exception{
        Main6 m = new Main6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(arr));
    }
}
