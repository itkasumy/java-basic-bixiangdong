abstract class AbsDemo {
    abstract void show();
}

class Outer {
    int x = 3;
    /*class Inner extends AbsDemo {
        void show() {
            System.out.println();
        }
    }*/
    public void function() {
        // new Inner().show();
        new AbsDemo() {
            void show() {
                System.out.println("x=" + x);
            }
        }.show();
    }
}

class InnerClassDemo3 {
    public static void main(String[] args) {
        
    }
}