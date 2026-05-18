package Inflearn_study.hash;
import java.io.*;
import java.util.*;

public class Main4 {
    public int solution (String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<>();
        int cnt = ch1.length - ch2.length;
        int result = 0;
        for(int i = 0 ; i < ch2.length ; i++) {
            map1.put(ch2[i],1);
        }
        HashMap<Character , Integer> map2 = new HashMap<>();

        for(int i = 0 ; i < ch2.length ; i++) {
            map2.put(ch1[i],map2.getOrDefault(ch1[i],0)+1);
        }

        if(map1.equals(map2)) {
            result++;
        }

        for(int i = 1 ; i <= cnt ; i++) {
            if(map2.get(ch1[i-1]) <= 1) {
                map2.remove(ch1[i-1]);
            }else {
                map2.put(ch1[i-1],map2.get(ch1[i-1])-1);
            }
            map2.put(ch1[i+ch2.length-1],map2.getOrDefault(ch1[i+ch2.length-1],0)+1);

            if(map2.equals(map1)) {
                result++;
            }
        }

        return result;
    }
    public static void main (String[] args) throws Exception {
        Main4 m = new Main4();
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(m.solution(str1 , str2));
    }
}
