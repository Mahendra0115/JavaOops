package BsicOopsPrograms;

// Read and Write
class BasicOops{
   private String empName ;
   private Integer empNo ;
   private Double empSall ;


   // Setter method 
   public void setEmpName(String empname){
          empName = empname;
   }
   public void setEmpNo(Integer empno){
           empNo = empno;
  }

  public void setEmpSall(Double empsall){
           empSall = empsall;
  }

  // Getter method use 


  public  String getEmpName(){
       return empName;
  }
  public Integer getEmpNo(){
        return empNo ;
  }
  public Double getEmpSall(){
      return empSall;
  }

public static void main(String[] args) {
    BasicOops basic = new BasicOops();
    basic.setEmpName("rahul");
    basic.setEmpNo(45);
    basic.setEmpSall(45125.65);

    System.out.println(basic.getEmpName());
    System.out.println(basic.getEmpNo());
    System.out.println(basic.getEmpSall());

}
}

