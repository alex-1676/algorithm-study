package refactoring.greedy;
import java.io.*;
import java.util.*;

public class Main3_2 {
    static List<int[]> list;
    static int size;

    public int solution () {
        int people = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int[] block : list) {

            while(!pq.isEmpty() && block[0] >= pq.peek()) {
                pq.poll();
            }
            pq.offer(block[1]);
            people = Math.max(people , pq.size());
        }

        return people;

    }
    public static void main(String[] args) throws Exception{
        Main3_2 m = new Main3_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for(int i = 0 ; i < size ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a ,b});
        }

        list.sort((a,b) -> {
            if(a[1] == b[1]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        System.out.println(m.solution());
    }
}
