package loop;
//for(init;condition;step){
// statement
// }
public class forloop {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<=10; i+=1){
            System.out.println("Hello "+i);
            sum +=i;
        }
        System.out.println(sum);
    }
}