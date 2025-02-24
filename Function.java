import java.util.Scanner;
public class Function{

    static int addition(int a, int b){
        return a + b;
    }

    static int multiple(int c, int d, int e){
        return c*d*e;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int c = scanner.nextInt();
        System.out.println("Enter number:");
        int d = scanner.nextInt();
        System.out.println("Enter number:");
        int e = scanner.nextInt();

      //Addition
        int firatAddition = addition(c,d);
        System.out.println("First Addition:" + firatAddition);

        //Multiple
        int multiple = multiple(c,d,e);
        System.out.println("multiple:" + multiple);
        scanner.close();

    }
}