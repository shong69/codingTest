import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int num1 = 0;
        for(int i=0;i<m1-1;i++){
            num1 += days[i];
        }
        num1 += d1;
        int num2 = 0;
        for(int j=0;j<m2-1;j++){
            num2 += days[j];
        }
        num2 += d2;

        System.out.print(num2 - num1+1);
    }
}