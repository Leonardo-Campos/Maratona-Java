package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

public class ThreadTest01 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;

    }
    private static void sumFor(long num){
        System.out.println("Sum for");
    }
}
