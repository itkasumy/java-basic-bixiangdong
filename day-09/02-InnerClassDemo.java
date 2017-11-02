class Outer {
    int x = 3;
    void method(final int z) {
        final int y =4;
        // z = 5;
        class Inner{
            void function() {
                System.out.println(Outer.this.x);
            }
        }
        new Inner().function();
        System.out.println(z);
    }
}

class InnerClassDemo2 {
    public static void main(String[] args) {
        // System.out.println("");
        // new Outer().method(6);
        // new Outer().method(7);
        Outer out = new Outer();
        out.method(6);
        out.method(7);
    }
}