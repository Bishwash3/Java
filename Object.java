class Car{
    String brand;
    int speed;

    void displayCarDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

public class Object{
    public static void main(String[] args){
        Car car1 = new Car();
        car1.brand = "Honda";
        car1.speed = 200;
        car1.displayCarDetails();
    }

}



