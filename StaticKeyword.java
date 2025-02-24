public class StaticKeyword{
    String employeeName;
    static String employeeCEO;
    double employeeSalary;

    void displayDetails(){
        System.out.println("Employee Name :" + employeeName);
        System.out.println("Employee CEO :" + employeeCEO);
        System.out.println("Employee Salary :" + employeeSalary);

    }

    public static void main(String[] args){
        StaticKeyword object1 = new StaticKeyword();
        StaticKeyword object2 = new StaticKeyword();

        StaticKeyword.employeeCEO = "Bishwash";

        object1.employeeName = "Samrat";
        object1.employeeSalary = 5000;

        object2.employeeName = "Partik";
        object2.employeeSalary = 500;
        
        object1.displayDetails();

        System.out.println("-------------------------");

        object2.displayDetails();
    }
}