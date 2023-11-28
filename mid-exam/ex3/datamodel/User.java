package ex3.datamodel;

import java.math.BigInteger;

public class User {

    private String userId;
    private String fname;
    private String lname;
    private String email;
    private String password;
    private String address;
    private BigInteger phone;
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public BigInteger getPhone() {
        return phone;
    }
    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

}
