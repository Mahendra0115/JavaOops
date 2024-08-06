// Constructure chaining --> this is s process to call Multiple Constructor in (One Time).

// import javax.swing.text.html.StyleSheet;
public class Test{

    // creating Without parametrize constructure  using (Constructure Over loading)
     Test(){
       
        System.out.println("Hello");  //1. output
    }

    // parametrise constructor 
    Test(int a){
        this("");
        System.out.println("Byy"); // 3. output
    }

    Test(String name){
      this();
        System.out.println("Mahi");  // 2. output
    }
    public static void main(String[] args) {

        Test test1 = new Test(4);
        
    }

}