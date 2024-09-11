             // class and method should be abstract . both are must be override . 
  /*  
  
 abstract class Parent {
     abstract  void m1(); // body less method 
     abstract void m2();   // body less method 
 }
 class StaticUse  extends Parent {
    // override both mathod
    public void m1(){
         System.out.println("mwthod 1");
    }
    public void m2(){
        System.out.println("mwthod 2");
    }
    public static void main(String[] args) {
        // parent calss         child class 
        Parent  static1 = new StaticUse ();
        static1.m1();
        static1.m2();
    }

 }

 */
                   
                     // any One method overrrid 

  /*  

 abstract class Parent {
    abstract  void m1(); // body less method 
    abstract void m2();
    abstract void m3();   // body less method 
}
 abstract class Child extends Parent {
   // override both mathod
   public void m1(){
        System.out.println("mwthod 1");
   }
   public void m2(){
       System.out.println("mwthod 2");
   }

   public static void main(String[] args) {
    // parent calss         child class 
    Parent  static1 = new Child(){
        public void m3(){
            System.out.println("mwthod 3");
        }
    };
    static1.m1();
    static1.m2();
    static1.m3();
}
}

*/
 

                        // body less method 

/* 

abstract class Demo{
    abstract void m1();
    abstract void m4();
    
    void m2(){
        System.out.println("this is method 2:");
    }
    void m3(){
        System.out.println("this is method 3:");
    }
}
 abstract class Test extends Demo{
    public void m1(){
        System.out.println("this is method 1:");
    }
 }

 class Mix{
    public static void main(String[] args) {
        Demo d = new Test(){
            // Anonymoues class use
            public void m4(){
                System.out.println("this is method 4:");
            }
        };
        d.m1();
        d.m2();
        d.m3();
        d.m4();
    }
 }

 */

  // abstract not allowd of (static method) and (private varr)
   abstract class Court {
     abstract protected void marrid();
   }
   class Rani extends Court {
    public void marrid(){
        System.out.println("Prashant Accepted ");
    }
   }

   class Prashant extends Court {
       public void marrid(){
        System.out.println("Rani Accepted ");
       }
   }

class SupreemCourt{
    public static void main(String[] args) {
        Court c = new  Rani();
        c.marrid();
        Court c1 = new Prashant();
        c1.marrid();
    }
}







