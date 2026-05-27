package Inflearn_study.sort;
import java.util.*;
import java.io.*;

public class Main3 {
    public String solution (int size , String ary) {
        int[] ary2 = Arrays.stream(ary.split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 1 ; i < size ; i++) {
            int key = ary2[i];
            int index = i-1;
            while(index >= 0 && key < ary2[index]) {
                ary2[index+1] = ary2[index];
                index--;
            }
            ary2[index+1] = key;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < size-1 ; i++) {
            sb.append(ary2[i]).append(" ");
        }
        sb.append(ary2[size-1]);
        return sb.toString();
    }
    public static void main(String[] args) throws Exception{
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String ary = br.readLine();
        System.out.println(m.solution(size , ary));
    }
}
