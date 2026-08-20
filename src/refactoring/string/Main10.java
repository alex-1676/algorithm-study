package refactoring.string;
import java.io.*;
import java.util.*;

public class Main10 {
    public String solution (String str , String ch) {
        char[] chs = str.toCharArray();
        char standard = ch.charAt(0);
        int far = -1;
        int[] result = new int[chs.length];

        for(int i = 0 ; i < chs.length ; i++) {
            if(chs[i] == standard) {
                far = i;
            }
            if(far != -1) {
                result[i] = i - far;
            }else{
                result[i] = chs.length;
            }
        }
        far = -1;

        for(int i = chs.length-1 ; i >= 0 ; i--) {
            if(chs[i] == standard) {
                far = i;
            }
            if(far != -1) {
                result[i] = Math.min(result[i],far - i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < chs.length ; i++) {
            sb.append(result[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main (String[] args) throws Exception{
        Main10 m = new Main10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String ch = st.nextToken();
        System.out.println(m.solution(str , ch));
    }
}
