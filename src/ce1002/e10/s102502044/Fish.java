package ce1002.e10.s102502044;

class Fish extends Entity implements ISwimable {

    Fish(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("Fish: "+name+" is swimming!");
    }
}
