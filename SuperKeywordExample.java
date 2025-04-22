class Parent{
    int number = 100;

    Parent(){
        System.out.println("Parent Called");
    }

    void otherMethod(){
         System.out.println("Other method called");
    }

    void secondMethod(){
        System.out.println("Second method called");
    }
}

class Child extends Parent{
    int number = 200;
    
    void display(){
        super.otherMethod();
        System.out.println("Parent number is:" + super.number);
        System.out.println("Child number is:" + this.number);

    }
}

public class SuperKeywordExample {

    public static void main(String[] args) {
        Child firstChild = new Child();
        firstChild.display();
    }
}
