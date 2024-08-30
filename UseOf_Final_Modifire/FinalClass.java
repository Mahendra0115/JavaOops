//  Final modifire --> it do not allow to (change implementation of class). it is not work with class 



/*  

public final class FinalClass {
    
}
 class Demo extends FinalClass{
    public static void main (String args[]){
       System.out.println("main method: ");
    }
}  
       ________________
      |               |
      |O/P --> error  |
      |_______________|
      

*/
// it work with JVM Specific main mathod  
// final --> it is not inharit.

public  class FinalClass {
    public final static void main (String args[]){
        System.out.println("main method: ");
    }
}   


