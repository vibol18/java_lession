package controllstatement;
import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        boolean it_Rain = true;
        Scanner sc = new Scanner(System.in);
        int age = 18;
        String search;
        if (it_Rain){
            System.out.println("Don't forget umbrella");
        }
        if(age == 18){
            System.out.println("Your are Adult");
        }
        System.out.print("Sreach...");
        search = sc.nextLine();
        if(search.equals("coca")){
            System.out.println("Product Found");
        }
        System.out.println("Product Not Found");
    }
}
