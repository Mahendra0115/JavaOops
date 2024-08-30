
// Blank Final Varr --> which final varr are  not initialised At the time of Declearation. that is called Blank Final Varr
// 1. Non-static Blank Final Varr
// 2. Static Final Blank Varr



// Using Non-Static Blank final Varr

 
class Demo {
    private  final Integer stdId;
    private  String stdName;

    Demo(Integer stdId, String stdName) {
        this.stdId = stdId;
        this.stdName = stdName;
    }

    // satter
    // public void setStdId(Integer stdId) {
    //     this.stdId = stdId;
    // }

    public void  setStdName(String stdName) {
        this.stdName = stdName;
    }

    // gatter
public  Integer getStdId(){
    return this.stdId;
}

public String getStdName(){
    return this.stdName;
}

}

class Test{
    public static void main(String[] args) {
        Demo demo = new Demo(101,"mahendra");
        System.out.print(demo.getStdId());
        System.out.print(" " +demo.getStdName());

        System.out.println();

        Demo demo2 = new Demo(102,"Chandan");
        System.out.print(demo2.getStdId());
        System.out.print(" " +demo2.getStdName());
    }
}


