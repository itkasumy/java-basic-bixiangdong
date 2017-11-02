class Fu {
    static int num = 4;
    void method1() {
        System.out.println("fu method_1");
    }
    void method2() {
        System.out.println("fu method_2");
    }
    static void method4() {
        System.out.println("fu method_4");
    }
}

class Zi extends Fu {
    static int num = 8;
    void method2() {
        System.out.println("zi method_2");
    }
    void method3() {
        System.out.println("zi method_3");
    }
    static void method4() {
        System.out.println("zi method_4");
    }
}

class DuoTaiDemo3 {
    public static void main(String[] args) {
        /* Fu z = new Zi();
        z.method1();
        z.method2();
        z.method3(); */

        /* Zi z = new Zi();
        z.method1();
        z.method2();
        z.method3(); */

        Fu f = new Zi();
        System.out.println(f.num);
        f.method4();

        Zi z = new Zi();
        System.out.println(z.num);
        z.method4();
    }
}