package Inflearn_study.sort;
import java.util.*;
import java.io.*;

public class Main1 {
    public String solution (int size , String ary) {
        int[] array = new int[size];
        String[] strAry = ary.split(" ");

        for(int i = 0 ; i < size ; i++) {
            array[i] = Integer.parseInt(strAry[i]);
        }

        for(int i = 0 ; i < size-1 ; i++) {
            int standard = array[i];
            int index = i;
            for(int j = i+1 ; j < size ; j++) {
                if(array[j] < standard) {
                    standard = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < size-1 ; i++) {
            sb.append(array[i]).append(" ");
        }
        sb.append(array[size-1]);
        return sb.toString();
    }
    public static void main(String[] args) throws Exception{
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String ary = br.readLine();
        System.out.println(m.solution(size , ary));
    }
}
