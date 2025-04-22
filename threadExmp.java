import java.lang.Thread;

class myThreadClass extends Thread{
    public void run(){
        for(int i = 1; i<5; i++){
            System.out.println("Thread: " + i);
        }
    }
}

public class threadExmp{
public static void main(String[] args){
    myThreadClass t1 = new myThreadClass();
    t1.start();
}
}