interface Inter {
    public static final int NUM = 3;
    public abstract void show();
}

interface InterA {
    public abstract void show();
}

class Test implements Inter, InterA {
    public void show() {}
}

class Demo extends Test implements Inter, InterA {
    public void show() {}
}

 class InterfaceDemo {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.NUM);
        System.out.println(Test.NUM);
        System.out.println(Inter.NUM);
    }
}


interface A {
    void methodA();
}
interface B // extends A
{
    void methodB();
}
interface C extends B, A {
    void methodC();
}
class D implements C {
    public void methodA() {}
    public void methodB() {}
    public void methodC() {}
}