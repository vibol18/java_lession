package controllstatement;

import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        boolean reqirments = true;
        System.out.print("Enter Value:");
        age = in.nextInt();
        if (reqirments) {
            if (age >= 18) {
                System.out.println("Tmr come here");
            }else{
                System.out.println("Your are not Adult");
            }
        }

    }
}
