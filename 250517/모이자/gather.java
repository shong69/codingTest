import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //i번째 집에 사는 사람 수 가 배열에 기록돼있음
        //i번째 집에 모이기 위해 이동거리의 합이 최소가 되도록 하는 방법 찾기
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += Math.abs(i-j)*a[j];
            }
            minSum = Math.min(minSum, sum);
        }
        System.out.print(minSum);
    }
}