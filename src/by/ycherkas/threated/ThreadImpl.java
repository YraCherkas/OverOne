package by.ycherkas.threated;

public class ThreadImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + " Цикл " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
