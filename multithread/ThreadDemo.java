package multithread;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Mythread t = new Mythread();
        t.start();
        t.setPriority(10);
      //  t.join();
        //t = new Mythread();

        for (int i = 0; i < 5; i++) {
            System.out.println("MAIN JOB");
        }
    }
}
