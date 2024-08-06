// package pack2;
// import pack1.*;
 class AccesPrivate {
    
public static void main(String args[]){
    PrivateCls para = new PrivateCls(4," mahi",45.56);
    System.out.println(para.getEmpNo(5));
    System.out.println(para.getEmpName("mahi"));
    System.out.println(para.getEmpSal(42.6));
}
}