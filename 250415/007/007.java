import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        Code code = new Code(sCode, mPoint, time);
        System.out.printf("secret code : %s\n",code.code);
        System.out.printf("meeting point : %c\n",code.point);
        System.out.printf("time : %d",code.time);
    }
}

class Code{
     String code;
     char point;
     int time;

    public Code(String code, char point, int time){
        this.code = code;
        this.point = point;
        this.time  = time;
    }
}