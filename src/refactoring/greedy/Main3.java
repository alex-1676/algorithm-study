package refactoring.greedy;
import java.io.*;
import java.util.*;

public class Main3 {
    static List<int[]> list;
    static int size;

    public int solution () {
        int people = 0;
        int result = 0;

        list.sort((a,b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        for(int[] arr : list) {
            people += arr[1];
            result = Math.max(people , result);
        }

        return result;
    }
    public static void main (String[] args) throws Exception{
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());

        list = new ArrayList<>();

        for(int i = 0 ; i < size ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a,1});
            list.add(new int[]{b,-1});
        }
        System.out.println(m.solution());

    }
}
