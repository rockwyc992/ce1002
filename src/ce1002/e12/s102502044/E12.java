package ce1002.e12.s102502044;

public class E12 {

    public E12() {
        Bank bank = new Bank(10000);
        
        Consumer consumer1 = new Consumer(1, bank);
        Consumer consumer2 = new Consumer(2, bank);
        Consumer consumer3 = new Consumer(3, bank);
        
        Thread thread = new Thread(consumer1);
        thread.start();
        thread = new Thread(consumer2);
        thread.start();
        thread = new Thread(consumer3);
        thread.start();
    }

    public static void main(String[] argv) {
        new E12();
    }
}
