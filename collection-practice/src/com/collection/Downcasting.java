package com.collection;

abstract class Parent {   
    String name;   
    public abstract void showMessage();
 
}  

interface  Parentable {   
    String name="rugkt";   
    
    void showMessage();
    
    
}   
  
    
// Child class   
class Child extends Parent implements Parentable{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		
	}   
   
    
}   
    
public class Downcasting{  
    
    public static void main(String[] args)   
    {   
//        Parent p = new Child();  
//        p.name = "Shubham";  
    	
    	System.out.println("Jana netha Paesan");
          
       
    }   
}  