class LanPingException extends Exception {
    LanPingException(String message) {
        super(message);
    }
}

class Computer {
    public void run() {
        System.out.println("电脑运行");
    }

    public void reset() {
        System.out.println("电脑重启");
    }
}

class Teacher {
    private String name;
    private Computer cmpt;

    Teacher(String name) {
        this.name = name;
        cmpt = new Computer();
    }

    public void prelect() {

    }
}

class ExceptionTest {
    public static void main(String[] args) {
        
    }
}