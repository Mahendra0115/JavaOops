
public class Ducat {
    public static void main(String[] args) {

     Address address = new Address();
     address.setHouseNo(2530);
     address.setHouseName("Raj Bhavan");
     address.setpinCode(285129);


        Student student = new Student();
            student.setRollNo(123);
            student.setstudentName("mahi");
            student.setAddress(address);

            System.out.println(student.getRollNo());
            System.out.println(student.getstudentName());
            System.out.println(student.getAddress());

            //  house Address
            // System.out.println("houseNo:" +address.getHouseNo()+ "House Name: "+address.getHouseName()+ " Pin Code: "+address.getpinCode());
    }
}
