import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Point point = new Point(i,x,y);
            points.add(point);
        }

        Collections.sort(points);
        
        for(int i=0;i<n;i++){
            System.out.println(points.get(i).id+1);
        }
        
    }
}
class Point implements Comparable<Point>{
    int id;
    int x;
    int y;

    public Point(int id, int x, int y){
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point){
        if(Math.abs(point.x)+ Math.abs(point.y)==Math.abs(this.x)+Math.abs(this.y)){
            return this.id - point.id;
        }
        return (Math.abs(this.x) - Math.abs(point.x)) + (Math.abs(this.y) - Math.abs(point.y));
    }

}