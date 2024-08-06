// package pack1;
public class PrivateCls {
    private Integer empNo;
    private String empName;
    private Double empSal;

   public PrivateCls(Integer empNo, String empName, Double empSal){
        // here ( this )--> it is refference  varr which holde current class identity .
        this. empNo = empNo;
        this. empName = empName;
        this. empSal = empSal;
    }
    public Integer getEmpNo(Integer empNo){
          return empNo;
    }
    public String getEmpName(String empName){
        return empName;
    }
    public Double getEmpSal(Double empSal){
        return empSal;
    }    
}
