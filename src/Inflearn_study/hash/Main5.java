package Inflearn_study.hash;
import java.io.*;
import java.util.*;

public class Main5 {
    public int solution (String str1 ,  String str2){
        int[] intAry = Arrays.stream(str1.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] intAry2 = Arrays.stream(str2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = intAry[0];


        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0 ; i < count-2 ; i++) {
            for(int j = i + 1 ; j < count -1 ; j++) {
                for( int z = j+1 ; z < count ; z++) {
                    set.add(intAry2[i]+intAry2[j]+intAry2[z]);
                }
            }
        }

        int index = 1;
        for(int k : set) {
            if(index == intAry[1]) {
                return k;
            }
            index++;
        }
            return -1;
    }
    public static void main (String[] args) throws Exception {
        Main5 m = new Main5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(m.solution(str1,str2));
    }
}
