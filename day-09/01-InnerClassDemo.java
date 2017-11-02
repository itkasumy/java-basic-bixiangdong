class Outer {
    private static int x = 3;

    /*class Inner {
        int x = 4;
        void function() {
            int x = 6;
            System.out.println(Outer.this.x);
            // System.out.println(this.x);
            // System.out.println("inner:" + x);
        }
    }*/
    static class Inner {
        static void function() {
            System.out.println("inner:" + x);
        }
    }

    static class Inner2 {
        void show() {
            System.out.println("inner2 show");
        }
    }

    public static void method() {
        // System.out.println(x);
        // Inner in = new Inner();
        // in.function();

        // Inner.function();

        new Inner2().show();
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        /*Outer out = new Outer();
        out.method();*/

       /*Outer.Inner in = new Outer().new Inner();
        in.function();*/

        // new Outer.Inner().function();

        Outer.method();
    }
}