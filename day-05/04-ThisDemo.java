class ThisC {
    private String name;
    private int age;

    Person() {
    }

    Person(String name) {
        this();
        this.name = name;
    }

    Person(String name, int age) {
        this(name);
        this.age = age;
    }
}

class ThisDemo {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person();
    }
}