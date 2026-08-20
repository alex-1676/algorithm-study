package refactoring.string;
import java.io.*;

public class Main4 {
    static String[] strs;

    public String solution() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < strs.length ; i++) {
            int start = 0;
            int end = strs[i].length()-1;
            char[] chars = strs[i].toCharArray();
            while(start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end --;
            }
            sb.append(chars).append("\n");
        }
        return sb.toString().trim();
    }
    public static void main( String args[]) throws Exception{
        Main4 m = new Main4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        strs = new String[size];
        for(int i = 0 ; i < size ; i++) {
            strs[i] = br.readLine();
        }

        System.out.println(m.solution());
    }
}
