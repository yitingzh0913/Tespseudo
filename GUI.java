import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI implements ActionListener{
	
	JTextArea input_area;
	JTextArea output_area;
	JButton b1;
	
	public GUI() { 
		
		
		/* creates box for text input */
		JFrame f= new JFrame();  
        input_area=new JTextArea("[input a line of code here]");  
        input_area.setBounds(10,60, 550,50);  
        
        f.add(input_area);    
        f.setLayout(null);  
        f.setVisible(true); 
        
        output_area=new JTextArea("[output]");  
        output_area.setBounds(10, 170, 550,50);
        f.add(output_area);   
    
        
	    JLabel l1,l2;  
	    l1=new JLabel("Input line: ");  
	    l1.setBounds(10,30, 100,30);  
	    l2=new JLabel("Pseudocode: ");  
	    l2.setBounds(10,145, 100,30);
	    
	    f.add(l1); f.add(l2);
	    f.setSize(600,320);
	    f.setLayout(null);  
	    f.setVisible(true);  
	    
	    
	    b1=new JButton("Enter");
	    b1.setBounds(10,230,50,40);
	    b1.addActionListener(this); 
	    f.add(b1);
	    
	    f.setSize(600,300);
	    f.setLayout(null);  
	    f.setVisible(true);  
	    
        
	}
	
	
	public void actionPerformed(ActionEvent e) {  
		
        String s1= input_area.getText();   
        
        output_area.setText(s1);  
    } 
	
	/*public static void main(String args[]) {
		
		new GUI();
		
	}*/

	
	
}


