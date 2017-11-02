/* class MainBoard {
    public void run() {
        System.out.println("mainboard run...");
    }
    public void useNetCard(NetCard n) {
        n.open();
        n.close();
    }
}

class NetCard {
    public void open() {
        System.out.println("net card open");
    }
    public void close() {
        System.out.println("net card close");
    }
} */

interface PCI {
    void open();
    void close();
}

class MainBoard {
    public void run() {
        System.out.println("mainboard run...");
    }
    public void usePCI(PCI p) {
        if(p != null) {
            p.open();
            p.close();
        }
    }
}

class NetCard implements PCI{
    public void open() {
        System.out.println("net card open");
    }
    public void close() {
        System.out.println("net card close");
    }
}

class SoundCard implements PCI {
    public void open() {
        System.out.println("sound card open...");
    }
    public void close() {
        System.out.println("sound card close...");
    }
}

class DuoTaiDemo4 {
    public static void main(String[] args) {
        MainBoard mb = new MainBoard();
        mb.run();
        mb.usePCI(new NetCard());
        mb.usePCI(new SoundCard());
        // mb.useNetCard(new NetCard());
    }
}