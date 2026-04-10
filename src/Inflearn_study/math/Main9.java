package Inflearn_study.math;

import java.util.Scanner;

public class Main9 {



    public int solution (int cnt , String[] numbers) {
        int[][] numbers2 = new int[cnt][cnt];
        int result = 0;
        int total = 0;
        int index = 0;
        for( int i = 0 ; i < cnt ; i++) {
            String onBlock = numbers[i];
            String[] splitString = onBlock.split(" ");
            for( int j = 0 ; j < cnt ; j++) {
                numbers2[i][j] = Integer.parseInt(splitString[j]);
            }
        }

        for(int i = 0 ; i < cnt ; i++) {
            for(int j = 0 ; j < cnt ; j++) {
                total += numbers2[i][j];
            }
            result = Math.max(total, result);
            total = 0;
        }

        for(int j = 0 ; j < cnt ; j++) {
            for(int i = 0 ; i < cnt ; i++) {
                total += numbers2[i][j];
            }
            result = Math.max(total, result);
            total = 0;
        }

        for(int  i = 0 ; i < cnt ; i++) {
            total += numbers2[i][i];
        }
        result = Math.max(total, result);
        total = 0;

        for(int i = 0 ; i < cnt ; i++) {
            total += numbers2[i][cnt-i-1];
        }
        result = Math.max(total, result);
        return result;
    }


    public static void main (String[] args) {
        Main9 m = new Main9();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        in.nextLine();
        String[] numbers = new String[cnt];
        for(int i = 0 ; i < cnt ; i++) {
            numbers[i] = in.nextLine();
        }
        System.out.println(m.solution(cnt , numbers));
    }
}
