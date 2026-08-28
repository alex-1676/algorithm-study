package refactoring.math;

import java.io.*;
import java.util.*;

public class Main9 {
    static int[][] arr;
    int result = 0;


    public int solution(int size) {
        int[] lengthes = new int[size];
        int cross_leftRight = 0;
        int cross_rightLeft = 0;
        int width = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                width += arr[i][j];
                if(i == j) cross_leftRight += arr[i][j];
                if(i + j == size -1) cross_rightLeft += arr[i][j];
                lengthes[j] += arr[i][j];
            }
            result = Math.max(result, width);
            width = 0;
        }
        result = Math.max(result, cross_leftRight);
        result = Math.max(result, cross_rightLeft);

        for(int i : lengthes) {
            result = Math.max(result, i);
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        Main9 m = new Main9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        arr = new int[size][size];

        for(int i = 0 ; i < size ;  i++) {
            StringTokenizer st = new StringTokenizer (br.readLine());
            for(int j = 0 ; j < size ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(m.solution(size));
    }
}
