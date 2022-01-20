package by.ycherkas.threated;

public class Main {
    public static void main(String[] args) {
//        new MyThread("Первый поток").start();
//        new MyThread("Второй поток").start();
//        new MyThread("Третий поток").start();
//        new MyThread("Четвёртый поток").start();

        Thread myThread = new Thread(new ThreadImpl(), "MyThread1");
        myThread.start();
        Thread myThread1 = new Thread(new ThreadImpl(), "MyThread2");
        myThread1.start();
        Thread myThread2 = new Thread(new ThreadImpl(), "MyThread3");
        myThread2.start();
        Thread myThread3 = new Thread(new ThreadImpl(), "MyThread4");
        myThread3.start();
        }
}
