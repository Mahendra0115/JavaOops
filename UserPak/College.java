// package mix ;

// import addresspak.*;
// import studentpak.*;


public class College{
    public static void main(String[] args) {

      

       address.setCollName("Rama University ");
       address.setCollCity(" Kanpur ");
       address.setCollState(" Uttar Pradesh ");
       address.setCollPinCode(209217);


       Student student1 = new Student();
       student1.m2();
       
        student1.setStdDepartment(" Faculty of Engineering Techonology ");
        student1.setStdName(" Mahendra Singh ");
        student1.setStdCourse(" B.tech ");
        student1.setStdRum(20247 );
        student1.setAddress(address);


        System.out.println(student1.getStdDepartment());
        System.out.println(student1.getStdName());
        System.out.println(student1.getStdCourse());
        System.out.println(student1.getStdRum());
        System.out.println(student1.getAddress());


       
    }
}
