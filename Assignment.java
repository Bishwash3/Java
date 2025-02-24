public class Assignment{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        float a = 30;
        float b = 12;
        float div = a/b;
        float floatNum1 = 10.5f;
        float floatNum2 = 20.8f;
        float difference = floatNum1 - floatNum2;
        System.out.println("The difference between " + floatNum1 + " and " + floatNum2 + " is " + difference);
        System.out.println("Division is:" + div);

// --------------------------------------------
        // OPERATORS

        int c = 30;
        int d = 40;

        System.out.println("c > d:" + (c> d));
        System.out.println("c < d:" + (c< d));
        System.out.println("c == d:" + (c == d));
        System.out.println("c <= d:" + (c <= d));
        System.out.println("c >= d:" + (c >= d));
        System.out.println("c != d:" + (c != d));

        // __________________________________

        boolean x = true;
        boolean y = false;

        System.out.println("x && y:" + (x && y));
        System.out.println("x || y:" + (x || y));
        System.out.println("!x:" + (!x));
        System.out.println("!y:" + (!y));

        //-------------------------------------
        int e = 2;
        System.out.println("e:" + (e -= 3));
        System.out.println("e:" + (e += 3));
        System.out.println("e:" + (e *= 3));
        System.out.println("e:" + (e /= 3));
        System.out.println("e:" + (e %= 3));

        int k = 10;
        int l = 20;

        int value = k>l?k:l;

    System.out.println(value);   

    boolean bol =(k>l)?true:false;
    System.out.println(bol);   


    System.out.println("_______________________________________________________");   

    int n = 9;
    int m = 10;

    int bitwise = (n&m);

    System.out.println(bitwise);   
    System.out.println("bitwise or:" + (m|n));   
    System.out.println("bitwise or:" + ~m);   
    System.out.println("bitwise or:" + ~n);  

    System.out.println("_______________________________________________________");   

    int post = 5;

    System.out.println("post increment:" + post++);   

    System.out.println("After increment:" + post);   

    int pre = 5;

    System.out.println("pre increment:" + ++pre);   

    System.out.println("_______________________________________________________");   

    int postDec = 7;

    System.out.println("post decrement:" + postDec--);
    System.out.println("post decrement:" + postDec);   

    int preDec = 8;

    System.out.println("pre decrement:" + --preDec); 


    System.out.println("_______________________________________________________");   

    int shift = 5;

    int shifted = (shift << 1);

    System.out.println("Left shifted element by 1:" + shifted); 

    System.out.println("left shifted element by 2 : " + (shift << 2)); 


    System.out.println("right shifted element : " + (shift >> 1)); 
    System.out.println("right shifted element by 2 : " + (shift >> 2)); 




    }
}