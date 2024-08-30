// package studentpak;

public class Student{

   
    
    private String  stdDepartment; 
    private String  stdName;
    private String  stdCourse;
    private Integer stdRum;
    private Address address;

    // setter 
    public void setStdDepartment(String stdDepartment){
        this.stdDepartment = stdDepartment;
    }

    public void setStdName(String stdName){
        this.stdName = stdName;
    }

    public void setStdCourse(String stdCourse){
        this.stdCourse= stdCourse;
    }

    public void setStdRum(Integer stdRum){
        this.stdRum= stdRum;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
   
    // getter

    public String getStdDepartment(){
        return this.stdDepartment;
    }

    public String getStdName(){
        return this.stdName;
    }

    public String getStdCourse(){
        return this.stdCourse;
    }

    public Integer getStdRum(){
        return this.stdRum;
    }

    public Address getAddress(){
        return this.address;
       }

      
   
}
