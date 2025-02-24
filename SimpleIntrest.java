import java.util.Scanner;

class SimpleInterest {
    static double principal;
    static double rate;
    static double time;

    static double calculateSI() {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = sc.nextDouble();

        sc.close();

        System.out.println("Simple Interest: " + calculateSI());
    }
}
