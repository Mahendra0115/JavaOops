

class Parant {
    public void marry(){
        System.out.println("paraent class: ");
    }
}
   
 class Child  extends Parant{
// static main method is inharited
    public static void main(String[] args) {
        Child c = new Child();
        c.marry();
    }
}

public class InharitStaticMethod extends Child{
   // non executable class but wrking . because static method inharit
     
}


