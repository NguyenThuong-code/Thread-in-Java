package oddeven;

public class TestThread {
    public static void main(String[] args) {
        EvenThread event=new EvenThread();
        Thread eventThread = new Thread(event);
        OddThread odd= new OddThread();
        Thread oddThread= new Thread(odd);
        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eventThread.start();
    }
}
