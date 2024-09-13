import java.io.*;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


class Serialization{
  public static void main(String args[])throws FileNotFoundException , IOException,NotSerializableException{
      OutputStream os = new FileOutputStream("std.txt");
	  ObjectOutputStream oos = new ObjectOutputStream(os);
	  Demo demo = new Demo(101,"mahi",154.124f);
	  oos.writeObject(demo);
	  oos.flush();
	  oos.close();
	  System.out.println("Data Write: ");
  }
}