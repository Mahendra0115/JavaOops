// NullPointrException ----> 
class Demo{
    static String name ;
    public static void main(String[] args) {
        try{
            int len = name.length();
            System.out.println("length is :"+len);
        }
        catch(NullPointerException nx){
            System.out.println("Difine Name in string");
        }
        System.out.println("all is well ");
    }
}