public class sleep {
    public static void main(String[] args) {
        Thread firstThread = new Thread( () ->{
            try {
                for(int i = 1; i <= 3; i++){
                    System.out.println("Firt thread Count:" + i);
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } );


        Thread secondThread = new Thread( () ->{
            try {
                for(int i = 1; i <= 3; i++){
                    System.out.println("Second thread Count:" + i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } );

        firstThread.start();
        secondThread.start();
    }
}
