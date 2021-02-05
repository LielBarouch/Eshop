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

    public void showCustomers(){
        for(Customer customer:this.storeCustomers){
            System.out.println("--"+customer.getFullName()+"--\n");
        }
    }

    public void deleteCustomer(String name){
        for(Customer customer:this.storeCustomers){
            if(customer.getFullName()==name){
                this.storeCustomers.remove(customer);
            }
        }
    }

    public boolean customerLogin(String username){
        for(Customer customer:this.storeCustomers){
            if(customer.getFullName().equals(username)){
                customer.login();
                System.out.println("Logged in!\n");
                for(Cart cart:this.cartsInStore){
                    if(cart.customerName.equals("empty")){
                        cart.setCustomerName(username);
                        System.out.println(customer.getFullName()+" Took cart number "+ cart.cartId);
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void customerLogout(String username){
        for(Customer customer:this.storeCustomers){
            if(customer.getFullName()==username){
                customer.logout();
            }
        }
    }
    public void changePassword(String username){
        Scanner s=new Scanner(System.in);
        for(Customer customer:this.storeCustomers){
            if(customer.getFullName()==username){
                System.out.println("Enter your current password please:\n");
                String currentPassword=s.nextLine();
                if(currentPassword==customer.password){
                    System.out.println("Enter your new password:\n");
                    String newPassword=s.nextLine();
                    customer.setPassword(newPassword);
                }
            }
        }
    }

    public String returnAddress(String name){
        String addressGet=null;
        for(Customer customer:this.storeCustomers){
            if(customer.getFullName()==name){
                addressGet= customer.getAddress();
            }
        }
        return addressGet;
    }

    public String returnPhone(String name){
        String phoneGet=null;
        for(Customer customer:this.storeCustomers){
            if(customer.getFullName()==name){
                phoneGet= customer.getAddress();
            }
        }
        return phoneGet;
    }

    public void createCart(){
        for(int i=0;i<100;i++){
           Cart cart=new Cart(1000+i,"empty");
           this.cartsInStore.add(cart);

        }
    }


}




