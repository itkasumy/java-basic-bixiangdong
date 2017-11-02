class Final {
    final int x = 3;
    public static final double PI = 3.14;

    final void show1() {}

    void show2() {
        final int y = 4;
        System.out.println(y);
    }
}

class SubDemo extends Final {}

class FinalDemo {
    public static void main(String[] args) {
        System.out.println("");
    }
}