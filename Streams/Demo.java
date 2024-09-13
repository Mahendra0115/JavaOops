import java.io.Serializable ;

public class Demo implements Serializable{
	private Integer studentNo;
    private String  studentName;
    private Float   studentSal;	
	
	Demo(Integer studentNo,String studentName,Float studentSal){
		this.studentNo   = studentNo;
		this.studentName = studentName;
		this.studentSal  = studentSal;
	}
	
	// using gatter 
	public Integer getStudentNo(){
		return this.studentNo;
	}
	
	public String getStudentName(){
		return this.studentName;
	}
	
	public Float getStudentSal(){
		return this.studentSal;
	}
	
	//public String toString(){
	//	return studentNo+" "+studentName+" "+studentSal;
	//}
	
  
}