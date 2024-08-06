package pack.subpack;

public class WithoutPara {

    // public WithoutPara() {
        
    //     System.out.println("this is parametrais constructure: ");
    // }

    public WithoutPara(Integer x, Integer y) {
        // super();
        System.out.println("this is without parametrais constructure: ");
    }

    public static void main(String[] args) {
        // WithoutPara obj = new WithoutPara();
        WithoutPara obj1 = new WithoutPara(10, 12);

    }

}
