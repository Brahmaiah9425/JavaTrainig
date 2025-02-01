class Message {
    void display() {
        System.out.println("parent class");
    }
}
class CustomMessage extends  Message {
    void display() { 
    System.out.println("child class");
    }
}
class Brahmaiah extends CustomMessage {
    void display(){
    System.out.println("Brahmaiah");
    }
}
public class TwoMessageDemo {

public static void main(String[] args) {
    Message parent = new Message();
    parent.display();
    Message child = new CustomMessage();
    child.display();
    CustomMessage brahma = new Brahmaiah();
    brahma.display();
    }
}
