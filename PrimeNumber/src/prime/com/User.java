package prime.com;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {  
    private String name;  
    private int age; 
    private String sex;
    public User(){}  
    public User(String userName,int age, String sex){  
        this.name= userName;  
        this.age=age;  
        this.sex=sex;
    }  
    @Override  
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {  
        name=(String) in.readObject();  
        sex= (String) in.readObject();  
        age=in.readInt();  
    }  
    @Override  
    public void writeExternal(ObjectOutput out) throws IOException {  
        out.writeObject(name);  
        out.writeObject(sex); 
        out.writeInt(age);
    }  
      
    public String getUserName() {  
        return name;  
    }  
    public void setUserName(String userName) {  
        this.name = userName;  
    }  
    public int getAge() {  
        return age;  
    }  
    public void setAge(int age) {  
        this.age = age;  
        
    }  
    
    public String getSex() {  
        return sex;  
    }  
    public void setSex(String sex) {  
        this.sex = sex;  
        
    }
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	} 
    
    
}  