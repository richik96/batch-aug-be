package OS1.Concurrency.AdderSubSynchronizedMethod;

//import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Count count;

    public Adder(Count count1){
        this.count = count1;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){

            count.incrementValue(i);
            System.out.println("Count in adder = " +count.getValue() + " in : "+Thread.currentThread().getName());

        }
    }
}
