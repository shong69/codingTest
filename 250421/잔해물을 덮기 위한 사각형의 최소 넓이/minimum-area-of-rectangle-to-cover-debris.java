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
        
        int x1 =1000+Math.max(rect1_x2,rect2_x2),x2=0,y1=1000+Math.max(rect1_y2,rect2_y2),y2=0;

        boolean isExist = false;
        for(int i=Math.min(rect1_x1,rect2_x1);i<Math.max(rect1_x2,rect2_x2)+1;i++){
            for(int j=Math.min(rect1_y1,rect2_y1);j<Math.max(rect1_y2,rect2_y2)+1;j++){
                if(arr[1000+i][1000+j]==1&&Math.min(x1,1000+i)==1000+i){
                    x1= 1000+i;
                }
                if(arr[1000+i][1000+j]==1 && x2<=1000+i){
                    isExist = true;
                    x2 = 1000+i;
                }
                if(arr[1000+i][1000+j]==1&&Math.min(y1,1000+j)==1000+j){
                    y1= 1000+j;
                }

                if(arr[1000+i][1000+j]==1 && y2<=1000+j){
                    y2= 1000+j;
                }
            }
        }
        // System.out.println(x1+" "+x2+" "+y1+" "+y2);

        if(isExist)System.out.println((x2-x1+1)*(y2-y1+1));
        else System.out.print(0);
    }
}