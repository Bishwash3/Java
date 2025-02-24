// 1. Give an example of logical Operator (||, &)
// 2. Give an example of Bitwise Operator(~)
// 3. Give an example of arthematic operator(+, %);
// 4. Give an example of ternary operator (check for eligible for vote or not)
// 5. Give an example of pre-inc and post-dec (number 8)
// 6 Give an example of right shift by 3 (number = 7)

public class Assignment2 {
    public static void main(String[] args) {

        // 1. Logical Operators (||, &&)
        boolean a = true, b = false;
        System.out.println("Logical OR (||): " + (a || b)); 
        System.out.println("Logical AND (&&): " + (a && b)); 


        // 2. Bitwise Operator (~)
        int num = 8;
        System.out.println("Bitwise NOT (~): " + (~num)); 


        // 3. Arithmetic Operators (+, %)
        int x = 10, y = 3;
        System.out.println("Addition (+): " + (x + y)); 
        System.out.println("Modulus (%): " + (x % y));


        // 4. Ternary Operator (Vote eligibility check)
        int age = 18;
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(result);


        // 5. Pre-increment and Post-decrement (number 8)
        int number = 8;
        System.out.println("Pre-increment (++number): " + (++number)); 
        System.out.println("Post-decrement (number--): " + (number--)); 
        System.out.println("After Post-decrement: " + number); 


        // 6. Right Shift by 3 (number = 7)
        int shiftNum = 7;
        System.out.println("Right Shift (7 >> 3): " + (shiftNum >> 3));
    }
}
