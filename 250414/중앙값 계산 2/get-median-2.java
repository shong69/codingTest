import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // (i+1/2)+1번째 값 출력하기
            list.add(arr[i]);
            if(i%2==0){
                list.sort((a,b)->Integer.compare(a,b));
                int num = list.get(list.size()/2);
                System.out.print(num+" ");
            }
        }
        


    }

}