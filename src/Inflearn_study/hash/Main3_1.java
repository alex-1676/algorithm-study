package Inflearn_study.hash;

import java.io.*;
import java.util.*;

public class Main3_1 {
    public String solution (String str , String str2) {
        int[] arr1 = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(str2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = arr1[0];
        int cnt = arr1[1];
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < cnt ; i++) {
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }
        sb.append(map.size()).append(" ");
        for(int i = 1 ; i <= length-cnt ; i++) {
            if(map.getOrDefault(arr2[i-1],0) <= 1) {
                map.remove(arr2[i-1]);
            }else {
                map.put(arr2[i-1],map.get(arr2[i-1])-1);
            }
            map.put(arr2[i+cnt-1],map.getOrDefault(arr2[i+cnt-1],0)+1);
            sb.append(map.size()).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args)throws Exception {
        Main3_1 m = new Main3_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();
        System.out.println(m.solution(str,str2));
    }
}
