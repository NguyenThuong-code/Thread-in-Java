package basicthread;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        try{
for (int i =0;i<10;i++){
    System.out.println("Number integer from 0 to 9 "+i);
    Thread.sleep(500);
}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
