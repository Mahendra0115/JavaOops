abstract class Parent {
    abstract void property();
    abstract void marry();
}

class Child extends Parent {
    public void property() {
        System.out.println("This is the property method.");
    }

    public void marry() {
        System.out.println("This is the child method.");
    }

    public static void main(String[] args) {
        Parent m = new Child();
        m.property();
        m.marry();
    }
}
