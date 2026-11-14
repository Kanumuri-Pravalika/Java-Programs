class NumThread extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.print(i + "/t");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        NumThread nt = new NumThread();
        Thread t = new Thread(nt);
        t.start();
    }
}
