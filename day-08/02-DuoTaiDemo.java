abstract class Student {
    public abstract void study();

    public void sleep() {
        System.out.println("lying sleep");
    }
}

class DoStudent {
    public void doSomething(Student stu) {
        stu.study();
        stu.sleep();
    }
}

class BaseStu extends Student {
    public void study() {
        System.out.println("base study!");
    }
    public void sleep() {
        System.out.println("site sleep");
    }
}

class AdvStu extends Student {
    public void study() {
        System.out.println("adv study!");
    }
}

class DuoTaiDemo2 {
    public static void main(String[] args) {
        /*BaseStu bs = new BaseStu();
        bs.study();
        bs.sleep();
        AdvStu as = new AdvStu();
        as.study();
        as.sleep();*/
        DoStudent ds = new DoStudent();
        ds.doSomething(new BaseStu());
        ds.doSomething(new AdvStu());
    }
}