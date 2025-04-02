import java.util.*;
//배열을 돌면서 두 수씩 최소공배수를 구하는 방법
public class Main {
    static int[] arr0 = new int[5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        arr0 = arr;
        System.out.print(f(arr0,arr.length-1));
    }
    public static int lcm(int a, int b){ //최소 공배수 구하기 : 두 수를 곱하고 최소공약수로 나눈다
        return a*b/gcd(a,b);
    }

    public static int gcd(int a, int b){ //최대 공약수 재귀로 구하기
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static int f(int[] arr, int n){//배열과 비교할 인덱스 n
        if(n==0){
            return arr[0];
        }
        return lcm(arr[n], f(arr,n-1)); //최소공배수로 비교하는 수들을 재귀하여 계속 구한다.
    }
}