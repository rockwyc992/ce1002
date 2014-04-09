package ce1002.a4.s102502044;

class Vehicle {

    private String brand;   //品牌
    private String name;    //款式名稱
    private float maxSpeed; //最高速度
    private float fuelConsumption;  //油耗
    private float price;    //價格

    //設定品牌、名稱、最高速度、油耗、價格
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void set_fuel_consumption(float fuel_consumption) {
        this.fuelConsumption = fuel_consumption;
    }

    public void set_price(float price) {
        this.price = price;
    }


    //取得品牌、名稱、最高速度、油耗、價格
    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public float get_fuel_consumption() {
        return fuelConsumption;
    }

    public float get_price() {
        return price;
    }

    //取得目前速度(多載：汽車有渦流，但機車沒有。)
    public float currentSpeed() {   //給之後有關機車的class使用，A4不會使用到。
    }

    public float currentSpeed(boolean isTurbo) {    
    }
}
