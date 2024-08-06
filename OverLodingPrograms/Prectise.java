 
 /*
 class Prectise {

    public void m1(Integer x, int y){
        System.out.println(("hello"));
    }
    public void m1(Integer x, String s){
        System.out.println(("hii"));
    }
  
    public static void main(String[] args) {
        Prectise pre = new Prectise();
      pre.m1(8,'A');
    }
}

 */

 class Prectise{
    private Integer empNo;

    public void setEmpNo(Integer empno){
    //instance varr          //local varr
            empNo   =      empno;
    }
    public Integer getEmpNo(){
        return empNo;
    }

    public static void main(String[] args) {
        Prectise pre = new Prectise();
        pre.setEmpNo(45);
        System.out.println(pre.getEmpNo());
    }
 }