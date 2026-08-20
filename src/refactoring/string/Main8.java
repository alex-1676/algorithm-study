package refactoring.string;
import java.io.*;

public class Main8 {
    public String solution (String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < str.length() ; i++) {
            if(Character.isAlphabetic(str.charAt(i))) {

               sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        String clean = sb.toString();
        for(int i = 0 ; i < clean.length() ; i++){
            if(clean.charAt(i) != clean.charAt(clean.length()-1 -i)) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) throws Exception {
        Main8 m = new Main8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.solution(str));
    }
}
