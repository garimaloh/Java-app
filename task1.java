package quiz;
import java.awt.BorderLayout;


import javax.swing.*;
class task1{
	public static void main(String args[]) {
		
		JFrame frame = new JFrame("Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);	
	 
        JLabel label = new JLabel();
        label.setText("Que1 Which among the following is not a datatype");
        frame.add(label,BorderLayout.NORTH);
        frame.setVisible(true);
        
        JRadioButton r1=new JRadioButton("int");    
        JRadioButton r2=new JRadioButton("float");
        JRadioButton r3=new JRadioButton("boolean");
        JRadioButton r4=new JRadioButton("char");
        r1.setBounds(75,50,100,30);    
        r2.setBounds(75,100,100,30); 
        r3.setBounds(75,150,100,30);
        r4.setBounds(75,200,100,30);
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);    
        frame.add(r1);frame.add(r2);  frame.add(r3);frame.add(r4);    
        frame.setLayout(null);    
        frame.setVisible(true);  
 
        JButton button1 = new JButton("Next");
        button1.setBounds(75,300,100,30);
        frame.add(button1);
        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        frame.setVisible(true);
        
        
        
	}
	}