package controllstatement;

import java.util.Scanner;

public class switchcase {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        int day;
        System.out.print("Enter Day [1-7]");
        day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Moday");
                break;
            case 2:
                System.out.println("Tuesday");
            break;
            case 3:
                System.out.println("Wed");
            break;
            case 4:
                System.out.println("thu");
            break;
            case 5:
                System.out.println("Fri");
            break;
            case 6:
                System.out.println("Sat");
            break;
            case 7:
                System.out.println("sun");
            break;
            default:
            System.out.println("Holiday");
                break;
        }
    }
}
