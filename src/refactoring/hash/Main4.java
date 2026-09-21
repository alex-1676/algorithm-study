package refactoring.hash;
import java.util.*;
import java.io.*;

public class Main4 {
    public int solution (char[] chs , char[] standard) {
        int result = 0;


        HashMap<Character , Integer>standardMap = new HashMap<>();
        HashMap<Character , Integer> arrMap = new HashMap<>();

        for(int i = 0 ; i < standard.length ; i++) {
            standardMap.put(standard[i] , standardMap.getOrDefault(standard[i] , 0) + 1);
        }

        for(int i = 0 ; i < standard.length-1 ; i++) {
            arrMap.put(chs[i] , arrMap.getOrDefault(chs[i] , 0) + 1);
        }
        int left = 0;
        for(int i = standard.length - 1 ; i < chs.length ; i++) {
            arrMap.put(chs[i] , arrMap.getOrDefault(chs[i] , 0) + 1);
            if(standardMap.equals(arrMap)) {
                result++;
            }
            if(arrMap.get(chs[left]) > 1) {
                arrMap.put(chs[left] , arrMap.get(chs[left]) -1);
            }else {
                arrMap.remove(chs[left]);
            }

            left++;
        }
        return result;
    }
    public static void main (String[] args) throws Exception{
        Main4 m = new Main4();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chs = br.readLine().toCharArray();
        char[] standard = br.readLine().toCharArray();

        System.out.println(m.solution(chs , standard));
    }
}
