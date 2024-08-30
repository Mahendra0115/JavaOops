public class Address {
    private Integer houseNo;
    private String houseName;
    private Integer pinCode;

    // setter method
    public void setHouseNo(Integer houseNo) {
        this.houseNo = houseNo;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void setpinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    // getter method

    public Integer getHouseNo() {
        return this.houseNo;
    }

    public String getHouseName() {
        return this.houseName;
    }

    public Integer getpinCode() {
        return this.pinCode;
    }

    public String toString()
    {
       return this.houseNo+" "+ this.houseName+" "+this.pinCode;
    }

}
