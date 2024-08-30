// package addresspak;

public class Address {

    public void m1(){
        System.out.println("m1");
    }
    private String collName;
    private String collCity;
    private String collState;
    private Integer collpinCode;
  
    public void setCollName(String collName){
        this.collName = collName;
    }

    public void setCollCity(String collCity){
        this.collCity = collCity;
    }

    public void setCollState(String collState){
        this.collState = collState;
    }

    public void setCollPinCode(Integer collpinCode){
        this. collpinCode =  collpinCode;
    }

    // getter
    public String getCollName(){
        return this.collName;
    }

    public String getCollCity(){
        return this.collCity;
    }

    public String getCollState(){
        return this.collState;
    }

    
    public Integer getCollPinCode(){
        return this.collpinCode;
    }

    public String toString(){
        return collName+" "+collCity+" "+collState+""+collpinCode ;
       }

}
