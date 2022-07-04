package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class ArrayBlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("William");
    }
}
