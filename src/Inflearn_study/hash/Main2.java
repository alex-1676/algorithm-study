package Inflearn_study.hash;
import java.io.*;
import java.util.*;

public class Main2 {
    public String solution (String first , String second) {
        TreeMap<Character , Integer> map = new TreeMap<>();
        TreeMap<Character, Integer> map2 = new TreeMap<>();

        char[] firstAry = first.toCharArray();
        char[] secondAry = second.toCharArray();
        if(firstAry.length != secondAry.length) return "NO";

        for(int i = 0 ; i < firstAry.length ; i++) {
            map.put(firstAry[i],map.getOrDefault(firstAry[i],0)+1);
            map.put(secondAry[i],map.getOrDefault(secondAry[i],0)+1);
        }
        if(map.equals(map2)) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main (String[] args) throws Exception {
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        System.out.println(m.solution(first , second));
    }
}
