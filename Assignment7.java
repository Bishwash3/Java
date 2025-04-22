// Over loading example

class overloading{
    static int add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
                return sum;
    }

    static double add(double a, double b){
        double sum = a+b;
        System.out.println(sum);
                return sum;
    }

    static int add(int a, int b, int c){
        int sum = a+b;
        System.out.println(sum);
                return sum;
    }

}

public class Assignment7 {
    public static void main(String[] args) {
        overloading one = new overloading();
        one.add(10,20);
        one.add(10,20,30);

    }
}
