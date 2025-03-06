public class PassByValue {
    static void printSum(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        b = 20;
        System.out.println(b);
        printSum(100, 200);
    }
}
