package refactoring.hash;
import java.util.*;
import java.io.*;
public class Main5 {
    public int solution (int[] arr , int[] arr2) {

        int size = arr[0];
        int range = arr[1];
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for(int i = 0 ; i < size - range ; i++) {
            for(int j = i + 1 ; j < size - range + 1 ; j++) {
                for(int k = j + 1 ; k < size ; k++) {
                    set.add(arr2[i] + arr2[j] + arr2[k]);
                }
            }
        }
        int index = 0;
        for(int s : set) {
            index ++;
            if(index == range) {
                return s;
            }
        }
        return -1;

    }
    public static void main(String[] args) throws Exception{
        Main5 m = new Main5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(m.solution(arr , arr2));
    }
}
