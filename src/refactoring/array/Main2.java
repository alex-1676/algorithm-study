package refactoring.array;
import java.util.*;
import java.io.*;

public class Main2 {
    public String solution(int[] arr1 , int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for(int a : arr1) {
            set.add(a);
        }
        for(int b : arr2) {
            if(set.contains(b)) {
                 list.add(b);
            }
        }

        Collections.sort(list);
        for(int c : list) {
            sb.append(c).append(" ");
        }
        return sb.toString().trim();

    }
    public static void main(String[] args) throws Exception{
        Main2 m = new Main2();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int size1 = Integer.parseInt(br.readLine());
        int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int size2 = Integer.parseInt(br.readLine());
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(arr1 , arr2));
    }
}
