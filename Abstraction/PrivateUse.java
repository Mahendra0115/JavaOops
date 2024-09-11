 // protected use in Abstract 
abstract class Bank{
     protected abstract void intrest();
}
class Hdfc extends Bank{
    public void intrest(){
        System.out.println("3%");
    }
}

class Sbi extends Bank{
    public void intrest(){
       System.out.println("5%");
    }
}

public  class PrivateUse {
    public static void main(String args[]){
        Bank bank ;
        bank = new Hdfc();
        bank.intrest();
        bank = new Sbi();
        bank.intrest();
    }
  
}
