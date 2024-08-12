
 // ( equals ) --> it is use to compare the refId Of both Object 
class Equals{
    public static void main(String args[]) {

        /*  

      // checking both object's ref_Id are equal or not 
        Equals obj1 = new Equals();
        Equals obj2 = new Equals();
        boolean res = obj1.equals(obj2);
        System.out.println(res);
    
        */


        // here we comparig the refId  of both Object  
        Equals obj1 = new Equals();
        Equals obj2 = new Equals();
        Equals obj3 = obj1;

        boolean res1 = obj1.equals(obj3);
        boolean res2 = obj1.equals(obj2);
        System.out.println(res1 +" " +res2);
        
    }
}

