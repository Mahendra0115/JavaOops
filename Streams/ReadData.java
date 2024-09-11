

//  Read data using ---> InputStram class

import java.io.*;
class Test {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        InputStream is = new FileInputStream("C:\\Users\\asus\\Desktop\\Java_Oops\\Streams\\ReadData.java");
        int data = is.read();

        // adding condition reading all data
        while(data != -1){
            System.out.print((char)data);
            data = is.read();
        }
        is.close();
        System.out.println("all file are readed: ");
    }
}

/* 
//  Read data using ---> Read class 

import java.io.*;
import java.io.FileReader;
class Read {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Reader reader = new FileReader("writer.text");
        int data = reader.read();
        reader.close();

        System.out.println((char)+data);
        System.out.println("Data Readed :");
        
    }
}

*/