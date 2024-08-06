package pack1;
// init--> it is a process to parform commen task in multiple constructor.
public class Demo{

    {
        System.out.println("Rama University Kanpur");
    }

  public Demo(String name){
      
     System.out.println("Mahendra Singh");
  }

   
  public Demo(String course , String branch){
   this("name");
    System.out.println("B.tech ");
    System.out.println("Computer Science Engineering:") ;
  }


  public Demo(Integer rollnum){
    this("couse", "branch");
    System.out.println("Roll No:");
  }
  

    public static void main(String[] args) {
       Demo demo1 = new Demo(45);
  
    }
}