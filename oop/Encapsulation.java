package oop;
class Car{
    private int id;
    private String model_name;
    private String color;
    private double height;
    private double price;
    void setID(int id){
        this.id = id;
    }
    int getId(){
        return id;
    }
    void setModelName(String model_name){
        this.model_name = model_name;
    }
    String getModelName(){
        return model_name;
    }
    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return  color;
    }
     void setHeight(Double height){
        this.height = height;
    }
    Double getHeight(){
        return  height;
    }
    void setPrice (Double price){
        this.price = price;

    }
    Double getPrice(){
        return price;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Car c = new Car();
        c.setID(1);
        c.getId();
    }
}
