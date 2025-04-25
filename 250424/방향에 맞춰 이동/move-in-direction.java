import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 500, y=500;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            if(direction=='N'){ //y++ 
                for(int j=0;j<distance;j++){
                    y++;
                }
            }else if(direction=='S'){//y--
                for(int j=0;j<distance;j++){
                    y--;
                }
            }else if(direction=='W'){ //x++
                for(int j=0;j<distance;j++){
                    x--;
                }
            }else{ //x--
                for(int j=0;j<distance;j++){
                    x++;
                }
            }
        }
        System.out.print((x-500)+" "+(y-500));
    }
}