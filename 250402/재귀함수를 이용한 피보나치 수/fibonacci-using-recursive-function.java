import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibpnacci(n));
    }
    public static int fibpnacci(int n){
        if(n == 1||n==2){
            return 1;
        }
        return fibpnacci(n-1) + fibpnacci(n-2);
    }
}