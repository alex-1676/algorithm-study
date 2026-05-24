package Inflearn_study.stack;
import java.util.*;
import java.io.*;

public class Main7 {
    public String solution (String standard , String classes) {
        String[] stand = standard.split("");
        String[] classes2 = classes.split("");
        Deque <String> deque = new ArrayDeque<>();
        for(String c : stand) {
            deque.offerLast(c);
        }
        for(int i = 0 ; i < classes2.length ; i++) {
            if(standard.contains(classes2[i]) ) {
                String str = deque.pop();
                if(!str.equals(classes2[i])) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
    public static void main (String[] args) throws Exception {
        Main7 m = new Main7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String standard = br.readLine();
        String classes = br.readLine();
        System.out.println(m.solution(standard , classes));

    }
}
