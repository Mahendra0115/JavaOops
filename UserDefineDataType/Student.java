
public class Student {
    private Integer rollNo;
    private String studentName;
    private Address address;

    // getter method 
    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

   // setter method

   public Integer getRollNo(){
    return this.rollNo;
   }

   public String getstudentName(){
    return this.studentName;
   }

   public Address getAddress(){
    return this.address;
   }

}
