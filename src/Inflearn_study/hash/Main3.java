package Inflearn_study.hash;
import java.io.*;
import java.util.*;

public class Main3 {
    public String solution (String str1 , String str2) {
        int[] str1Ary = Arrays.stream(str1.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] str2Ary = Arrays.stream(str2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt = str1Ary[0]-str1Ary[1];
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i <= cnt ; i++) {
            for(int j = i ; j < str1Ary[1]+i ; j++) {
                set.add(str2Ary[j]);
            }
            sb.append(set.size());
            sb.append(" ");
            set.clear();
        }
        return sb.toString().trim();
    }
    public static void main (String[] args) throws Exception {
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(m.solution(str1 , str2));
    }
}
