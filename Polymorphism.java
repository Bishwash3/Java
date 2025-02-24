public class Polymorphism {
    
    //Method Overloading
    //Example:
    // int add(int a, int b);
    // int add (int a, int b, int c)
    // double add(double a, double b, double c)

    //EXAMPLE

    int add(int a, int b){
        return a+b;
    }

    //Method overloaded with three parameters

    int add(int a, int b, int c){
        return a+b+c;
    }
 
    //Method overloaded with two double parameters

    double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args){
        Polymorphism addition = new Polymorphism();
        int firstReasult = addition.add(10, 20);
        System.out.println(firstReasult);

        System.out.println("--------------------");

        Polymorphism addition2 = new Polymorphism();
        int secondReasult = addition2.add(10,20,30);
        System.out.println(secondReasult);

        System.out.println("--------------------");

        Polymorphism addition3 = new Polymorphism();
        double thirdReasult = addition3.add(10,20);
        System.out.println(thirdReasult);


    }
    
}
