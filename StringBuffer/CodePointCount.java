//codePointCount(int beginIndex, int endIndex)--->Specific range ke beech ke code points count karta hai.
public class CodePointCount {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("mahendra");
        System.out.println("count code:"+sb.codePointCount(0,3));
    }
}
