
class Assignment6 {
    
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Please provide 3 inputs");
        }
        double principal = Double.parseDouble(args[0]);
        double rateOfInterest = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        // Calculate Simple Interest
        double simpleInterest = (principal * rateOfInterest * time) / 100;

        // Display the result
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
 
