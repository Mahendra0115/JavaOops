public class TrimToString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(40);
        sb.append("mahend ra");
        sb.trimToSize();
        System.out.println(sb.capacity());

        // O/p ----> 5
    }
}
