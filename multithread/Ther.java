package multithread;

public class Ther implements Runnable{
    @Override
    public void run() {

    }

    Ther(){
        System.out.println("heh");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Runnable rub  = new Ther();
            Thread th = new Thread(rub);
            th.start();
        }

    }
}
