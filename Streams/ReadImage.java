import java.io.*;
class Demo{
    public static void main(String[] args) throws FileNotFoundException , IOException {
        InputStream is = new FileInputStream("image.jpg");
        OutputStream os = new FileOutputStream("copy.jpg");
        int data = is.read();
        while(data != -1){
            os.write(data);
            os.flush();
            data = is.read();
        }
      
        System.out.println("File Saved: ");
        os.close();
    }
}
