package refactoring;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main7 {
    public String solution (String str) {
        char[] ch = str.toCharArray();

        for(int i = 0 ; i < ch.length / 2 ; i++) {
            if(!Character.isUpperCase((ch[i])) == Character.isUpperCase(ch[ch.length-1-i])) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main (String[] args)throws Exception {
        Main7 m = new Main7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(m.solution(str));
    }
}
