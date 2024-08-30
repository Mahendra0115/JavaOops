class Papa {
    protected void property(){
        System.out.println("property :");
    }

      protected void marry(){
        System.out.println("Handicap girls");
    }
}

class Child extends Papa{

    protected void marry(){
        // Custmise Implementation 
        super.marry(); // here calling parant's class method also

        System.out.println("Simple"); // here replace parent's class method
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.marry();
    }
}
