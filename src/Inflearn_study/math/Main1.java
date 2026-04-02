package Inflearn_study.math;
import java.util.*;

public class Main1 {

    public List<Integer> solution(List<Integer> list) {
        int standard = list.get(0);
        List<Integer> result = new ArrayList<>();
        result.add(standard);
        for( int i = 1 ; i < list.size() ; i++) {
            if (standard < list.get(i)) {
                result.add(list.get(i));
                standard = list.get(i);
            }else {
                standard = list.get(i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Main1 m = new Main1();
        Scanner in = new Scanner (System.in);
        int cnt = in.nextInt();
        in.nextLine();
        List<Integer>list = new ArrayList<>();
        for(int i = 0 ; i < cnt ; i++) {
            list.add(in.nextInt());
        }

        for(int i : m.solution(list)) {
            System.out.print(i+ " ");
        }
    }
}
