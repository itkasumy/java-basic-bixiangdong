/**
对象一建立就会调用与之对应的构造函数

构造函数的作用：可以用于给构造函数初始化

构造函数的小细节：
    当一个类中没有定义构造函数时，那么系统会默认给该类添加一个空参数的构造函数
    当在类中自定义了构造函数后，默认的构造函数就没有了

构造函数和一般函数在写法上有不同

在运行上也有不同：
    构造函数是在对象一建立就运行。给对象初始化。
    而一般方法是对象调用才执行，是给对象添加对象具备的功能。

    一个对象建立，构造函数只运行一次
    而一般方法可以被该对象调用多次。

什么时候定义构造函数呢？
当分析事物时，该事物存在就具备一些特性和行为，那么将这些内容定义在构造函数中。
 */
class PersonConstructer {
    // PersonConstructer() {};
    /*PersonConstructer() {
        System.out.println("person run!");
    }*/
    private String name;
    private int age;

    {
        System.out.println("构造代码块运行...");
    }
    PersonConstructer(int age) {
        this.age = age;
    }
    /**
    构造代码块：
        作用：给对象进行初始化
            对象一建立就执行，而且优先于构造函数执行。
        和构造函数的区别；
            构造代码块是给所有对象进行统一初始化
            而构造函数是给对应的对象初始化
        构造代码块中定义的是不同对象共性的初始化内容。
     */

    /*PersonConstructer() {
        System.out.println("A:name=" + name + "age=" + age);
        // System.out.println("cry");
        cry();
    }*/
    // PersonConstructer(String n) {
    /*PersonConstructer(String name) {
        this.name = name;
        System.out.println("B:name=" + name + "age=" + age);
        // System.out.println("cry");
        cry();
    }*/
    /*PersonConstructer(String n, int a) {
        name = n;
        age = a;
        System.out.println("C:name=" + name + "age=" + age);
        // System.out.println("cry");
        cry();
    }*/

    public void cry() {
        System.out.println("cry......");
    }

    /*public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }*/

    public boolean compare(PersonConstructer p) {
        return this.age == p.age;
    }
}
class PersonConstructerDemo {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // PersonConstructer p = new PersonConstructer();
        /*PersonConstructer p1 = new PersonConstructer("lisi");
        PersonConstructer p2 = new PersonConstructer("wangwu", 18);
        p.cry();*/
        // p.setName("zhaoliu");
        // System.out.println(p.getName());

        PersonConstructer p1 = new PersonConstructer(18);
        PersonConstructer p2 = new PersonConstructer(20);
        boolean b = p1.compare(p2);
        System.out.println(b);
    }
}