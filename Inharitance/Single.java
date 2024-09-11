
// Single Inharitance --> it use to non-private come Automataicaly ini chield class.
 class Parant{
    int x = 10;
    int y = 5;
    int c = x+y;
    void add(){
         System.out.println("addition is:" + c);
    }
    public void m1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm1'");
    }
    public void m2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm2'");
    }
}

class Child extends Parant{
    public static void main(String[] args) {
    Child c = new Child();
    c.add();
    }
}
