 
 // Final Using with ---> Local Varr

 /* 
 class Demo{
    public static void main(String[] args) {
        final int a = 10; // here final can't change 
        a++;
        System.out.println(a);
    }
}

*/



// Final using with ---> Non-static varr

/* 

class Test{
    final float f = 4.6f;
    public static void main(String args[]){
       Test test = new Test();
       test.f++; // here constant value not 
       System.out.println(test.f);
    }
}

*/

// Final Use with ---> static Varr

/* 
class Demo2{
     final static int a = 10;
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        demo.a++;
        System.out.println(a);
    }
}

*/

// Final using ---> Default Value 
class Demo3{
//  final int a; // declearation
final int a = 0;  //  initialiation
    public static void main(String[] args) {
        Demo3 demo = new Demo3();
       
        System.out.println(demo.a);
    }
}
