
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Conver{
  public static void main(String args[]) throws FileNotFoundException, IOException {
	  
        InputStream is = new FileInputStream("Test.java");
		BufferedInputStream bis = new BufferedInputStream(is);
  // here InputStreamReader --> it use to convert the data  { byte to Char }
		InputStreamReader isr = new InputStreamReader(bis);
		BufferedReader br = new BufferedReader(isr);
		
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