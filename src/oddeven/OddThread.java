package oddeven;

public class OddThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i=1; i<11;i++){
                if (i%2!=0){
                    System.out.println("Run number odd from 1 to 10: "+i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
