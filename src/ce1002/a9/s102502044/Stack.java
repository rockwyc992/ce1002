package ce1002.a9.s102502044;

//stack class
class Stack {

    int size;
    int Max_size;
    String name;
    Node head;

    //some configure
    Stack(int size, String name) {
        this.Max_size = size;
        this.name = name;
        this.size = 0;
    }

    //getter
    int size() {
        return size;
    }

    String name() {
        return name;
    }

    //push data on the top of stack
    void push(Object data) throws Exception{
        if(!is_full()) {
            size++;
            Node node = new Node();
            node.data = data;
            node.next = head;
            head = node;
            System.out.println(name + " push " + data);
        }
    }

    //pop the top element
    void pop() throws Exception{
        if(!is_empty()) {
            size--;
            Node node = head;
            head = node.next;
            System.out.println(name + " pop " + node.data);
        }
    }

    //if stack is full, then throw an exception
    boolean is_full() throws Exception{
        if(size == Max_size) {
            throw new Exception(name + " is full");
        }
        return false;
    }

    //if stack is empty, then throw an exception
    boolean is_empty() throws Exception{
        if(size == 0) {
            throw new Exception(name + " is empty");
        } 
        return false;
    }
}

//node class
class Node {

    Object data;
    Node next;
}
