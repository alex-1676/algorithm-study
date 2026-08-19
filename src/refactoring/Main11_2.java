package refactoring;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main11_2 {
    public String solution (String str) {
        char[] chs = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        char pre = chs[0];
        int now = 1;

        for(int i = 1 ; i <= chs.length ; i++) {
            if(i < chs.length && chs[i] == chs[i-1]) {
                now++;
            }else {
                if( now > 1) {
                    sb.append(pre).append(now);

                }else {
                    sb.append(pre);
                }
                now = 1;
                if(i < chs.length) pre = chs[i];
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception{
        Main11_2 m = new Main11_2();
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(m.solution(str));
    }
}
