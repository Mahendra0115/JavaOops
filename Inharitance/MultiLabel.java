// package Inheritance;

class Parent {
    void m1() {
        System.out.println("Grandfather");
    }
}

class Child extends Parent {  // Corrected "Parant" to "Parent"
    void m2() {
        System.out.println("Father");
    }
}

class Subchild extends Child {

    void m3() {
        super.m1();  // Calls m1() from the Parent class
        System.out.println("Child:");
    }

    public static void main(String[] args) {
        Subchild subchild = new Subchild();
        subchild.m1();  // Calls m1() from the Parent class
        subchild.m2();  // Calls m2() from the Child class
        subchild.m3();  // Calls m3() from the Subchild class and also m1() from the Parent class
    }
}
