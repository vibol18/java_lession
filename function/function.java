package function;
public class function {
    //function or method
    //non return no param
    static  void _helloWorld(){
        System.out.println("Hello world");
    }
    //non return has param
    static void Name(String name){
        System.out.println("Your Name is" + name);
    }
    //has return no param
    static int sum1(){
        int a =6,b=10;
        return  (a+b);
    }
    // has return has param
    static int sum(int a,int b){
        return  a+b;
    }
    static double sum3(double num1, double num2, double num3){
        return (num1 + num2 + num3);
    }

    public static void main(String[] args) {
        _helloWorld();
        Name("Jam sok");
        System.out.println(sum(10,20));
        System.out.println(sum1());
        System.out.print(sum3(10,9, 8));
    }
}
 