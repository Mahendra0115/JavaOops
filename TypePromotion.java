package BsicOopsPrograms;
 // Type promotion --> When parameter and argument are not same data type. than we use Type promotion
 public class TypePromotion {
    void m1(double x){ // here type promotion 
        System.out.println("hello");
    }

    public static void main(String args[]) {
        TypePromotion typepro = new TypePromotion();
        typepro.m1('O');

        // Output ---> hello

    }
}
