import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Search...");
        String search = sc.nextLine();
        search = search.toUpperCase();
        System.out.println(search);
        System.out.print("Enter Age:");
        age = sc.next();
        System.out.println(age);
        
    }
}
