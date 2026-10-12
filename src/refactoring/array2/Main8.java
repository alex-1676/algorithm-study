package refactoring.array2;
//8 32
//23 87 65 12 57 32 99 81
import java.io.*;
import java.util.*;

public class Main8 {

    public int solution (int size , int search , int[] arr) {
        int left = 0;
        int right = size - 1;
        int mid = 0;
        Arrays.sort(arr);

        while(left <= right) {
            mid = (left + right) / 2;
            if(arr[mid] == search) return mid;

            if(arr[mid] > search) right = mid - 1;
            else left = mid + 1;

        }
        return mid + 1;
    }
    public static void main(String[] args) throws Exception{
        Main8 m = new Main8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] size_search = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int size = size_search[0];
        int search = size_search[1];

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(size , search , arr));
    }
}
