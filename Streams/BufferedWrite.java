
/// write data using Buffered 

/* 
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.FileOutputStream;

class Test{
    public static void main(String[] args) throws FileNotFoundException , IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("buffer.text"));
        String data = "hello this is bufferedwriter usiing Input";
        br.write(data);
        br.close();
        System.out.println("Write ");
    }
 }

*/

 // write data using BufferedOutputStream

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// import java.io.writer;

class Test {
    public static void main(String[] args) throws FileNotFoundException , IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.text"));
        String  data = "hello hii";
        byte arr[] = data.getBytes();
        bos.write(arr);
        bos.close();
        System.out.println(data);
    }
 }
