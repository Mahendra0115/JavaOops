package staticvar;
import java.util.Scanner;
public class StaticVarr {
    private Integer stdId;
    private String  stdName;
    private static Integer collId = 1234;

    // static {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the coll_Id");
    //      collId  = sc.nextInt();
    // }
    StaticVarr(Integer stdId, String stdName){
          this.stdId = stdId;
          this.stdName = stdName;
    }

   
    void Display(){
        System.out.print(" "+stdId);
        System.out.print("      " +stdName);
        System.out.println("     " +collId);
    }

    public static void main(String[] args) {
        StaticVarr sv1 = new StaticVarr(101, "mahi");
        StaticVarr sv2 = new StaticVarr(102, "chand");
        StaticVarr sv3= new StaticVarr(103, "prachi");
         
        System.out.println(" StdId   StdName   coll_Id");
        sv1.Display();
        sv2.Display();
        sv3.Display();
    }

}
