/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prashant
 */
public class TableData {
   private String name;
   private String ISBN;
   private String category;
   private String rating;
   private String coverType;
   private double price;
   private int discount;
   
   public TableData(String name, String ISBN, String category, String rating, String coverType, double price, int discount){ //initializing the variables through constructor
       this.name = name;
       this.ISBN = ISBN;
       this.category = category;
       this.rating = rating;
       this.coverType = coverType;
       this.price = price;
       this.discount = discount;
   }
   
   //Initializing getter methods for accessing the values of global variables
   public String getName(){
       return name;
   }
   
   public String getISBN(){
       return ISBN;
   }
   
   public String getCategory(){
       return category;
   }
   
   public String getRating(){
       return rating;
   }
   
   public String getCoverType(){
       return coverType;
   }
   
   public double getPrice(){
       return price;
   }
   
   public int getDiscount(){
       return discount;
   }
}
