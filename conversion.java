public class conversion {
    public static void main(String[] args) {
        int number = 123;
        String stringToNumber = String.valueOf(number);
        System.out.println("Before:" + number);
        System.out.println("After conversion:" + stringToNumber);
        System.out.println(stringToNumber.getClass().getName());

        System.out.println("-------------------------------------");


        String mixedCase = "samrat Singh";

        System.out.println("Upper Case:" + mixedCase.toUpperCase());
        System.out.println("Lower Case:" + mixedCase.toLowerCase());

        // Extractinng character

        System.out.println("-----------------------------------");


        String name = "Someone";
        char firstChar = name.charAt(0);
        char fourthChar = name.charAt(3);

        System.out.println("First Character:" + firstChar);
        System.out.println("Fourth Character:" + fourthChar);

        System.out.println("-----------------------------------");

        // String comparison

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = "java";

        System.out.println("s1 == s2: " + (s1 == s2));

        System.out.println("s2 == s3: " + (s2 == s3));

        System.out.println("s2 == s4: " + s2.equalsIgnoreCase(s4));


    }
}
