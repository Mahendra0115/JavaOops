// package MemoryLocation;

class Demo {
    void m1(int x, int y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        Demo demo1 = new Demo();
        demo1.m1(5,6);
        Demo demo2 = new Demo();
        demo2.m1(5,9);
        Demo demo3 = new Demo();
        demo3.m1(3,6);

    }
}
