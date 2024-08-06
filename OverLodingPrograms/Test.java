// OverLoding --> *  When  use multiple mathod of same name in Clss that is Method OverLoading.
//                *  Method Over Loding is a way throw which we can achive  (PolyMorphishm)
// Interview Qus:-   1. Access mdifire use  in overloading  Ex. - (public)
          //         2. static and non-static method use  in overloading  
           //        3. private method use in method overloading 
           //        4. Does not support method return type 

// Ruls to Use Method OverLoding:- 1. Number of parametar should be different.
 //                                2. Type of parametar should be different.
  //                               3. Sequence of parameter should be different.
 class Test {
    void sum(Integer x, Integer y){
        System.out.println("two opperend");
         System.out.println(x+y);
    }
    void sum(Integer x, Integer y, Integer z){
        System.out.println("three opperend");
      System.out.println(x+y+z);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.sum(5,3,8);
    }
}
