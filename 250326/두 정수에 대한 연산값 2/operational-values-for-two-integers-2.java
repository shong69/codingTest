import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        sumAb(a,b);
    }
    public static void sumAb(int a, int b){
        //a가 더 작은 수가 되도록
        if(Integer.compare(a,b)>0){
            System.out.print((b+10)+" "+(a*2));
        }else{
            System.out.print((a+10) +" "+ (b*2));
        }
        
    }
}