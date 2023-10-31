package com.driver;
class Product{

    public int product(int x,int y){
      return x*y;
    }
    public int product(int x,int y,int z){
      return x*y*z;
    }
  }
public class Main {
    Product p= new Product();
    System.out.println(p.product(2,3));
    System.out.println(p.product(2,3,4));


    
        
         
}
    
    
    

