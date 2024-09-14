import java.util.Scanner;

class CheckNameException extends RuntimeException {
    public String toString() {
        return "Name must be Initialie";
    }

}

class UserDefine {
    Scanner scanner = new Scanner(System.in);
    String stdName;
    Integer stdRum;
    String stdCourse;

    void Test() {

        System.out.println("Enter The Student Name: ");
        stdName = scanner.next();

        System.out.println("Enter the Rum :");
        stdRum = scanner.nextInt();

        System.out.println("Enter the Course: ");
        stdCourse = scanner.next();

        if(stdName == "mahi"){
            CheckNameException sne = new CheckNameException();
            throw sne;
        }
        // display method calling
        System.out.println(" Data is \n");
        Display();

    }

    void Display() {
        System.out.println("Name is:" + stdName);
        System.out.println("Rum is: " + stdRum);
        System.out.println("Course is:" + stdCourse);
    }

    public static void main(String[] args) {
       
        try {
            new UserDefine().Test();
        } catch (CheckNameException e) {
            System.out.println(e);
        }

    }
}
