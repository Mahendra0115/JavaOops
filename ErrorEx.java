package BsicOopsPrograms;
public class ErrorEx {
    void m1(String name, Integer x){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
      String sname = "Mahendra";
      Integer sno = 85;
        ErrorEx  arror = new ErrorEx();
        arror.m1(sname,sno);
        
        System.out.println(sname);
        System.out.println(sno);
    }
}
