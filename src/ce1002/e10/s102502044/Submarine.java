package ce1002.e10.s102502044;

class Submarine extends Entity implements ISwimable {

    Submarine(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("Submarine: "+name+" is swimming!");
    }
}
