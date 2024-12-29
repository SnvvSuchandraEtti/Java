class Parent {
    protected int money = 50000;
    protected int cars = 1;
    protected int houses = 2;
    protected int age = 10;

    public void display() {
        System.out.println("Money That child can access " + money);
        System.out.println("Cars That child can access " + cars);
        System.out.println("Houses That child can access " + houses);
        System.out.println("Age of the child is " + age);
    }
}

class Child extends Parent {
    
    public void display() {
        super.display(); 
    }
}

class MainDemo {
    public static void main(String args[]) {
        Child child = new Child();
        child.display();
    }
}
