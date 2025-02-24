public class Assignment4 {
    //Rectangle
    static double area(double l, double b){
        return l*b;
    }

    static float area(float l, float b){
        return 2*(l+b);
    }

    public static void main(String[] args) {
        System.out.println("Area Rectangle :" + Assignment4.area(10, 20));
        System.out.println("Perimeter of recttangle : " + Assignment4.area(122.5, 5.25));


    }
}
