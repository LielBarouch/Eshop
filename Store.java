package Eshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    protected String storeName;
    protected ArrayList<Product> productsInStore = new ArrayList<Product>();
    protected ArrayList<Customer> storeCustomers = new ArrayList<Customer>();
    protected ArrayList<Cart> cartsInStore = new ArrayList<Cart>();

    public Store(String storeName) {
        this.storeName = storeName;

    }


    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ArrayList<Product> getProductsInStore() {
        return productsInStore;
    }

    public void setProductsInStore(ArrayList<Product> productsInStore) {
        this.productsInStore = productsInStore;
    }

    public ArrayList<Customer> getStoreCustomers() {
        return storeCustomers;
    }

    public void setStoreCustomers(ArrayList<Customer> storeCustomers) {
        this.storeCustomers = storeCustomers;
    }

    public ArrayList<Cart> getCartsInStore() {
        return cartsInStore;
    }

    public void setCartsInStore(ArrayList<Cart> cartsInStore) {
        this.cartsInStore = cartsInStore;
    }

    public void singUp(){
        Customer customer = new Customer();
        Scanner s=new Scanner(System.in);
        System.out.println("---Welcome to customer signup---\n" +
                "Please enter name:\n");
        String name=s.nextLine();
        System.out.println("Please enter customer address\n");
        String address=s.nextLine();
        System.out.println("Please enter customer phone number\n");
        String phone=s.nextLine();
        System.out.println("Please enter customer password\n");
        String password=s.nextLine();
        customer.setFullName(name);
        customer.setAddress(address);
        customer.setPhone(phone);
        customer.setPassword(password);
        this.storeCustomers.add(customer);
    }

    public void deleteCustomer(String name){
        for(Customer customer:this.storeCustomers){
            if(customer.getFullName()==name){
                this.storeCustomers.remove(customer);
            }
        }
    }



}




