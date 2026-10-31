package controllstatement;

import java.util.Scanner;

public class ifelseif {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int score;
        System.out.println("Enter Score");
        score = sc.nextInt();
        if(score <= 100){
        if(score >=90){
            System.out.println("Grade A");
        }else if(score >= 80){
            System.out.println("Grade B");
        }else if(score >= 70){
            System.out.println("Grade C");
        }
        else if(score >= 60){
            System.out.println("Grade D");
        }else if(score >= 50){
            System.out.println("Grade E");
        }
    }
    }
}
