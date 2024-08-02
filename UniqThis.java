package BsicOopsPrograms;
public class UniqThis {
    void m1(){
        System.out.println("hello");
    }
    void m2(){
// This --> It is use only "non-static" method. it is refference varr and it hold the class identity.
                    // It is rffer to non-static method in corrent class.
                    // when we use static method then compiler automatacily add className Ex--> Test.m1()
        this.m1();// here this -->   (keyword /ref Varr) 
        System.out.println(("hii"));
    }

    public static void main(String[] args) {
        UniqThis ucheck = new UniqThis();
        // ucheck.m1();
        ucheck.m2();

    }
}
