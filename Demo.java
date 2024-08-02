package BsicOopsPrograms;
// // import java.io.ObjectInputFilter.Status;

//  class Student{

//     private Integer rollNo;

//     // setter method without return with parametar
//     public void setRollNo(Integer rollno){
//            rollNo = rollno ;
//     }

//     public Integer getRollNo(){
//          return rollNo;
//     }
// } 

// public class Demo{
//     public static void main(String[] args) {
//         Student std = new Student();
//         std.setRollNo(101);
//         System.out.println(std.getRollNo());
//     }
// }




class Student {
    private String stdName ;
    private Integer stdNo;
    private String stdCourse;

    // Use Setter Method 
    public void setStdName(String stdname){
           this.stdName = stdname;
    }

    public void setStdNo(Integer stdno){
          stdNo = stdno;
    }

    public void setStdCourse(String stdcourse){
       stdCourse = stdcourse;
    }

    // Gatter Method 
    public String getStdName(){
         return stdName;
    }

    public Integer getStdNo(){
        return stdNo;
    }

    public String getStdCourse(){
        return stdCourse;
   }

   }
   
   class Demo{
    public static void main(String[] args) {
        Student student =  new Student();
        student.setStdName("mahendra");
        student.setStdNo(45);
        student.setStdCourse("b.tech");

        System.out.println(student.getStdName());
        System.out.println(student.getStdNo());
        System.out.println(student.getStdCourse());
     
    }
   }
   