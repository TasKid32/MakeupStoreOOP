/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makeupstore;

public  class Lipstick extends Products implements Discountable {
 public String color; 

 
 public Lipstick(String n, String b, double p,String c){
   super(n,b,p); 
   this.color=c; 
 }
 

   public void printProductInfo() {
       System.out.println("Lipstick: " + this.name + " by " + this.brand + ", Color: " + this.color);
   }

   // Overloaded copy of the method
   public void printProductInfo(String NAME) {
       System.out.println("Lipstick: " + this.name + " by " + this.brand + ", Color: " + this.color + ", " + NAME);
   }
 
 @Override
 public double ApplyDiscount(Double p){
           return this.price * 0.85;            //Apply a 15% discount on lipsticks
 }
}
