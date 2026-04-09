package Inflearn_study.math;

import java.util.*;

public class Main8 {

    public int[] solution (String scoresString , int cnt) {

        int[] result = new int[cnt];
        int index = 1;
        TreeMap<Integer,List<Integer>> treeMap = new TreeMap<>();
        String[] scores = scoresString.split(" ");
        for(int i = 0 ; i < cnt ; i++) {
            result[i] = Integer.parseInt(scores[i]);
            if(treeMap.containsKey(result[i])) {
                treeMap.get(result[i]).add(i);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                treeMap.put(result[i],list);
            }
        }
        while(!treeMap.isEmpty()){
            Map.Entry<Integer,List<Integer>> entry = treeMap.pollLastEntry();
            List<Integer> entryList = entry.getValue();
            for(int i : entryList){
                result[i] = index;
            }
            index += entryList.size();
        }
        return result;
    }
    public static void main (String[] args) {
        Main8 m = new Main8();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        in.nextLine();
        String scoresString = in.nextLine();
        for(int rank : m.solution(scoresString , cnt )) {
            System.out.print(rank + " ");
        }
    }
}
