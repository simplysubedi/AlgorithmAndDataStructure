public class BasicThread extends Thread{
    @Override
    public  void run(){
        System.out.println("Hello from thread");
    }
    public static void main (String args []){
        BasicThread thread = new BasicThread();
        thread.start();

    }
}
