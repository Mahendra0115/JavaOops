  // Using OutputStream class Write data
         /* 
import java.io.*;
class Test{
  public static void main(String[] args){
    try{
    OutputStream os  = new FileOutputStream("demo.text");
     String data = "hi mahendra how are you";
     byte arr[] = data.getBytes();
     os.write(arr);
     os.close();
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }
    catch(IOException e){
      e.printStackTrace();
    }
    System.out.println("Data Saved in file: ");
  }
}
  */



/* 

                  // write data using Writer method 

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
// import java.io.rite;

class Test{
    public static void main(String[] args) throws FileNotFoundException , IOException{
         Writer writer = new FileWriter("writer.text");
         String data = "Hii Writer how are you";
         writer.write(data);
         writer.close();
         System.out.println("Data Saved in file: ");
    }
  }

*/



  
 
 


