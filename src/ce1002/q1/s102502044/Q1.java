package ce1002.q1.s102502044;

public class Q1 {

    Q1() {
		// create a rectangle object and a triangle object
		Graph rectangle = new Rectangle();
        Graph  triangle = new  Triangle();
		
		// print out each area from different shape of graph
        rectangle.status();
         triangle.status();
    }

	public static void main(String[] args) {
        new Q1();
	}

}
