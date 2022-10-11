import java.awt.*;  
import java.awt.event.*;
public class form extends Frame {  
  
form(){  
Label firstName = new Label("First Name");  
firstName.setBounds(20, 50, 80, 20);  
  
Label roll = new Label("Roll number");  
roll.setBounds(20, 80, 80, 20);  
  
Label Branch = new Label("Branch");  
Branch.setBounds(20, 110, 80, 20);  
  
Label Contact = new Label("Contact");  
Contact.setBounds(20, 140, 80, 20);  

Label Gender = new Label("Gender");  
Gender.setBounds(20, 170, 80, 20); 

Label City = new Label("City");  
City.setBounds(20, 200, 80, 20); 

TextField Name = new TextField();  
Name.setBounds(120, 50, 100, 20);  
  
TextField rollno = new TextField();  
rollno.setBounds(120, 80, 100, 20);  
  
TextField branchs = new TextField();  
branchs.setBounds(120, 110, 100, 20);  
  
TextField contacts = new TextField();  
contacts.setBounds(120, 140, 100, 20);  




TextField city = new TextField();  
city.setBounds(120, 200, 100, 20);  

Button sbmt = new Button("Submit");  
sbmt.setBounds(20, 250, 100, 30);  
  
Button next = new Button("NEXT");  
next.setBounds(120,250,100,30);  
  
add(firstName);  
add(roll);  
add(Branch);
add(Contact); 
add(Gender);
add(City); 
add(Name);  
add(rollno);  
add(branchs); 
add(contacts); 

add(city); 
add(sbmt);  
add(next);
 
  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
form awt = new form();    
}  
}  