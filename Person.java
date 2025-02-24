public class Person{
    String name;
    int age;
    float salary;
    Person(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }

    public static void main(String[] age){
        Person person = new Person("Samrat", 10000, 26);
        person.displayDetails();
    }
}