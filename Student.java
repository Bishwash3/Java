public class Student{
    String name;
    int rollNo;
    float marks;
    Student(String name, int rollNo, float marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayDetails(){
        System.out.println(name);
        System.out.println(rollNo);
        calculateMarks();

    }
    void calculateMarks(){
        if(marks >= 90){
        System.out.println("A+");
        }
        if(marks >= 80 && marks < 90){
        System.out.println("B+");
        }
        else{
        System.out.println("Average");

        }
    }

    public static void main(String[] args){
        Student std = new Student("Samrat", 7, 82);
        std.displayDetails();
    }
}