package refactoring.hash;
import java.util.*;
import java.io.*;

public class Main2 {
    public String solution (char[] chs , char[] chs2) {
        Map<Character , Integer> map = new HashMap<>();

        for(char c : chs) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : chs2) {
            map.put(c,map.getOrDefault(c,0)-1);
            if(map.get(c) < 0) {
                map.remove(c);
            }
        }
        if(map.isEmpty()) {
            return "YES";
        }else {
            return "NO";
        }
    }
    public static void main (String[] args) throws Exception{
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chs1 = br.readLine().toCharArray();
        char[] chs2 = br.readLine().toCharArray();

        System.out.println(m.solution(chs1 , chs2));
    }
}
