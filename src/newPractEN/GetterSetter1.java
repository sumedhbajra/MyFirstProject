package newPractEN;

public class GetterSetter1 {
//    Private name variable
    private String name;
    private int age;
    private String address;
    private int contactNo;
    private int dob;

    public void setName(String meroName) {
        this.name = meroName;
    }
    public void setAge(int meroAge){
        this.age = meroAge;
    }
    public void setAddress(String meroAddress) {
        this.address = meroAddress;
    }
    public void setContactNo(int meroContact) {
        this.contactNo = meroContact;
    }
    public  void setDob(int merodob) {
        this.dob = merodob;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public int getContactNo() {
        return contactNo;
    }
    public int getDob() {
        return dob;
    }
}
