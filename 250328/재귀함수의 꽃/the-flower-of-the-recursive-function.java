import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printMin(n);
    }
    public static void printMin(int n){
        if(n == 0)return;
        System.out.print(n +" ");
        printMin(n-1);
        System.out.print(n +" ");
    }
}