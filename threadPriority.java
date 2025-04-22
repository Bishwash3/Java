class firatThread extends Thread{
 public void run(){
    System.out.println(
        getName() + "(Priority : " + getPriority() + " ) is running"
    );
 }
}

class secondThread extends Thread{
    public void run(){
        System.out.println(
            getName() + "(Priority : " + getPriority() + " ) is running"
        );
     }
}

public class threadPriority {firatThread
    public static void main(String[] args) {

        firatThread ft = new firatThread();
        secondThread st = new secondThread();
        
        // set priority

        ft.setPriority(Thread.MIN_PRIORITY);
        st.setPriority(Thread.MAX_PRIORITY);

        // set name for thread 

        ft.setName("First Thread");
        st.setName("Second Thread");

        ft.start();
        st.start();

        try {
            ft.join();
            st.join();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("All thread executed succesfully");

    }
}
