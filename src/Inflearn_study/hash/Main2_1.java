package Inflearn_study.hash;
import  java.io.*;
import java.util.Arrays;

public class Main2_1 {
    public String solution (String str1 , String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2) ? "YES" : "NO";
    }
    public static void main (String[] args) throws Exception {
        Main2_1 m = new Main2_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(m.solution(str1 , str2));
    }
}
