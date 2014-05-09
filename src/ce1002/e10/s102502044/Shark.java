package ce1002.e10.s102502044;

class Shark extends Fish implements ISwimable {
    
    Shark(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("Shark: "+name+" is swimming!");
    }
}
