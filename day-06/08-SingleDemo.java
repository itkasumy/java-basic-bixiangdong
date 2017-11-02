/*
设计模式：解决一类问题最行之有效的方法
java中23种设计模式：
单例设计模式：解决一个类中在内存中只存在一个对象
*/
/*class Single {
    private Single() {}

    private static Single s = new Single();

    public static Single getInstance() {
        return s;
    }
}*/

/*class Single {
    private static Single s = null;
    private Single() {}
    public static Single getInstance() {
        if(s == null) 
            s = new Single();
        return s;
    }
}*/

/*class Single {
    private static Single s = null;
    private Single() {}
    public static synchronized Single getInstance() {
        if(s == null)
            s = new Single();
        return s;
    }
}*/

class Single {
    private static Single s = null;
    private Single() {}
    public static synchronized Single getInstance() {
        if(s == null) {
            synchronized(Single.class) {
                if(s == null)
                    s = new Single();
            }
        }
        return s;
    }
}

class SingleDemo {
    public static void main(String[] args) {
        Single ss = Single.getInstance();
    }
}