package ce1002.a9.s102502044;

public class A9 {

    //new two Stack, and try something
    public A9() {
        Stack s1 = new Stack(5 , "Stack1");
        Stack s2 = new Stack(2 , "Stack2");
        try {
            s1.push("ABC");
            s1.push("DEF");
            s1.push(1111);
            s2.push("123");
            s2.push("456");
            s1.pop();
            s1.pop();
            s1.pop();
            s2.push("789");
            s1.pop();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("An Exception has been caught");
        }
    }

    public static void main (String[] argv) {
        new A9();
    }
}
