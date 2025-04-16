import java.util.Scanner;
public class Main {
    static int[] arrL = new int[200000];
    static int[] arrR = new int[200000];
    static char[] arr = new char[200000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int point = 100000;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            point = move(point,x,d);
        }
        // for(int i=0;i<20;i++){
        //     System.out.print(arr[i]);
        // }
        int lCount = 0;
        int RCount = 0;
        int GCount = 0;

        for(int i=0;i<arrL.length;i++){
            if(arrL[i]>=2 && arrR[i]>=2){
                GCount++;
            }else{
                //수가 더 큰 쪽을 기록하면 됨
                if(arr[i]=='L'){
                    lCount++;
                }else if(arr[i]=='R'){
                    RCount++;
                }
            }
        }
        System.out.print(lCount +" "+RCount+" "+GCount);
    }
    public static int move(int point,int x, char d){
        if(d=='R'){
            for(int i=0;i<x;i++){
                
                if(isGray(point)){
                    if(i<x-1)point++;
                    continue;
                }
                arr[point] = 'R';
                if(i<x-1){
                    arrR[point++]++;
                }else{
                    arrR[point]++;
                }
                // System.out.println(arr[point]);
            }

            return point;
        }else{
            
            for(int i=0;i<x;i++){
                if(isGray(point)){
                    if(i<x-1)point--;
                    continue;
                }
                arr[point] = 'L';
                if(i<x-1){
                    arrL[point--]++;
                }else{
                    arrL[point]++;
                }
                // System.out.println(arr[point]);
            }
            return point;
        }
    }

    public static boolean isGray(int x){
        if(arrL[x]>=2 && arrR[x]>=2){
            arr[x]='G';
            return true;
        }else{
            return false;
        }
    }
}