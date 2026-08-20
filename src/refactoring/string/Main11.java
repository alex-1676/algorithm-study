package refactoring.string;
import java.io.*;

public class Main11 {
    public String solution (String str) {
        StringBuilder sb = new StringBuilder();

        char[] chs = str.toCharArray();
        int now = 1;
        char pre = chs[0];


        for(int i = 0 ; i < chs.length-1 ; i++) {
            if(i == chs.length-2) {
                if(chs[i] == chs[i+1]) {
                    now++;
                    sb.append(pre);
                }else if (chs[i] != chs[i+1]) {
                    sb.append(pre);
                    sb.append(now);
                    sb.append(chs[i+1]);
                }
                break;
            }

            if(chs[i] == chs[i+1]) {
                now++;
            }
            if(chs[i] != chs[i+1]) {
                sb.append(pre);
                if(now > 1) {
                    sb.append(now);
                    now = 1;
                }
                pre = chs[i+1];
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)throws Exception {
        Main11 m = new Main11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
