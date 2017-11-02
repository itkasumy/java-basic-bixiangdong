// 面向对象：三个特征：封装，继承，多态。
// 以后的开发其实就是找对象使用。没有对象就创建一个对象。
// 找对象，建立对象，使用对象。维护对象的关系。
/**
类和对象的关系。
类：就是对现实生活中事物的描述。
对象：就是这类事物，实实在在存在的个体。

现实生活中的对象：张三，李四。
想要描述：提取对象中共性的内容，对具体的描述。
描述时：这些对象的共性：姓名，性别，性别，学习java的功能。
映射到java中，描述就是class定义的类。
具体对象就是对应java在堆内存中用new建立的实体。
 */

// 需求：描述汽车（颜色，轮胎数）。描述事物其实就是在描述事物的属性和行为。
// 属性对应的是类中的变量，行为对应的是类中的函数（方法）。
// 其实定义类，就是在描述事物，就是在定义属性和行为。属性和行为共同成为类中的成员（成员变量和成员方法）。

/**
成员变量和局部变量
成员变量作用于整个类中。
局部变量作用于函数中或语句中。
在内存中的位置：
成员变量：在堆内存中，因为对象的存在，才在内存中存在。
局部变量：存在于栈内存中
 */
class Car {
    String color = "red";
    int num = 4;
    void run() {
        System.out.println(color + "..." + num);
    }

    public static void show(Car c) {
        c.color = "black";
        c.num = 3;
        c.run();
    }
}



class CarDemo {
    public static void main(String[] args) {
        /*Car c = new Car();
        c.color = "blue";
        c.run();

        Car c1 = c;
        c1.color = "green";
        c.run();*/

        // 匿名函数
        /*new Car().num = 5;
        new Car().color = "black";
        new Car().run();*/

        /*Car q = new Car();
        show(q);*/

        // show(new Car());

        Car bmw = new Car();
        bmw.show(bmw);
    }

    /*public static void show(Car c) {
        c.color = "gold";
        c.num = 6;
        c.run();
    }*/
}