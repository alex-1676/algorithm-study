package Inflearn_study.math;

import java.util.Scanner;
public class Main9_1 {

    public int solution ( String[] nums , int cnt) {
         int[][] numbers = new int[cnt][cnt];
         int rowTotal = 0;
         int colTotal = 0;
         int originDiagonal = 0;
         int reverseDiagonal = 0;
         int result = 0;

         //2차원 배열에 삽입
         for(int i = 0 ; i < cnt ; i++) {
             String[] numSplit = nums[i].split(" ");
             for(int j = 0 ; j < cnt ; j++) {
                 numbers[i][j] = Integer.parseInt(numSplit[j]);
             }
         }

         for(int i = 0 ; i < cnt ; i++) {
             for(int j = 0 ; j < cnt ; j++) {
                    rowTotal += numbers[i][j];
                    colTotal += numbers[j][i];
             }
             result = Math.max(result , Math.max(rowTotal , colTotal));
             rowTotal = 0;
             colTotal = 0;

            originDiagonal += numbers[i][i];
            reverseDiagonal += numbers[i][cnt-1-i];
         }
         result = Math.max(result , Math.max(originDiagonal , reverseDiagonal));

         return result;

    }
    public static void main(String[] args) {
        Main9_1 m = new Main9_1();
        Scanner in = new Scanner(System.in);
        int cnt  = in.nextInt();
        in.nextLine();
        String[] nums = new String[cnt];

        for(int i = 0 ; i < cnt ; i++) {
            nums[i] = in.nextLine();
        }
        System.out.println(m.solution(nums , cnt));
    }
}
