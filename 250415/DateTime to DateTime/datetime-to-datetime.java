import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int num = 24*60*11+60*11+11;
        if((A*24*60+B*60+C - num)>0){
            System.out.print(A*24*60+B*60+C - num);
        }else if((A*24*60+B*60+C - num)==0){
            System.out.print(0);
        }else{
            System.out.print(-1);
        }
    }
}