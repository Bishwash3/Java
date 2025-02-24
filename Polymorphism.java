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
    
}
