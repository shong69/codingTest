import java.util.Scanner;
public class Main {
    static int[] arr; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) { //수열
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) { //a1부터 a2까지의 합 구하기
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            addSum(a1,a2);
        }
    }
    public static void addSum(int a, int b){
        int sum = 0;
        for(int i = a;i<=b;i++){
            sum += arr[i-1];
        }
        System.out.println(sum);
    }
}