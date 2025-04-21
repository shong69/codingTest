import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr1 = new int[1000000];
        int[] arr2 = new int[1000000];
        //idx가 각 초를 의미함
        int cho1 = 0, cho2 = 0;
        int pos1 = 0,pos2=0;
        for(int i=0;i<n;i++){
            char ch = sc.next().charAt(0);
            int N = sc.nextInt();
            if(ch=='R'){
                for(int j=0;j<N;j++){
                    arr1[cho1++]=pos1++;
                }
            }else{
                for(int j=0;j<N;j++){
                    arr1[cho1++] = pos1--;
                }
            }
        }
        for(int i=0;i<m;i++){
            char ch = sc.next().charAt(0);
            int N = sc.nextInt();
            if(ch=='R'){
                for(int j=0;j<N;j++){
                    arr2[cho2++]=pos2++;
                }
            }else{
                for(int j=0;j<N;j++){
                    arr2[cho2++] = pos2--;
                }
            }
        }

        boolean isTrue = false;
        for(int i=1;i<Math.max(cho1,cho2);i++){
            if(i!=1&&arr1[i]==arr2[i]){
                isTrue= true;
                System.out.print(i);
                break;
            }
        }
        if(!isTrue)System.out.print(-1);

    }
}