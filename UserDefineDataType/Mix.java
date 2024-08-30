public class Mix{
    private String stdName;
    private Integer stdRum;
    private String stdCourse;

    public Mix(String stdName, Integer stdRum, String stdCourse){
         this.stdName=stdName;
         this.stdRum = stdRum;
         this.stdCourse = stdCourse;
    }
    public String getStdName(){
        return stdName;
    }
    public Integer getStdRum(){
        return stdRum;
    }
    public String getStdCourse(){
        return stdCourse;
    }

}
