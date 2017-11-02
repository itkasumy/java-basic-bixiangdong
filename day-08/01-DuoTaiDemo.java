abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("eat fish");
    }
    public void catchMouse() {
        System.out.println("catch mouse");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("eat bone");
    }
    public void kenBone() {
        System.out.println("ken bone");
    }
}

class Pig extends Animal {
    public void eat() {
        System.out.println("siliao");
    }
    public void gongDi() {
        System.out.println("gong di");
    }
}

class DuoTaiDemo {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // Cat c = new Cat();
        // c.eat();
        Animal c = new Cat();
        // c1.eat();
        // function(c1);
        // function(new Dog());

        /*Dog d = new Dog();
        d.eat();*/

        /*function(new Cat());
        function(new Dog());
        function(new Pig());*/

        /*Animal a = new Cat();
        a.eat();
        Cat c = (Cat)a;
        c.catchMouse();*/

        function(new Cat());
        function(new Dog());
    }
    public static void function(Animal a) {
        a.eat();

        if(a instanceof Cat) {
            Cat c = (Cat)a;
            c.catchMouse();
        } else if(a instanceof Dog) {
            Dog d = (Dog)a;
            d.kenBone();
        }
    }
    /*public static void function(Cat c) {
        c.eat();
    }
    public static void function(Dog d) {
        d.eat();
    }
    public static void function(Pig p) {
        p.eat();
    }*/
}