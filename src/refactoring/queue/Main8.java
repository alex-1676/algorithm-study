package refactoring.queue;
// 5 2
//60 50 70 80 90
import java.io.*;
import java.util.*;

public class Main8 {
    public int solution (int[] arr ,  int[] danger) {
     int size = arr[0];
     int patientNum = arr[1];
     int patient = danger[patientNum];
     Deque<Integer> deque = new ArrayDeque<>();

     Arrays.sort(danger);
     for(int i = size - 1 ; i >= 0 ; i--) {
         deque.offer(danger[i]);
     }
     int cnt = 0;
     while(!deque.isEmpty()) {
         cnt++;
         int now = deque.pollFirst();
         if(now == patient) {
             return cnt;
         }
     }
        return 0;
    }
    public static void main(String[] args)throws Exception {
        Main8 m = new Main8();
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] danger = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(arr , danger));
    }
}
