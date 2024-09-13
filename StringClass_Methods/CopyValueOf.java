//copyValueOf(char[] data)---> Char array ko string mein convert karta hai.
public class CopyValueOf {
  public static void main(String[] args) {
   char arr[] = {'m','a','h','e','n','d','r','a'};
   String arr1 = String.copyValueOf(arr);
   System.out.println(arr1);
  }  
}
