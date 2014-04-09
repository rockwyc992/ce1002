package ce1002.e4.s102502044;

class Animal {

    private String type;//動物種類
    private String sound;//動物叫聲

    //取得type
    String type() {
        return type;
    }

    String sound() {
        return sound;
    }

    //設定type
    void set_type(String type) {
        this.type = type;
    }

    void set_sound(String sound) {
        this.sound = sound;
    }
}
