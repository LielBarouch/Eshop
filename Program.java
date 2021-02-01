package Eshop;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Store store = new Store("Makolet");
        //Customer newCustomer=new Customer();
        Scanner scanner=new Scanner(System.in);
        int userInput, subUserInput;
        System.out.println("----Welcome to the shop----\n");
//        System.out.println("----Enter the action number you would like to do\n");
//        System.out.println("-For Shop actions press 1\n" +
//                "-for costumer actions press 2\n");
//        int userInput=scanner.nextInt();
//        while (userInput!=0){
//            switch(userInput){
//                case 1:
//                    System.out.println("----Welcome to the Shop menu----\n" +
//                            "-For costumer signup press 11\n" +
//                            "-For costumer remove press 12\n" +
//                            "-To add a cart press 13\n" +
//                            "-To remove a cart press 14\n" +
//                            "-to see active costumers press 15\n" +
//                            "-To see how many cart are taken press 16\n" +
//                            "-For daily incomes press 17\n" +
//                            "-For daily products sale press 18\n");
//                    int userInput2=scanner.nextInt();
//                    switch(userInput2){
//                        case 11:
//                            store.singUp();
//                            break;
//                        case 12:
//                            System.out.println("Enter the customer name you want to delete:\n");
//                            String name=scanner.nextLine();
//                            store.deleteCustomer(name);
//                            break;
//                    }
//                    break;
//                case 2:
//                    Customer newCustomer=new Customer();
//                    System.out.println("----Welcome to the Costumer menu----\n" +
//                            "-For costumer login press 21\n" +
//                            "-For costumer logout press 22\n" +
//                            "-To change your password press 23\n" +
//                            "-To change your address press 24\n" +
//                            "-To change your phone number press 25\n" +
//                            "-To take a cart press 26\n" +
//                            "-To release a cart press 27\n" +
//                            "-To add a product to the cart press 28\n" +
//                            "-To remove a product from the cart press 29\n" +
//                            "-For payment press 30\n");
//                    switch(userInput){
//                        case 21:
//                            System.out.println("Enter your full name:\n");
//                            String name=scanner.nextLine();
//                            System.out.println("Enter your password:\n");
//                            String password=scanner.nextLine();
//                            if(store.customerLogin(name,password)){
//                                newCustomer.setFullName(name);
//                                newCustomer.setPassword(password);
//                                newCustomer.setAddress(store.returnAddress(name));
//                                newCustomer.setPhone(store.returnPhone(name));
//
//                            }
//                            break;
//                        case 22:
//                            store.customerLogout(newCustomer.fullName);
//                            break;
//                        case 23:
//                            store.changePassword(newCustomer.fullName);
//                            break;
//
//
//
//                    }
//            }
//        }

        do{
            System.out.println("----Enter the action number you would like to do\n");
            System.out.println("-For Shop actions press 1\n" +
                    "-for costumer actions press 2\n");
            userInput=scanner.nextInt();

            switch(userInput){
                case 1:{
                    do {
                    System.out.println("----Welcome to the Shop menu----\n" +
                            "-For costumer signup press 11\n" +
                            "-For costumer remove press 12\n" +
                            "-To add a cart press 13\n" +
                            "-To remove a cart press 14\n" +
                            "-to see active costumers press 15\n" +
                            "-To see how many cart are taken press 16\n" +
                            "-For daily incomes press 17\n" +
                            "-For daily products sale press 18\n+" +
                            "-For all customers press 20\n"+
                            "-To exit press 19\n");
                    subUserInput = scanner.nextInt();
                    switch (subUserInput) {
                        case 11:
                            store.singUp();
                            break;
                        case 12:
                            System.out.println("Enter the customer name you want to delete:\n");
                            String name = scanner.nextLine();
                            store.deleteCustomer(name);
                            break;
                        case 20:
                            store.showCustomers();
                            break;
                    }
                }while(subUserInput!=19);
                    break;
                }
                case 2:
                {
                    do{
                        Customer newCustomer=new Customer();
                        System.out.println("----Welcome to the Costumer menu----\n" +
                            "-For costumer login press 21\n" +
                            "-For costumer logout press 22\n" +
                            "-To change your password press 23\n" +
                            "-To change your address press 24\n" +
                            "-To change your phone number press 25\n" +
                            "-To take a cart press 26\n" +
                            "-To release a cart press 27\n" +
                            "-To add a product to the cart press 28\n" +
                            "-To remove a product from the cart press 29\n" +
                            "-For payment press 30\n" +
                                "-To exit press 31\n");
                        subUserInput = scanner.nextInt();
                    switch(subUserInput){
                        case 21:
                            Scanner c = new Scanner(System.in);
                            System.out.println("Enter your full name:\n");
                            String name=c.nextLine();
//                            System.out.println("Enter your password:\n");
//                            String password=c.nextLine();
                            if(store.customerLogin(name)){
                                newCustomer.setFullName(name);
                                newCustomer.setPassword("1234");
                                newCustomer.setAddress(store.returnAddress(name));
                                newCustomer.setPhone(store.returnPhone(name));

                            }
                            break;
                        case 22:
                            store.customerLogout(newCustomer.fullName);
                            break;
                        case 23:
                            store.changePassword(newCustomer.fullName);
                            break;

                    }
                }while(subUserInput!=31);
                }

            }
        }while(userInput!=0);

    }
}
