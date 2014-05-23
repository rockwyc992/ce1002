package ce1002.e12.s102502044;

public class Bank {

    int total;
    int money;
    boolean lock;

    Bank(int total) {
        this.total = total;
        lock = false;
    }

    // please fill the blank
    public synchronized boolean withDrawSync(int amount, int no, int i) {
        // if busy ....
        while(lock) {
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        // notify() and return 
        lock = true;
        if(total == 0) {
            money = -10000;
        } else if(total >= amount) {
            total -= amount;
            money = total;
        } else {
            money = -total;
        }
        if(money < 0) {
            if(money <= -10000) {
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
        
        lock = false;
        notify();
        return true;
    }
}
