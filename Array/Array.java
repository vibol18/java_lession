package Array;

public class Array {
    public static void main(String[] args) {
        int [] id = new  int[10];
        int [] number = {10,40,20,30};
        String [] name = {"jonh","pisey","jamesok","Dara","smith"};
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        for(int num : number){
            System.out.println(num);
        }
        for(int i = 0; i<=name.length; i++){
            System.out.println(name[i]);
        }
    }
}
