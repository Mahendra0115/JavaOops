// ensureCapacity(int minimumCapacity) ---> Minimum capacity ensure karta hai. Agar current capacity kam hai, to usse increase karta hai.

// Add CapaCity at Run Time  in heap Memory by Jvm.
public class EnsureCapaCity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.ensureCapacity(40);//increasesie capacity run time

        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
