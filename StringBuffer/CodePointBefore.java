
 // codePointBefore(int index)--> Specific index ke pehle ka Unicode code point return karta hai.
public class CodePointBefore {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HELlo");
        System.out.println("before Index Unicode is: "+sb.codePointBefore(3));
        //  System.out.println(null);
    }
}

