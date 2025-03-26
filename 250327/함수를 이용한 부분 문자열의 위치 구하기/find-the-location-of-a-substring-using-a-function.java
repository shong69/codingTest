import java.util.Scanner;
public class Main {
    static String str;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        str = text;
        String pattern = sc.next();
        
        seekPattern(pattern);
    }
    public static void seekPattern(String pattern){
        String val = str;
        int idx = -1;
        for(int i=0;i<val.length()-pattern.length()+1;i++){
            boolean isRight = true;
            for(int j = 0;j<pattern.length();j++){
                if(val.charAt(i+j)!=pattern.charAt(j)){
                    isRight = false;
                    break;
                }
            }
            if(isRight) {
                idx = i;
                break;
            }
        }
        System.out.print(idx>=0?idx:-1);
    }
}