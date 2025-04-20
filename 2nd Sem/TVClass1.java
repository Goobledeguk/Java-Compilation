public class TVClass1 {
    boolean On;
    int channel;
    int volume;

    public TVClass1() {
        On = false;
        channel = 1;
        volume = 1;
    }

    public void turnOn() {
        On = true;
    }

    public void turnOff() {
        On = false;
    }

    public void Channel(int channel) {
        if (On) {
            if (channel >= 1 && channel <= 100) {
                this.channel = channel;
            } else {
                System.out.println("Invalid channel! Channel should be between 1 and 100.");
            }
        } else {
            System.out.println("TV is off. Please turn it on first.");
        }
    }

    public void Volume(int volume) {
        if (On) {
            if (volume >= 0 && volume <= 10) {
                this.volume = volume;
            } else {
                System.out.println("Invalid volume! Volume should be between 0 and 10.");
            }
        } else {
            System.out.println("TV is off. Please turn it on first.");
        }
    }

    public void display() {
        if (On) {
            System.out.println("TV is ON. Channel: " + channel + ", Volume: " + volume);
        } else {
            System.out.println("TV is OFF.");
        }
    }

    public static void main(String[] args) {
        TVClass1 tv1 = new TVClass1();
        TVClass1 tv2 = new TVClass1();

        tv1.turnOn();
        tv1.Channel(40);
        tv1.Volume(5);

        tv2.turnOn();
        tv2.Channel(30);
        tv2.Volume(7);

        System.out.println("TV1 Status:");
        tv1.display();

        System.out.println("\nTV2 Status:");
        tv2.display();
    }
}
