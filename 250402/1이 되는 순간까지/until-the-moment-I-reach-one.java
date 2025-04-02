import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print(getCount(n));
    }
    public static int getCount(int n){
        if(n==1){
            return 0;
        }
        if(n%2 == 0){
             return getCount(n/2)+1;
        }else{
            return getCount(n/3)+1;
        }
    }
}