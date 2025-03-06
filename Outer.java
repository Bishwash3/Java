public class Outer{
    class Inner{
        void displayInnerClassDetails(){
            System.out.println("Inside non static nested (Inner) class example");
        }
    }

    public static void main(String[] args) {
        Outer otr = new Outer();
        Outer.Inner inn = otr.new Inner();
        inn.displayInnerClassDetails();
    }
}