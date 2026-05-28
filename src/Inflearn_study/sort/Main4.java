package Inflearn_study.sort;
import java.io.*;
import java.util.*;

public class Main4 {
    public String solution (String str1 , String str2) {
        int[] ary1 = Arrays.stream(str1.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] ary2 = Arrays.stream(str2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int size = ary1[0];
        int size2 = ary1[1];
        int[] cache = new int[size];


        for(int i = 0 ; i < size2 ; i++) {
            int exist = ary2[i];
            boolean flag = false;
            for(int j = 0 ; j < size ; j++) {
                if(cache[j] == exist || cache[j] == 0) {
                    int index = j;
                    while(index >0) {
                        cache[index] = cache[index-1];
                        index--;
                    }
                    cache[0] = exist;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                for(int j = size-1 ; j > 0 ; j--) {
                    cache[j] = cache[j-1];
                }
                cache[0] = exist;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int n : cache) {
            sb.append(n).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main (String[] args) throws Exception {
        Main4 m = new  Main4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 =  br.readLine();
        System.out.println(m.solution(str1 , str2));
    }
}
