interface Inter {
    void method();
}

class Test {
    static Inter function() {
        return new Inter() {
            public void method() {
                System.out.println("run...");
            }
        };
    }
}

class InnerClassDemo4 {
    public static void main(String[] args) {
        Test.function().method();
    }
}