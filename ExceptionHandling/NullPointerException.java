// NullPointrException ----> 
class Demo{
    static String name ;
    public Demo(int i, String string, float f) {
        //TODO Auto-generated constructor stub
    }
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
    public String getStudentNo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentNo'");
    }
    public String getStudentName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentName'");
    }
    public String getStudentSal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentSal'");
    }
}