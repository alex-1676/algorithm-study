package refactoring.greedy;
import java.io.*;
import java.util.*;

public class Main2 {
    static List<int[]> list;
    static int size;

    public int solution() {
        int result = 0;
        int end = 0;

        list.sort((a,b) -> {

            if(a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        for(int i = 0 ; i < size ; i++) {
            if(list.get(i)[0] >= end) {
                end = list.get(i)[1];
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        size = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        for(int i = 0 ; i < size ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.add(new int[]{a,b});
        }

        System.out.println(m.solution());
    }
}
