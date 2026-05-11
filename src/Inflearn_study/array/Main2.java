package Inflearn_study.array;
import java.util.*;

public class Main2 {

    public String solution (int first , String firstArray, int second , String secondArray ) {

       int[] firstAry = Arrays.stream(firstArray.split(" ")).mapToInt(Integer::parseInt).toArray();
       int[] secondAry = Arrays.stream(secondArray.split(" ")).mapToInt(Integer::parseInt).toArray();

       Set<Integer>set = new HashSet<>();
       StringBuilder sb = new StringBuilder();

       for(int i : firstAry) {
           set.add(i);
       }
       List<Integer> list = new ArrayList<>();
       for(int i : secondAry) {
           if(set.contains(i)) {
                list.add(i);
           }
       }

       Collections.sort(list);

       for(int i = 0 ; i < list.size()-1 ; i++) {
           sb.append(list.get(i));
           sb.append(" ");
       }
       sb.append(list.get(list.size()-1));

       return sb.toString();
    }
    public static void main (String[] args) {
        Main2 m = new Main2();
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        in.nextLine();
        String firstArray = in.nextLine();
        int second = in.nextInt();
        in.nextLine();
        String secondArray = in.nextLine();

        System.out.println(m.solution(first , firstArray , second , secondArray));
    }
}
