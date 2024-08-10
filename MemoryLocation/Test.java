package memorylocation;

public class Test {
    int x;
    static int y;

    void m1() {
        x = x + 1;
        y = y + 1;
    }

    public static void main(String[] args) {
        Test test1 = new Test();
        test1.m1();

        Test test2 = new Test();
        test2.m1();

        Test test3 = new Test();
        test3.m1();
        System.out.println("Memory located: ");

    }
}
