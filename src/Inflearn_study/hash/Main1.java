package Inflearn_study.hash;

import java.io.*;

import java.util.*;

public class Main1 {
    public String solution (int cnt ,  String str) {
        HashMap<String , Integer>map = new HashMap<>();
        String[] strs = str.split("");

        for(int i = 0 ; i < cnt ; i++) {
            map.put(strs[i],map.getOrDefault(strs[i],0)+1);
        }

        int standard = 0;
        StringBuilder sb = new StringBuilder();

        for(String key : map.keySet()) {
            if(map.get(key) > standard) {
                standard = map.get(key);
                sb.setLength(0);
                sb.append(key);
            }
        }
        return sb.toString();

    }
    public static void main( String[] args) throws Exception {
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(m.solution(cnt , str));
    }
}
