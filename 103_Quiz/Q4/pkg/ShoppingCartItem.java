package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String itemName;
    private double itemCost;
    private int quantity;
    
    public ShoppingCartItem(){
        itemName = "Unknown";
        itemCost = 0.0;
        quantity = 0;
    }
    
    public ShoppingCartItem(String a, double b, int c){
        itemName = a;
        itemCost = b;
        quantity = c;
    }
    
    public void cartToString(){
        System.out.println("You have " + quantity + " of " + itemName + " for " + itemCost + "$ each");
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getTotalCost(){
        double a = itemCost * quantity;
        return a;
    }
    
    public double getTotalWithTax(){
        double x = (itemCost * quantity) * 0.12;
        double z = (itemCost * quantity);
        double sum = x + z;
        return sum;
    }
    
    public double quantityToCostCalculator(int A){
        double x = itemCost * A;
        return x;
    }
    
    public boolean compareItemCost(int a, int b){
        if (a < b){
            return true;
        }
        else {
            return false;
        }
    }
    
    
}
