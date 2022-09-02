package basicthread;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class Main {
    public static void main(String[] args) {
        NumberGenerator ng1= new NumberGenerator();
        NumberGenerator ng2= new NumberGenerator();
        Thread tt1= new Thread(ng1);
        Thread tt2= new Thread(ng2);
        tt1.start();
        tt2.start();
        tt1.setPriority(MAX_PRIORITY);
        tt2.setPriority(MIN_PRIORITY);
        System.out.println("priority of thread tt1: " +tt1.getPriority());
        System.out.println("priority of thread tt2: " +tt2.getPriority());
    }
}
