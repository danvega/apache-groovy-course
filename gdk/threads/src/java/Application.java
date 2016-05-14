package java;

public class Application {

    public static void main(String[] args) {
        RunnableDemo demo = new RunnableDemo();

        Thread t = new Thread(demo);
        t.start(); // calls run

        // Java 8
        // Since Runnable is a functional interface we can make an instance with a lamda expression


        // This is just the start of threads. I would encourage you to read up on threads in Java if you want to learn more

    }

}
