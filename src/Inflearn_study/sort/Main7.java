package Inflearn_study.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main7 {

    public String[] solution (int size , String[] arr) {
        int[][] ary = new int[size][2];

        for(int i = 0 ; i < size ; i++) {
            String[] str;
            str = arr[i].split(" ");
            ary[i][0] = Integer.parseInt(str[0]);
            ary[i][1] = Integer.parseInt(str[1]);
        }

        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size - i-1 ; j++) {
                if(ary[j][0] > ary[j+1][0]) {
                    int[] temp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = temp;
                }else if(ary[j][0] == ary[j+1][0] && ary[j][1] > ary[j+1][1]){
                        int[] temp = ary[j];
                        ary[j] = ary[j+1];
                        ary[j+1] = temp;
                }
            }
        }
        String[] result = new String[size];
        StringBuilder sb = new StringBuilder();

        for(int j = 0 ; j < size ; j++) {

            for(int i = 0 ; i < 2 ; i++) {
                sb.append(String.valueOf(ary[j][i])).append(" ");
            }
            result[j] = sb.toString().trim();
            sb.setLength(0);
        }
        return result;
    }
    public static void main (String[] args) throws IOException {
        Main7 m = new Main7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] str = new String[size];
        for(int i = 0; i < size; i++){
            str[i] = br.readLine();
        }
        String[] result = m.solution(size, str);
        for(String s : result){
            System.out.println(s);
        }
    }
}
