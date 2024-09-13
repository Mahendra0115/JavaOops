import java.io.*;
import java.io.ObjectInputStream;
class Deserialization{
  public static void main(String rags[]) throws FileNotFoundException,IOException,NotSerializableException, ClassNotFoundException{
     InputStream is = new FileInputStream("std2.txt");
	   ObjectInputStream ois = new ObjectInputStream(is);
	   Demo demo = (Demo)ois.readObject();
	     
		 System.out.println("No is: "+demo.getStudentNo());
		 System.out.println("Name is: "+demo.getStudentName());
		 System.out.println("Sal is: "+demo.getStudentSal());
		 
  }
}