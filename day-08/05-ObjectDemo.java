class Demo {
    private int num;
    Demo(int num) {
        this.num = num;
    }
    public boolean equals(Object obj) {
        if(!(obj instanceof Demo))
            return false;

        Demo d = (Demo)obj;
        return this.num == d.num;
    }
}

class Person {}

class ObjectDemo {
    public static void main(String[] args) {
        /*Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        Demo demo3 = demo1;
        System.out.println(demo1.equals(demo2));
        System.out.println(demo1.equals(demo3));
        System.out.println(demo1 == demo2);
        System.out.println(demo1 == demo3);
        System.out.println(demo2 == demo3);*/

        Demo d1 = new Demo(4);
        // Demo d2 = new Demo(5);
        Person p = new Person();

        Class c = p.getClass();
        System.out.println(c.getName());

        // System.out.println(d1.equals(d2));
        // System.out.println(d1.equals(p));
        System.out.println(Integer.toHexString(p.hashCode()));

        System.out.println(p.toString());
    }
} 