package refactoring;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {

    public String solution (String str) {
        String[]  strs = str.split(" ");
        int result = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < strs.length ; i++) {

            if (result < strs[i].length()) {
                result = strs[i].length();
                sb.setLength(0);
                sb.append(strs[i]);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        Main3 m  = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.print(m.solution(str));
    }
}
