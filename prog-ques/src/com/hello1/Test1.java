package com.hello1;

public class Test1 {
    public static void main(String[] args) {
      
        
        String ar[]="OXOXOO".split("");
        int k=2;
        boolean b= false;
        
        for(int i=0;i<k;i++) {
        	
        	if(ar[0].equals("X")) {
        		ar[0]="O";
        		//System.out.println(ar[0]);
        	}
        	
        	else if(ar[0].equals("O"))   {
        		ar[0]="X";
        		//System.out.println(ar[0]);
        		b=true;
        	}
        	
        	if(b) {
        		
        		for(int j=1;j<ar.length;j++) {
        			
        			if(ar[j-1].equals("X")) {
        				ar[j]=ar[j].equals("X")?"O":"X";
        			}
        			
        			else {
        				b=false;
        			}
        		}
        		
        	}
        	
        	for(int j=0;j<ar.length;j++) 
        	System.out.print(ar[j]);
        	
        	System.out.println();
        	
        }
        
     //   Hai h = new Hai();
       
        
    }
 }


