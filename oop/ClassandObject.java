package oop;
class Person{
    //datamember

    //accessmodifier
    public int id;
    public String name;
    public String gender;
    void show(){
        System.out.println("id"+id);
        System.out.println("Name:"+name);
        System.out.println("Gender"+gender);
    }
    //function member method member
};
public class ClassandObject {
    public static void main(String[] args) {
        Person p = new Person();
        p.id = 10;
        p.name = "Jame sok";
        p.gender = "Male";
        p.show();
    }
}