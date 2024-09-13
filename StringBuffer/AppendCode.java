 // appendCodePoint(int codePoint)---> Unicode codepoint ko StringBuffer mein append karta hai.
public class AppendCode {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.appendCodePoint(34);
        System.out.println(sb);
    }
}
