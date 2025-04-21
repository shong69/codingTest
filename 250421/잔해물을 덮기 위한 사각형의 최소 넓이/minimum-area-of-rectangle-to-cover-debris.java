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
        for(int i=1000+Math.min(rect1_x1,rect2_x1);i<1000+Math.max(rect1_x2,rect2_x2)+1;i++){
            for(int j=1000+Math.min(rect1_y1,rect2_y1);j<1000+Math.max(rect1_y2,rect2_y2)+1;j++){
                if(x1==0&&arr[i][j]==1){
                    x1 =i;
                }
                if(arr[i][j]==1&&x2<=i){
                    x2 = i;
                }

                if(y1==0&&arr[i][j]==1){
                    y1 =j;
                }
                if(arr[i][j]==1 && y2<=j){
                    y2= j;
                }
            }
        }
        // System.out.println(Math.abs(x1)+" "+Math.abs(x2)+" "+Math.abs(y1)+" "+Math.abs(y2));
        if((x1==y1)||(x2==y2)){
            System.out.print(0);
        }else{
            System.out.print((Math.abs(x2)-Math.abs(x1)+1)*(Math.abs(y2)-Math.abs(y1)+1));
        }
    }
}