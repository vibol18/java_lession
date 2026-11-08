package loop;

public class forEach {
    public static void main(String[] args) {
        String[] names = {"Jonh","Alice","Jame sok"};
        // for(int i = 0; i<name.length ; i++){
        //     System.out.println(name[i]);
        // }
        for(String name : names){
            System.out.println(name);
        }
    }
}
