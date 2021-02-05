package Eshop;

import java.util.Arrays;

public class Cart {
    protected int cartId;
    protected Product[] products=new Product[100];
    protected int productsCount;
    protected String customerName;






    protected int productsIndex=0;

    public Cart(int cartId, String customer) {
        this.cartId = cartId;

        this.customerName=customer;

    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getProductsCount() {
        return productsCount;
    }

    public void setProductsCount(int productsCount) {
        this.productsCount = productsCount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void addProduct(Product product){
        this.products[this.productsIndex]=product;
        this.productsIndex++;
        System.out.println("Product added to the cart!");
    }
    public void deleteProduct(int productsIndex){
        this.products[this.productsIndex]=null;
        System.out.println("Product deleted!");
    }

    public void clearCart(){
        Arrays.fill(products,null);
        System.out.println("Cart is empty now!");
    }

    public void showProducts(){

        System.out.println("Products in the cart:\n");
        for(int i=0;i<products.length;i++){
            System.out.println(products[i].name+"\n");
        }
    }

    public void calcProductsPrice(){
        int sum=0;
        for(int i=0;i<products.length;i++){
            sum += products[i].price;
        }
        System.out.println("The total is: "+sum+"\n");
    }

}
