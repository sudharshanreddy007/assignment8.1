package constructorOverloading;

public class Student {
//here we are taking the default class as Student
 Student(){  //here it is an default constructor
				 
			}
			  int id;  // taking the variables of int and string data types 
			    String name;  
			    int marks;  
			    
			    Student(int i,String n){ //here we are implementing another constructor by taking 
			    id = i;        //two parameters ,it is known as parameterized constructor 
			    name = n;  
			    }  //the constructor should have the same name of the class name 
			    Student(int i,String n ,int x){ //taking three parameters which shows that it is constructor overloaded
			    id = i;  
			    name = n;  
			    marks =x;  
			    }  
			    void display(){     //to display we are using this
			    	
			    	
			    	System.out.println("Student id  :"    +id);
			    	System.out.println("Student name: "   +name);
			    	System.out.println("Student marks: "   +marks);
			    	
			    	}  
			   
			    public static void main(String args[]){//here we have taken main method to display
			    	
			    Student s1 = new Student(124567,"Ramesh");  
			    Student s2 = new Student(321578,"Suresh",90);  
			 
			    s1.display();  
			    s2.display();  
			   }  

		}
