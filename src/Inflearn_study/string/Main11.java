package Inflearn_study.string;
import java.util.*;

public class Main11 {

    public String solution(String str) {
        int cnt = 1;
        char[] chs = str.toCharArray();
        char standard = chs[0];
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i < chs.length ; i++) {
            if(standard == chs[i]) {
                cnt++;
            }else if (standard != chs[i] && cnt > 1) {
                sb.append(standard);
                sb.append(cnt);
                standard = chs[i];
                cnt = 1;
            }else {
                sb.append(standard);
                standard = chs[i];
            }
        }
        if(cnt >1) {
            sb.append(standard);
            sb.append(cnt);
        }else {
            sb.append(standard);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main11 m = new Main11();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(m.solution(str));
    }
}
