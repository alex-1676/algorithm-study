package refactoring.string;
import java.io.*;

public class Main12 {
    public String solution (int size , String str) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < size ; i++) {
            char ascii = (char)Integer.parseInt(str.substring(i*7 , i*7+7)
                    .replace("#","1").replace("*","0")
                    ,2);
            sb.append(ascii);
        }

        return sb.toString();
    }
    public static void main(String[] args) throws Exception{
        Main12 m = new Main12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.println(m.solution(size , str));
    }
}
