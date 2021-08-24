package test.iqiyi;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class Main2 {
    public static void main(String[] args) {
        final Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(n);
        new Thread(() -> {
            try {
                zeroEvenOdd.printZero(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                zeroEvenOdd.printEven(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                zeroEvenOdd.printOdd(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

class ZeroEvenOdd {
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }


    // printNumber.accept(x) outputs "x", where x is an integer.
    public void printZero(IntConsumer printNumber) throws InterruptedException {

    }

    public void printEven(IntConsumer printNumber) throws InterruptedException {

    }

    public void printOdd(IntConsumer printNumber) throws InterruptedException {

    }


}