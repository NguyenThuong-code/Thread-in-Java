package trial;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current Thread: "+ t.getName());

        //change name Main Thread to CodeGym
        t.setName("CodeGym");
        System.out.println("After rename:"+ t.getName());

        // get priority of Main Thread
        System.out.println("Priority of Main Thread:" + t.getPriority());

        //Set priority of Main Thread(Max= 10)
        t.setPriority(MAX_PRIORITY);
        System.out.println("Priority of new Main Thread:"+ t.getPriority());

        for (int i=0; i<5; i++){
            System.out.println("Main Thread");
        }
        // Main thread create a child thread
        ChildThread ct= new ChildThread();
        //Set level priority for child thread(extends from priority from Thread created =>10)
        System.out.println("Priority of Child thread:"+ct.getPriority());

        //set priority for child thread(Min is 1)
        ct.setPriority(MIN_PRIORITY);
        System.out.println("New priority of Child thread:"+ct.getPriority());
        ct.start();

    }

}
class ChildThread extends Thread{
    @Override
    public  void run(){
        for (int i =0; i<5; i++){
            System.out.println("Child Thread");
        }
    }
}