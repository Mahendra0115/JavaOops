package BsicOopsPrograms;
// Data shedow -- > when local varr and instance varr have same name than called data shedowing
public class DataShedow {
    private String empName;

    public void setEmpName(String empName){
        this.empName = empName; // here data shedowing
    }
    public String getEmpName(){
         return empName;
    }

    public static void main(String[] args) {
        DataShedow dataShedow = new  DataShedow();
          dataShedow.setEmpName("Mahendra");
          System.out.println(dataShedow.getEmpName());
    }
}
