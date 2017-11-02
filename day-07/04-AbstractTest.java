abstract class Employee {
    private String name;
    private int id;
    private double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    abstract public void work();
}

class Pro extends Employee {
    Pro(String name, int id, double salary) {
        super(name, id, salary);
    }
    public void work() {
        System.out.println("pro work");
    }
}

class Manager extends Employee {
    private int bonus;
    Manager(String name, int id, double salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
    public void work() {
        System.out.println("manager work");
    }
}