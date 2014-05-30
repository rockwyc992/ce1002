package ce1002.a13.s102502044;

import java.util.Random;

public class Bank {

    int total;
    int money;
    boolean lock;

    Bank(int total) {
        this.total = total;
        lock = false;
    }

    synchronized boolean deposit(int amount, int no, int i) {
        // if busy ....
        while(lock) {
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        // lock
        lock = true;
        total += amount;
        
        System.out.println("No."+no+" depositor deposit "+amount+" Current Balance "+total+" count "+i);
        //sleep random
        Random rand = new Random();
            try {
                Thread.sleep(rand.nextInt(10)*10+10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
        // notify() and return 
        lock = false;
        notify();
        return true;
    }

    public synchronized boolean withDrawSync(int amount, int no, int i) {
        // if busy ....
        while(lock) {
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        //lock
        lock = true;
        if(total == 0) {
            money = -2147483647;
        } else if(total >= amount) {
            total -= amount;
            money = total;
        } else {
            money = -total;
        }
        if(money < 0) {
            if(money == -2147483647) {
                System.out.println("No."+no+" withdraw fail, Bank has no money count "+i);
                lock = false;
                notify();
                return false;
            } else {
                money = -money;
                System.out.println("No."+no+" withdraw fail Current Balance "+money+" count "+i);
            }
        } else {
            System.out.println("No."+no+" withdraw "+amount+" Current Balance "+money+" count "+i);
        }
        //sleep random
        Random rand = new Random();
            try {
                Thread.sleep(rand.nextInt(10)*10+10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
        // notify() and return 
        lock = false;
        notify();
        return true;
    }
}
