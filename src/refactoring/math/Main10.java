package refactoring.math;

import java.util.*;
import java.io.*;

public class Main10 {
    static int[][] arr;

    public int solution (int size) {
        int result = 0;

        for(int i = 1 ; i <= size ; i++) {
            for(int j = 1 ; j <= size ; j++) {
                int now = arr[i][j];
                if(now > arr[i-1][j] && now > arr[i][j-1] && now > arr[i][j+1] && now > arr[i+1][j]) {
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        Main10 m = new Main10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        arr = new int[size + 2][size + 2];

        for (int i = 1; i <= size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(m.solution(size));
    }
}
