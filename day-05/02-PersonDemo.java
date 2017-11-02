// private: 私有，权限修饰符：用于修饰类中的成员（成员变量，成员函数）
// 私有只在本类中有效
// 将 age 私有以后，在类以外即使建立子类对象也不能直接访问
// 但是人应该有年龄，就需要在person类中提供对应访问 age 的方式
// 注意:私有仅仅是封装的一种表现形式
// 之所以对外提供访问方式,就是因为可以在访问方式中添加逻辑判断等语句
// 对访问的数据进行逻辑操作,提高代码的健壮性.
class Person {
    private int age = 20;
    public void setAge(int agee) {
        if(agee > 0 && agee < 120) {
            age = agee;
            speak();
        } else {
            System.out.println("your age is out of control!");
        }
    }
    public int getAge() {
        return age;
    }
    private void speak() {
        System.out.println("age=" + age);
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        // p.age = -20;
        // p.speak();
        p.setAge(18);
    }
}