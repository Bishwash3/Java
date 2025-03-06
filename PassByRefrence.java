public class PassByRefrence {
    static class Car{
        String name;
        int Price;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Honda";
        car1.Price = 100000;
        System.out.println(car1.name);
        System.out.println(car1.Price);

        Car car2 = new Car();
        car2 = car1;
        System.out.println(car1.name);
        System.out.println(car1.Price);

        car2.name = "Audi";
        car2.Price = 200000;

        System.out.println(car2.name);
        System.out.println(car2.Price);

        System.out.println(car1.name);
        System.out.println(car1.Price);

    }
}
