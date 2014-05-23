package ce1002.e12.s102502044;

import java.util.Random;

public class Consumer implements Runnable{

    int no;
    int withdraw;
    Bank bank;

    Consumer(int no, Bank bank) {
        this.no = no;
        this.bank = bank;
    }

    // please override this method when executed by thread
    public void run(){
        Random rand = new Random();
        for(int i=1 ; i<=10 ; i++) {
            withdraw = rand.nextInt(9) * 100 + 100;
            // withdraw money from bank
            if(!bank.withDrawSync(withdraw, no, i)) {
                break;
            }
        }
    }
}

