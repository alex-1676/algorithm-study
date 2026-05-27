package Inflearn_study.sort;
import java.util.*;
import java.io.*;

public class Main2 {
    public String solution (int size , String ary) {
        int[] array = Arrays.stream(ary.split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0 ; i < size - 1 ; i++) {
            for(int j = 0 ; j < size -1-i ; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < size-1 ; i++) {
            sb.append(array[i]).append(" ");
        }
        sb.append(array[size-1]);
        return sb.toString();
    }
    public static void main (String[] args) throws Exception {
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String ary = br.readLine();
        System.out.println(m.solution(size , ary));
    }
}
