package refactoring.greedy;
import java.io.*;
import java.util.*;
// 5
//172 67
//183 65
//180 70
//170 72
//181 60
public class Main1 {
    static List<int[]> list;

    public int solution() {
        int result = 0;

        list.sort((a,b) -> a[0] - b[0]);

        for(int i = 0 ; i < list.size() ; i++) {
            boolean flag = false;
            for(int j = i+1 ; j < list.size() ; j++) {
                if(list.get(i)[1] <= list.get(j)[1]) {
                    flag = true;
                }
            }
            if(!flag) result++;
        }
        return result;
    }
    public static void main(String[] args)throws Exception {
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
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
