package refactoring.math;
import java.io.*;
import java.util.*;

public class Main12 {
    static int[][]arr;

    public int solution(int[] rolCol) {
        int row = rolCol[1];
        int col = rolCol[0];
        int result = 0;
        for(int i = 0 ; i < col ; i++) {
            for(int j = 0 ; j < col ; j++) {
                if(i == j) continue;
                boolean flag = true;
                for(int k = 0 ; k < row ; k++) {
                    if(arr[k][i] >= arr[k][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) result++;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        Main12 m = new Main12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] rowCol = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = rowCol[1];
        int col = rowCol[0];

        arr = new int[row][col];
        for(int i = 0 ; i < row ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < col ; j++) {
                int student = Integer.parseInt(st.nextToken());
                arr[i][student - 1] = j+1;
            }
        }
        System.out.println(m.solution(rowCol));
    }
}
