package oddeven;

public class EvenThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i=1; i<11;i++){
                if (i%2==0){
                    System.out.println("Run number even from 1 to 10: "+i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
