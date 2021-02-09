package Eshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    Scanner data = new Scanner(new File("C:/Users/ליאל/Desktop/לימודים/Java/E-Shop/customers.txt"));
    Scanner productsFile = new Scanner(new File("C:/Users/ליאל/Desktop/לימודים/Java/E-Shop/products.txt"));
    protected String storeName;
    protected ArrayList<Product> productsInStore = new ArrayList<Product>();
    protected ArrayList<Customer> storeCustomers = new ArrayList<Customer>();
    protected ArrayList<Cart> cartsInStore = new ArrayList<Cart>();

    public Store(String storeName) throws FileNotFoundException {
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

    //הוספת מוצרים מקובץ
    public void storeProducts(){
        while(productsFile.hasNext()){
            String name = productsFile.nextLine();
            String id = productsFile.nextLine();
            String price = productsFile.nextLine();
            String discount = productsFile.nextLine();
            int numId = Integer.parseInt(id);
            double numPrice = Double.parseDouble(price);
            double numDiscount = Double.parseDouble(discount);
            Product product = new Product(name,numId,numPrice,numDiscount);
            this.productsInStore.add(product);
        }
        productsFile.close();
    }

    // הרשמת לקוחות לחנות מקובץ
    public void singUp(){
        while(data.hasNext()){
            String name=data.nextLine();
            String password=data.nextLine();
            String address=data.nextLine();
            String phone=data.nextLine();
            Customer customer = new Customer(name,password,address,phone);
            this.storeCustomers.add(customer);
        }
        data.close();

    }

    //הצגת הלקוחות
    public void showCustomers(){
        for(Customer customer:this.storeCustomers){
            System.out.println("--"+customer.getFullName()+"--\n");
            System.out.println("--"+customer.getPassword()+"--\n");
            System.out.println("--"+customer.getAddress()+"--\n");
            System.out.println("--"+customer.getPhone()+"--\n");
        }
    }

    //מחיקת לקוחות
    public void deleteCustomer(String name){
        for(Customer customer:this.storeCustomers){
            if(customer.getFullName().equals(name)){
                this.storeCustomers.remove(customer);
            }
        }
    }

    //התחברות לקוח ולקיחת עגלה
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

    //התנתקות לקוח
    public void customerLogout(String username){
        for(Customer customer:this.storeCustomers){
            if(customer.getFullName()==username){
                customer.logout();
            }
        }
    }
    //שינוי סיסמא ללקוח
    public void changePassword(String username){
        Scanner s=new Scanner(System.in);
        for(Customer customer:this.storeCustomers){
            if(customer.getFullName().equals(username)){
                System.out.println("Enter your current password please:\n");
                String currentPassword=s.nextLine();
                if(currentPassword.equals(customer.password)){
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
    //יוצר 100 עגלות
    public void createCart(){
        for(int i=0;i<100;i++){
           Cart cart=new Cart(1000+i,"empty");
           this.cartsInStore.add(cart);

        }
    }


}




