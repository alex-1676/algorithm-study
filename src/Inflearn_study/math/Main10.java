package Inflearn_study.math;

import java.util.List;
import java.util.Scanner;

public class Main10 {

    public int solution(StringBuilder sb , int n) {
        String[] split = sb.toString().split(" ");
        int[][] desk = new int[n+2][n+2];
        int index = 0;
        int result = 0;
        // int 형으로 변경해서 넣기
       for(int i = 1 ; i < n+1 ; i++) {
           for(int j = 1 ; j < n+1 ; j++) {
               desk[i][j] = Integer.parseInt(split[index++]);
           }

       }
       //봉우리 비교
       for(int i = 1 ; i < n+1 ; i++) {
           for(int j = 1 ; j < n+1 ; j++) {
               if(desk[i][j] > desk[i-1][j] && desk[i][j] > desk[i+1][j]) {
                   if(desk[i][j] > desk[i][j-1] && desk[i][j] > desk[i][j+1]) {
                       result++;
                   }
               }
           }
       }
       return result;

    }
    public static void main(String[] args) {
        Main10 m = new Main10();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n ; i++) {
            sb.append(in.nextLine()).append(" ");
        }
        System.out.print(m.solution(sb, n));
    }

}
