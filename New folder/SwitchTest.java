interface Switch {
    void turnOn();
    void turnOff();
}

class Fan implements Switch {
    public void turnOn() {
        System.out.println("Fan is turned ON");
    }
    public void turnOff() {
        System.out.println("Fan is turned OFF");
    }
}

class Light implements Switch {
    public void turnOn() {
        System.out.println("Light is turned ON");
    }
    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
}

public class SwitchTest {
    public static void main(String[] args) {
        Switch fan = new Fan();
        Switch light = new Light();

        fan.turnOn();
        fan.turnOff();
		
        light.turnOn();
        light.turnOff();
    }
}