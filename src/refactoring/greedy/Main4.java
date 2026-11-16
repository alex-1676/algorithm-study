package refactoring.greedy;
import java.io.*;
import java.util.*;
//6
//50 2
//20 1
//40 2
//60 3
//30 3
//30 1
public class Main4 {
    static List<int[]> list;

    public int maxDay () {
        int max_Day = 0;
        for(int[] block: list) {
            max_Day = Math.max(max_Day, block[1]);
        }
        return max_Day;
    }

    public int solution (int size) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int max = maxDay();
        int result = 0;
        int cnt = 0;
        for(int i = max ; i > 0 ; i--) {

            while(cnt < size && list.get(cnt)[1] >= i) {
                pq.offer(list.get(cnt)[0]);
                cnt++;
            }
            result += pq.poll();
        }

        return result;
    }
    public static void main(String[] args) throws Exception{
        Main4 m = new Main4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        for(int i = 0 ; i < size ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a,b});
        }
        list.sort((a,b) -> b[1] - a[1]);
        System.out.println(m.solution(size));
    }
}
