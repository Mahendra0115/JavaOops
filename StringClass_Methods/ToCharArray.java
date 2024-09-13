
//toCharArray()--->String ko character array mein convert karta hai.
public class ToCharArray {
    public static void main(String[] args) {
        String str = "mahendra";
        char []charArray = str.toCharArray();
        for(char c:charArray ){
            System.out.print(c);
        }
    }
}
