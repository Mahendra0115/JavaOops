 package pack;
 // constructor --> 1. Constructor is spacial type of method.
       //           2. Same name as class name.
       //           3. Any retrun type are not use. Ex-> (Void , int).
        //          4. It Automatacilly called (Impisit ) by JVM. When we (Create Object) of class. 
 
 public class Parametar {
    public Parametar(Integer x){
     System.out.println("this is Prametrise constructor:");
    }
    public static void main(String[] args) {
        Parametar para = new Parametar(10);

    }
}
