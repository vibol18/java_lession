package oop;
class Student{
    private int id;
    private String name;
    private String gender;
    private int age;
    //constructor has param
    Student(int id, String name, String gender, int age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        if(age > 0){
            this.age = age;
        }
    }
    //default Constructor
    Student(){
        id = 0;
        name = null;
        gender = null;
        age = 0;
    }
    void showStu(){
        System.out.println("name"+name+"id"+id+"gender"+gender);
    }
}
//constructor Parameter
//default constructor
public class Constructor {
    public static void main(String[] args) {
        Student stu = new Student(1, "Jame sav", "Female", -100);
        stu.showStu();
    }

}
//banking deposit withdraw