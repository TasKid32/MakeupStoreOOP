/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makeupstore;


public class Foundation extends Products implements Discountable {
  public String shade;

  
public Foundation(String n,String b,Double p,String s){
   super(n,b,p);
   this.shade=s;
} 

public boolean CompareBrand(Lipstick lpstick,Foundation foundation){
 if(lpstick.brand.equals(foundation.brand))
     return true;
 else
     return false;
}

public double ApplyDiscount(Double p){
 return this.price*0.9;      //Apply a 10% discount on foundations
}

}
