//getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) --->StringBuffer ke characters ko copy karta hai ek character array mein.
public  class GetChar{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("hellomahi");
           char chars[] = new char[5];
           sb.getChars(0,5,chars,0);
           System.out.println(chars);
    }
}
