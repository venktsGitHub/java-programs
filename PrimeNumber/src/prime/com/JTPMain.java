package prime.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JTPMain {  
    public static void main(String... args) throws Exception, IOException{  
        File f= new File("Test.txt");  
        User u= new User("JavaTpoint",25, "Male");  
        System.out.println(u); 
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));    
        out.writeObject(u);  
        System.out.println(u); 
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));  
        
        User uk=(User)in.readObject();  
        
        System.out.println(uk.getAge());     
    }  
 }  