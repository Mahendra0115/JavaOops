package BsicOopsPrograms;
public class Read {
    private String stdName;

    // Gatter Only --> Read this method
    public String getStdName(){
        return stdName;
    }

    public static void main(String[] args) {
        Read read = new Read();
         System.out.println(read.getStdName());
    }
}
