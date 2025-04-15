import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            Student stu = new Student(i+1, height, weight);
            arr[i] = stu;
        }
        
        Arrays.sort(arr);

        for(Student stu:arr){
            System.out.println(stu.height+" "+stu.weight+" "+stu.id);
        }

    }
}
class Student implements Comparable<Student>{
    int id;
    int height;
    int  weight;

    public Student(int id, int height, int weight){
        this.id= id;
        this.height= height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student s){
        if(this.height == s.height){
            return s.weight - this.weight;
        }
        return this.height - s.height;
    }
}