
// Hyrarical Inharitance --> it have two Child class and One Parent class 

// parent class 
class Parent{
    void m1(){
        System.out.println("Parent");
    }
}


// child class 1
class Child1 extends Parent{

    void m2(){
        super.m1();
        System.out.println("Child1");
    }
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.m2();
    }
}


// child class 2
class Child2 extends Parent{

    void m3(){
        super.m1();
        System.out.println("Child2");
    }

    public static void main(String[] args) {
        Child2 p = new Child2();
        p.m3();

    }
}
