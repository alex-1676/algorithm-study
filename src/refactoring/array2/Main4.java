package refactoring.array2;
import java.io.*;
import java.util.*;
public class Main4 {
    public String solution (int[] arr , int[] work) {
        int queueSize = arr[0];
        int workSize = arr[1];

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0 ; i < workSize ; i++) {
            if(deque.contains(work[i])) {
                deque.remove(work[i]);
                deque.offerFirst(work[i]);
            }else {
                deque.offerFirst(work[i]);
            }
            if(deque.size() > queueSize) {
                deque.pollLast();
            }

        }
        StringBuilder sb = new StringBuilder();

        for(int a : deque) {
            sb.append(a).append(" ");
        }
        return sb.toString().trim();


    }
    public static void main(String[] args) throws Exception{
        Main4 m = new Main4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] work = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(arr , work));
    }

}
