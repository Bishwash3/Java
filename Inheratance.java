public class Inheratance {
    static class dog{
        static void bark(){
            System.out.println("Dog Barks");
        }
    }

    static class cat extends dog{
        static void meow(){
            System.out.println("Cat Meow");
        }
    }

    public static void main(String[] args) {
        dog.bark();
        cat.bark();
        cat.meow();
    }
}
