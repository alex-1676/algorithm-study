package refactoring.math;

import java.io.*;
import java.util.*;

public class Main11 {
    static int[][] arr;

    public int solution(int size) {
        int result = 0;
        int student = 0;
        for (int i = 0; i < size; i++) {
            int now = 0;
            boolean[] check = new boolean[size];
            for (int j = 0; j < 5; j++) {
                for (int z = 0; z < size; z++) {
                    if(i == z) continue;
                    if (arr[i][j] == arr[z][j] && !check[z]) {
                        check[z] = true;
                        now++;
                    }
                }
            }
            if (now > result) {
                result = now;
                student = i+1;
            }
        }
        return student;
    }

    public static void main(String[] args) throws Exception {
        Main11 m = new Main11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(m.solution(size));
    }
}
