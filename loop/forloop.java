package loop;
//for(init;condition;step){

// statement
// }

import java.util.Scanner;

public class forloop {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i += 1) {
            System.out.println("Hello " + i);
            sum += i;
        }
        System.out.println(sum);
        String answer;
        do {
            System.out.print("Do you love me: ");
            answer = sc.nextLine();
        } while (!answer.equalsIgnoreCase("yes"));
        System.out.println("❤️ I knew it!");

    }
}