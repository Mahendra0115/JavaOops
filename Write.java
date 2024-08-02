package BsicOopsPrograms;
public class Write {
    private Integer stdRoll ;

    // Satter Only  - Write this method
    public void setStdRoll(Integer stdroll){
     stdRoll = stdroll;
    }

    public static void main(String[] args) {
        Write write = new Write();
        write.setStdRoll(2001506010);
        System.out.println(write);
    }
}
