import java.util.Scanner;

public class studentController {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student_name:");
        stu.name = in.next();
        System.out.print("Enter Age:");
        stu.age = in.nextInt();
        System.out.print("Enter Score:");
        stu.score = in.nextDouble();
    }
}
