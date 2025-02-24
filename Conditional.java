// conditional statements

import java.util.Scanner;

public class Conditional{
    public static void main (String[] args){
        // if-else

        int age = 20;
        if(age >= 18){
            System.out.println("Person eligible to vote");
        }
        else{
        System.out.println("person is not eligible to vote");
        }

        int number = 20;

         if(number%2 == 0 ){
            System.out.println("even number");
        }

        else if(number == 0){
        System.out.println("Number is:" + number);
        } 
        
        else if( number < 0){
        System.out.println("Number is less then Zero:" + number);
        }

        else{
        System.out.println("Odd number");
        }
        int day = 7;

        switch (day){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("monday");
            break;
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thursday");
            break;
            case 6:
            System.out.println("friday");
            break;
            case 7:
            System.out.println("saturday");
            break;
            default: System.out.println("Day not found in week");
        }

        System.out.println("__________________________________________");

        int a = 10;
        int b = 20;
        int c = 30;

        if(a >b && a>c){
            System.out.println("A is the greatest number:" + a);
        }

        if(b >a && b>c){
            System.out.println("B is the greatest number:" + b);
        }

        if(c >a && c>b){
            System.out.println("C is the greatest number:" + c);
        }

            System.out.println("--------------------------------------------------");

        char operator = '*';
        double num1 = 10;
        double num2 = 20;
        double reasult;

        switch(operator){
            case '+':
                reasult = num1 + num2;
            System.out.println("Addition is:" + reasult);
            break;
            case '-':
                reasult = num2 - num1;
            System.out.println("substraction is:" + reasult);
            break;
            case '/':
                reasult = num1/num2;
            System.out.println("Division is:" + reasult);
            break;
            case '*':
                reasult = num1 * num2;
            System.out.println("Multiplication is:" + reasult);
            break;
            default: System.out.println("Operation is not performable");
        }

        System.out.println("----------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number:");

        int firstNumber = scanner.nextInt();

        System.out.println("The entered number is:" + firstNumber);

        // for character, string, double, float values use scanner.next--- data type syntax.
        scanner.close();

    }
}