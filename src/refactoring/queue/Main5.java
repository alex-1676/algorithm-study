package refactoring.queue;
import java.io.*;
import java.util.*;

public class Main5 {

    public int solution(char[] chs) {

        int open = 0;
        int result = 0;
        for(int i = 0 ; i < chs.length ; i++) {
            if(chs[i] == '(') {
                open++;
            }else {
                open--;

                    if(chs[i-1] == '('){
                        result += open;
                    }else {
                        result += 1;
                    }

            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        Main5 m = new Main5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chs = br.readLine().toCharArray();

        System.out.println(m.solution(chs));
    }
}
