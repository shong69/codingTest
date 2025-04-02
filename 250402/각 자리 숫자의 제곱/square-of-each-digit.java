import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(getPow(n));
    }
    public static int getPow(int n){
        if(n<10){
            return n*n;
        }
        return getPow(n/10) + (n%10)*(n%10);
    }
}