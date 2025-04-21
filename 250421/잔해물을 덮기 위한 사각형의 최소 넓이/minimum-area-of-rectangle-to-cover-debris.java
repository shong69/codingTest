import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();

        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        
        int[][] arr = new int[2001][2001];
        for(int i=rect1_x1;i<rect1_x2;i++){
            for(int j=rect1_y1;j<rect1_y2;j++){
                arr[1000+i][1000+j]=1;
            }
        }
        for(int i=rect2_x1;i<rect2_x2;i++){
            for(int j=rect2_y1;j<rect2_y2;j++){
                arr[1000+i][1000+j]=0;
            }
        }
        
        int x1 = 0,x2=0,y1=0,y2=0;
        for(int i=Math.min(rect1_x1,rect2_x1);i<Math.max(rect1_x2,rect2_x2)-Math.min(rect1_x1,rect2_x1);i++){
            for(int j=Math.min(rect1_y1,rect2_y1);j<Math.max(rect1_y2,rect2_y2)-Math.min(rect1_y1,rect2_y1);j++){
                if(x1==0&&arr[1000+i][1000+j]==1){
                    x1 =i;
                }
                if(arr[1000+i][1000+j]==1&&x2<=i){
                    x2 = i;
                }

                if(y1==0&&arr[1000+i][1000+j]==1){
                    y1 =j;
                }
                if(arr[1000+i][1000+j]==1 && y2<=j){
                    y2= j;
                }
            }
        }
        System.out.print((x2-x1+1)*(y2-y1+1));
    }
}