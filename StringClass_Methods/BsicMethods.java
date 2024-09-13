public class BsicMethods{
    public static void main(String args[]){
        String str = "@HelloMahendra";

        // String ki length (size) return karta hai.
        System.out.println("Length is: "+str.length());

        // charAt(int index) ---> Specific index par jo character hai, wo return karta hai.
        System.out.println("CharAt is: "+str.charAt(2));


        // substring(int beginIndex)--> Start index se lekar end tak ka string return karta hai.
        System.out.println(" subString is: "+str.substring(2 ));

        // equals(Object obj)-->  Do strings ko compare karta hai aur true return karta hai agar wo same hain.
        String str2 = "chnad";
        System.out.println(" equels is: "+str.equals(str2));

        //equalsIgnoreCase  --->  Case ko ignore karke compare karta hai
        System.out.println(" equalsIgnoreCase: "+str.equalsIgnoreCase(str2));

        //isEmpty() --> Check karta hai ki string empty hai ya nahi (length 0 hai).
          String str3 = "";
        System.out.println(" Empty is: "+str3.isEmpty());

        //toUpperCase() --> String ko uppercase letters mein convert karta hai.
        System.out.println("Str is Upper: "+str.toUpperCase()); 

        //replace(char oldChar, char newChar)--> replace(char oldChar, char newChar)
        System.out.println("Replace char is: "+str.replace('M','S'));

     // replaceAll('///#$','#')--> Regex match ko replacement se replace karta hai.  
     System.out.println("replace all char: "+str.replaceAll("@", "#"));
     System.out.println("replace all char: "+str.replaceAll("Mah", "@Sat"));


     // replaceFirst(String regex, String replacement) ---> Sirf pehle matching substring ko replace karta hai.
    System.out.println("replaceFirst is: "+str.replaceFirst("\\d", "#"));

    // startsWith(String prefix)-->  Check karta hai ki string kis prefix se start hoti hai.
    System.out.println("startsWith is: "+str.startsWith("@Hello"));

    //indexOf(String str)---> 
    System.out.println("Index is: "+str.indexOf("Mahe"));

//lastIndexOf(String str)---> String mein last occurrence of str ka index return karta hai.
System.out.println(str.lastIndexOf(9));


//contains(CharSequence s)---> Check karta hai ki string mein specific substring present hai ya nahi.
System.out.println("constains is: "+str.contains("sohil"));

//trim---> use to remove spaces
System.out.println("Terim is : "+ str.trim());

// matches(String regex)--->Check karta hai ki string num pattern ke match mein hai ya nahi.
 String num = "12345";
 System.out.println("Matches is: "+num.matches("\\d+"));

     // O/P --> True

    }

}


