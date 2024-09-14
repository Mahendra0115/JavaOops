//Throw --> it is unchecked exception.it use in exception propogation for throw exception.

// exception propogation
public class ThrowEx {
    void m1() throws Exception{
        System.out.println("m1 in");
      int x = 10/0;
      System.out.println("m1 out");
      throw new Exception();
      
    }
    void m2()throws Exception{
        System.out.println("m2 in");
      m1();
      System.out.println("m2 out");
    }
    void m3()throws Exception{
        System.out.println("m3 in");
       m2();
       System.out.println("m3 out");
    }

    public static void main(String[] args) {
        
        try{
           new ThrowEx().m3();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
