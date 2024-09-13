// insert(int offset, String str)---> String ko specific position pe insert karta hai.
public class Insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.insert(5, "World");
        System.out.println(sb);
    }

    // o/p --> hello world
}
