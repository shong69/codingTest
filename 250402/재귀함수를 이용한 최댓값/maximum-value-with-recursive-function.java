import java.util.*;
public class Main {
    static int[] arr0= new int[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr0=arr;
        System.out.print(getMax(n));
    }
    public static int getMax(int n){
        if(n-1<0){
            return 0;
        }
        return Math.max(getMax(n-1),arr0[n-1]);
    }
}