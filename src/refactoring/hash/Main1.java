package refactoring.hash;
import java.io.*;
import java.util.*;

public class Main1 {
    public char solution (int size , char[] chs) {
        Map<Character , Integer> map = new HashMap<>();
        int sum = 0;
        char result = ' ';
        for(int i = 0 ; i < size ; i++) {
            map.put(chs[i] , map.getOrDefault(chs[i],0)+1);
        }

        for(Map.Entry<Character , Integer> entry : map.entrySet()) {
            if(sum < entry.getValue()) {
                sum = entry.getValue();
                result = entry.getKey();
            }
        }
     return result;
    }
    public static void main (String[]args) throws Exception {
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        char[] chs = br.readLine().toCharArray();
        System.out.println(m.solution(size , chs));
    }
}
