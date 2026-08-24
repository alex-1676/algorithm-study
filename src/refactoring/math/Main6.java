package refactoring.math;
import java.io.*;
import java.util.*;

public class Main6 {
    public String solution(int size , String str) {
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[size];

        for(int i = 0 ; i < size; i++) {
            char[] ch = strs[i].toCharArray();
            for(int j = 0 ; j < ch.length / 2 ; j++) {
                char temp = ch[j];
                ch[j] = ch[ch.length-1-j];
                ch[ch.length-1-j] = temp;
            }
            arr[i] = Integer.parseInt(new String(ch));
        }
        for(int i = 0 ; i < size ; i++) {
            if(arr[i] == 1) {
                continue;
            }
            boolean isPrime = true;
            for(int j = 2 ; j * j <= arr[i] ; j++) {
                if(arr[i]%j ==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) throws Exception{
        Main6 m = new Main6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(m.solution(size, str));
    }
}
