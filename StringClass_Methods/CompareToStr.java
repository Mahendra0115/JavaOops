// (CompareTo)---> Lexicographically (dictionary order) comparison karta hai.
public class CompareToStr {
    public static void main(String[] args) {
        //String str1 = "hello"; // (obj1 == obj2 )---> o/p --> 0
        String str1 = "helloo";// (obj1 > obj2 )---> o/p --> positive
        String str2 = "hello123";// (obj1 < obj2 )---> o/p --> Negative
        System.out.print(str1.compareTo(str2));
    }
}
