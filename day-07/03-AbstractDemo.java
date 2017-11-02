 abstract class Student {
    abstract void study();
    void sleep() {
        System.out.println("躺着睡");
    }
}
class Chongci {
    void study() {
        System.out.println("chongci study");
    }
}
class BaseStudent extends Student {
    void study() {
        System.out.println("base study");
    }
}
class AdvStudent extends Student { 
    void study() {
        System.out.println("adv study");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}