import java.util.Scanner;
public class Main {
    static int[] arrL = new int[200001];
    static int[] arrR = new int[200001];
    static char[] arr = new char[200001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int point = 100000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            point = move(point,x,d);
        }

        int lCount = 0;
        int RCount = 0;
        int GCount = 0;
        for(int i=0;i<arrL.length;i++){
            if(arrL[i]>=2 && arrR[i]>=2){
                GCount++;
            }else{
                //수가 더 큰 쪽을 기록하면 됨
                if (arrL[i] > arrR[i]) {
                    lCount++;
                } else if(arrR[i]>arrR[i]){
                    RCount++;
                }else{
                    //회색 타일이 아니지만 수가 같은 경우
                    if(arr[i]=='L'){
                        lCount++;
                    }else if(arr[i]=='R'){
                        RCount++;
                    }
                }
            }
        }
        System.out.print(lCount +" "+RCount+" "+GCount);
    }
    public static int move(int point,int x, char d){
        if(d=='R'){
            for(int i=0;i<x;i++){
                if(isGray(point)){
                    arr[point]='G';
                    point++;
                    continue;
                }
                arr[point] = 'R';
                if(i<x-1){
                    arrR[point++]++;
                }else{
                    arrR[point]++;
                }
            }

            return point;
        }else{
            
            for(int i=0;i<x;i++){
                if(isGray(point)){
                    arr[point]='G';
                    point--;
                    continue;
                }
                arr[point] = 'L';
                if(i<x-1){
                    arrL[point--]++;
                }else{
                    arrL[point]++;
                }
            }
            return point;
        }
    }

    public static boolean isGray(int x){
        if(arrL[x]>=2 && arrR[x]>=2){
            return true;
        }else{
            return false;
        }
    }
}