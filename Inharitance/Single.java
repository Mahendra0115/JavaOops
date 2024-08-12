
// Single Inharitance --> it use to non-private come Automataicaly ini chield class.
 class Parant{
    int x = 10;
    int y = 5;
    int c = x+y;
    void add(){
         System.out.println("addition is:" + c);
    }
}

class Child extends Parant{
    public static void main(String[] args) {
    Child c = new Child();
    c.add();
    }
}
