import java.util.Scanner;
public class Main {
    static int LCount = 0;
    static int RCount = 0;
    static char D;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if(i==0){
                D = d;
                if(d=='L') LCount+=x;
                else RCount+=x;
            }else{
                move(x,d);  
            }
        }
        System.out.print(LCount +" "+RCount);
    }
    public static void move(int x, char d){
        if(d=='L'){
            LCount+=x;
            if(RCount>=LCount){
                LCount=x;
                RCount-=LCount;
            }else{
                RCount=0;
            }
        }else{
            RCount+=x;
            if(RCount>=LCount){
                LCount=0;
            }else{
                RCount=x;
                LCount-=RCount;
            }
        }

    }
}