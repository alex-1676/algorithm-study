package refactoring.dfs;
import java.io.*;
import java.util.*;
//4 4
//0 1 2 0
//1 0 2 1
//0 2 1 2
//2 0 1 2

public class Main14 {
    static int[][] arr;
    static int cnt;
    static List<int[]> pizzas;
    static int[] selected;
    static List<int[]> house;
    static int result;

    public void dfs(int start, int count) {

        if(count == cnt) {
            int sum = 0;
            for(int i = 0 ; i < house.size() ; i++) {
                int min = Integer.MAX_VALUE;

                for(int j = 0 ; j < cnt ; j++) {
                    int x = Math.abs(pizzas.get(selected[j])[0] - house.get(i)[0]);
                    int y = Math.abs(pizzas.get(selected[j])[1] - house.get(i)[1]);
                    int len = x + y;
                    min = Math.min(min , len);
                }
                sum += min;
            }
            result = Math.min(sum , result);
            return;
        }

        for(int i = start ; i < pizzas.size() ; i++ ) {
            selected[count] = i;
            dfs(i+1 , count + 1);
        }
    }

    public static void main(String[] args)throws Exception {
        Main14 m = new Main14();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        cnt = Integer.parseInt(st.nextToken());

        arr = new int[size][size];

        for(int i = 0 ; i  < size ; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < size ; j++) {
                arr[i][j]  = Integer.parseInt(st1.nextToken());
            }
        }

        pizzas = new ArrayList<>();
        house = new ArrayList<>();
        result = Integer.MAX_VALUE;
        for(int i= 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                if(arr[i][j] == 2) pizzas.add(new int[]{i,j});
                if(arr[i][j] == 1)house.add(new int[]{i,j});
            }
        }
        selected = new int[cnt];
        m.dfs(0,0);
        System.out.println(result);

    }
}
