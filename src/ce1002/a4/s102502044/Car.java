package ce1002.a4.s102502044;

import java.util.*;

class Car extends Vehicle {

    private boolean isTurbo;// 渦輪狀態
    Random rand; 

    Car() {
        rand = new Random();
    }

    public void startTurbo() {  // 測試啟動渦輪，可能會成功或失敗。
        isTurbo = rand.nextBoolean();
    }

    public boolean isTurbo() {  // 取得渦輪目前狀態
        return isTurbo;
    }

    //重載currentSpeed
    public float currentSpeed(boolean isTurbo) {    
        float speed = getMaxSpeed();
        if(!isTurbo) {
            speed *= rand.nextFloat();
        }
        return speed;
    }
}
