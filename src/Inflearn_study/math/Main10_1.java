package Inflearn_study.math;

import java.util.Scanner;

public class Main10_1 {

    public int solution(String[] line, int n) {
        int[][] desk = new int[n+2][n+2];
        int result = 0;
        // int 형으로 변경해서 넣기
       for(int i = 1 ; i < n+1 ; i++) {
           String[] split = line[i-1].split(" ");
           for(int j = 1 ; j < n+1 ; j++) {
               desk[i][j] = Integer.parseInt(split[j-1]);
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
        Main10_1 m = new Main10_1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] line = new String[n];

        for(int i = 0 ; i < n ; i++) {
            line[i] = in.nextLine();
        }
        System.out.print(m.solution(line, n));
    }
}
