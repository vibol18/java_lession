package controllstatement;

public class ternary {
    public static void main(String[] args) {
        int age = 19;
        boolean Check = (age >=18) ? true : false;
        // String Check = (age >=18) ? "Adult" : "Not Adult";
        if(Check){
            System.out.println("You Are Adult");
        }
        if(!Check){
            System.out.print("Your are Not adult");
        }
    }
}
