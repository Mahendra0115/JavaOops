
import java.io.*;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;

class GarvejCollector{
  public static void main(String args[]) throws FileNotFoundException, IOException {
       
		// here we are usnig GrabejCollector--> it use to distroyed of Object	
		BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream( new FileInputStream("Garvej.java"))));
		
	  int data = br.read();
	while(data != -1){
	System.out.print((char)data);
		data=br.read(); // use for increment
		
	}
	  
	System.out.print("all data are readed :");
	//isr.flush();
	br.close();
  }
}