// package MemoryLocation;

class Demo {
     static int x =10;
     static int y = 5;
   
    //  static  int c = x+y;
     static void m1(){
        System.out.println(x +" "+ y);
    } 
    public static void main(String[] args) {
       Demo d1 = new Demo();
       d1.m1();

       Demo d2 = new Demo();
       d2.m1();

    }
}
