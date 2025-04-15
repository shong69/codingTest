import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        //c시 d분 - a시 b분 
        int num = c*60 + d -(a*60 + b);

        System.out.print(num);
    }
}