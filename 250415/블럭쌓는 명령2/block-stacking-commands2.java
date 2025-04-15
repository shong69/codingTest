import java.util.*;
public class Main {
    static int[] arr = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            chill(arr,A-1,B-1);
        }

        int maxNum = 0;
        for(int j=0;j<N;j++){
            maxNum = Math.max(maxNum,arr[j]);
        }
       System.out.print(maxNum);
    }
    public static void chill(int[] arr, int a, int b){
        for(int i = a;i<=b;i++){
            arr[i] += 1;
        }
    }
}