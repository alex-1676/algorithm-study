package refactoring.string;
import java.io.*;

public class Main1 {
    public int solution (String first , char c) {
        int result = 0;

        c = Character.toUpperCase(c);
        for(char ch : first.toCharArray()) {
            if(Character.toUpperCase(ch) == c) {
                result++;
            }
        }
        return result;
    }
    public static void main(String args[])throws Exception {
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        char c = br.readLine().charAt(0);

        System.out.println(m.solution(first , c));
    }
}
