import java.util.Scanner;
public class Main {
    static int a; 
    static int b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        // a = i; 
        // b = j;
        // sumAb(a,b); a,b를 함수 안에서 바꿔서 call By Value가 된다.
        sumAb(i,j);
        System.out.print(a + " "+ b);
    }
    public static void sumAb(int i, int j){
        //static 변수에 i,j값을 넣는다.
        if(i>j){
            a = i*2;
            b = j+10;
        }else{
            a = i+10;
            b = j*2;
        }
        
    }
}
