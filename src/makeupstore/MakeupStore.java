/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package makeupstore;

import makeupstore.customers.Customer;

import java.util.*;

public class MakeupStore {

    public static void main(String[] args) {
     Scanner key=new Scanner(System.in);   
     
    System.out.println("Please log in Your Account ");
    System.out.print("Your Name :");
    String userName=key.next();
    System.out.println("1412");
    System.out.print("Enter The Code To Verify You Are Not A Robot : ");
    int Code=key.nextInt();
    
    if(1412==Code){
        
     Customer U =new Customer(userName);
     System.out.println(U.ToString());
   
      //عباره عن المنتجات المتوفره
        Lipstick lip = new Lipstick("Matte Red Lipstick", "Dior", 194.99, "Red");
        Foundation found = new Foundation("Liquid Foundation", "MAC", 24.99, "Medium Beige");
    
       
        ArrayList<Products> shoppingCart = new ArrayList<>();             //يضيف للسله روج من شركه ديور وكريم من ماك
        shoppingCart.add(found);
        shoppingCart.add(lip);
       
        
        System.out.println(" Dear Customer: " +U.Name);
        System.out.println(" Your Shopping Cart:"); 

        for (Products prod : shoppingCart) {
            System.out.println("- " + prod.name + " by " + prod.brand); 
        }
        
       System.out.println("Are The Prouduct Brands Similar ? :"+ found.CompareBrand(lip, found));
       
        System.out.println("Choose a product (1 or 2) To Apply Discount: ");
        
        System.out.println("Available Products:");
        System.out.println("1. " + lip.name + " by " + lip.brand);
        System.out.println("2. " + found.name + " by " + found.brand);

        int choice = key.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Price before discount: $" + lip.price);
                System.out.println("Discounted Price: $" + lip.ApplyDiscount(lip.price));
                break;
            case 2:
                System.out.println("Price before discount: $" + found.price);
                System.out.println("Discounted Price: $" + found.ApplyDiscount(found.price));
                break;
            default:
                System.out.println("Invalid choice");
    }
        
        System.out.println("Do you want to buy all items in your shopping cart?(yes/no):  ");
        System.out.println("yes-All Products."+"\t"+"no-Only the Product that is discounted.");
        String buyAll = key.next();
        
        switch (buyAll){
         case "yes":  
               System.out.println("You bought all items in your shopping cart,Thank You.");
        break;
        case "no":
               System.out.println("You bought the item that is discounted,Thank You.");
        break;
    default:
        System.out.println("You have not purchased, Thank you for visiting the store.");
}
   
    }
    else
    System.out.println("Sorry, You Are Not Allowed");
     
            
}}