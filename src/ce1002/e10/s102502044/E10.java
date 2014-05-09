package ce1002.e10.s102502044;

import java.util.*;

public class E10 {

    public E10() {
        List<ISwimable> swimObjs = new ArrayList<ISwimable>();
        swimObjs.add(new Fish("f1"));
        swimObjs.add(new Fish("f2"));
        swimObjs.add(new Shark("s1"));
        swimObjs.add(new Submarine("sub1"));
        swimObjs.add(new Shark("s2"));
 
        for (ISwimable iSwimable : swimObjs) {
            // everybody swim
            iSwimable.swim();
        }
    }

    public static void main(String[] argv) {
        new E10();
    }
}

