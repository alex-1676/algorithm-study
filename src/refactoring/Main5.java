package refactoring;
import java.io.*;
import java.util.*;

public class Main5 {

    public String solution (String str) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while(start < end) {
            if(Character.isAlphabetic(ch[start])) {
                while(start < end) {
                    if(Character.isAlphabetic(ch[end])) {
                        char temp = ch[start];
                        ch[start] = ch[end];
                        ch[end] = temp;
                        end --;
                        start ++;
                        break;
                    }
                    end--;
                }
            }
            start++;
        }
        return new String(ch);
    }
    public static void main(String[] args) throws Exception {
        Main5 m = new Main5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
