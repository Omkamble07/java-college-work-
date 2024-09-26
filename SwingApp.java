import javax.swing.*; 
public class SwingApp{
    SwingApp(){  
        JFrame f = new JFrame(); 
        
        JLabel firstName = new JLabel("First Name");  
        firstName.setBounds(20, 50, 100, 20);   
  
        JLabel lastName = new JLabel("Last Name");  
        lastName.setBounds(20, 80, 100, 20);  

        JLabel mobileNumber = new JLabel("Mobile number");
        mobileNumber.setBounds(20,110,100,20);
        
        JTextField firstNameTF = new JTextField();  
        firstNameTF.setBounds(120, 50, 100, 20);  
  
        JTextField lastNameTF = new JTextField();  
        lastNameTF.setBounds(120, 80, 100, 20);  

        JTextField mobileNumerTf = new JTextField();
        mobileNumerTf.setBounds(120, 110, 100, 20);

        JButton submt = new JButton("Submit");  
        submt.setBounds(20, 160, 100, 30);  
  
        JButton reset = new JButton("Reset");  
        reset.setBounds(120,160,100,30);  

        f.add(firstName);  
        f.add(lastName);  
         
        f.add(firstNameTF);  
        f.add(lastNameTF); 
        
        f.add(mobileNumber);
        f.add(mobileNumerTf);
         
        f.add(submt);  
        f.add(reset);  

        f.setSize(700,500);  
        f.setLayout(null);  
        f.setVisible(true);


    }
    public static void main(String[] args) {  
        SwingApp s = new SwingApp();  
        }  
     
}