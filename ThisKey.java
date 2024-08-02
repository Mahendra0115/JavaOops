package BsicOopsPrograms;
// This keyword Using with  (static mathod) 

public class ThisKey {
     static void m1(){
       System.out.println("hello");
    }

    static void m2(){
        m1(); // here compiler adding automatically className
      System.out.println("hii");
    }
   
    public static void main(String[] args) {
        ThisKey.m2();  // here compiler adding automatically className
    }
}




/*

// This keyword Using with  (static Varr) 

class Test{
    Integer x = 100; // non-static
    static Integer y = 35;  //static 
    void m3(){
        System.out.println(this.x);
        System.out.println(this.y);
    }
    public static void main(String[] args) {
      Test test = new Test();
      test.m3();
    }
}

*/
