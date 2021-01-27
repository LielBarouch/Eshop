package Eshop;

import java.util.Scanner;

public class Customer {

    protected String fullName;
    protected String password;
    protected String address;
    protected String phone;
    protected Cart cart;
    private boolean online;

    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Customer(){
        this.fullName = null;
        this.password = null;
        this.address = null;
        this.phone = null;
    }

    public Customer(String fullName, String password, String address, String phone) {
        this.fullName = fullName;
        this.password = password;
        this.address = address;
        this.phone = phone;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public void login() {
        
        this.online=true;
    }

    public void logout() {
        this.online=false;
    }

    public void changePassword(){
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a new password");
        String newPassword=s.nextLine();
        this.password=newPassword;
        System.out.println("Password changed");
    }

    public void changeAddress(){
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a new address");
        String newAddress=s.nextLine();
        this.password=newAddress;
        System.out.println("Address changed");
    }

    public void changePhone(){
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a new phone number");
        String newPhone=s.nextLine();
        this.password=newPhone;
        System.out.println("Phone number changed");
    }



}
