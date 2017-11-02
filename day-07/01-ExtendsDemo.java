/*class Student {
    String name;
    int age;
    void study() {
        System.out.println("study hard!");
    }
}

class Worker {
    String name;
    int age;
    void work() {
        System.out.println("work hard!");
    }
}*/

/*class A {
    void show() {
        System.out.println("A");
    }
}
class B {
    void show() {
        System.out.println("B");
    }
}
class C extends A, B {
    
}*/

/*class Person {
    String name;
    int age;
}

class Student extends Person {
    void study() {
        System.out.println("study hard!");
    }
}

class Worker extends Person {
    void work() {
        System.out.println("work hard!");
    }
}

class ExtendsDemo {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}*/

class Fu {
    int num = 4;
    void show() {
        System.out.println("fu show");
    }
    void speak() {
        System.out.println("vb");
    }
}
class Zi extends Fu {
    int num = 5;
    void show() {
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    void show() {
        System.out.println("zi show");
    }
    void speak() {
        System.out.println("java");
    }
}

class ExtendsDemo {
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println(z.num  + "=============" + z.num);
        z.show();
        z.speak();
    }
}
  
/*class Tel {
    void show() {
        System.out.println("telephone");
    }
    void lingsheng() {}
}

class NewTel extends Tel {
    void show() {
        // System.out.println("telephone");
        super.show();
        System.out.println("name");
        System.out.println("pic");
    }
}*/