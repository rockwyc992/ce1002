package ce1002.a13.s102502044;

public class A13 {

    public A13() {
        Bank bank = new Bank(10000);
        
        // initialize 3 consumer and wrap with java thread
        Consumer consumer = new Consumer(1, bank);
        Thread thread = new Thread(consumer);
        thread.start();

        consumer = new Consumer(2, bank);
        thread = new Thread(consumer);
        thread.start();

        consumer = new Consumer(3, bank);
        thread = new Thread(consumer);
        thread.start();
        
        // initialize 3 depositor and wrap with java thread
        Depositor depositor = new Depositor(1, bank);
        thread = new Thread(depositor);
        thread.start();

        depositor = new Depositor(2, bank);
        thread = new Thread(depositor);
        thread.start();

        depositor = new Depositor(3, bank);
        thread = new Thread(depositor);
        thread.start();
    }

    public static void main(String[] argv) {
        new A13();
    }
}

