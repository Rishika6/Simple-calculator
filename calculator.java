package calculato_project;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator implements ActionListener 
{
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    JTextArea textarea=new JTextArea(2,10);
    
    
   
    JButton button1=new JButton("1");
    JButton button2=new JButton("2");
    JButton button3=new JButton("3");
    JButton button4=new JButton("4");
    JButton button5=new JButton("5");
    JButton button6=new JButton("6");
    JButton button7=new JButton("7");
    JButton button8=new JButton("8");
    JButton button9=new JButton("9");
    JButton button0=new JButton("0");
    
    
    JButton add=new JButton("+");
    JButton sub=new JButton("-");
    JButton mul=new JButton("x");
    JButton div=new JButton("/");
    JButton eq=new JButton("=");
    JButton dot=new JButton(".");
    JButton clear=new JButton("c");
    
   double  number1,number2,number3;
    int addc=0;
    int subc=0;
    int divc=0;
    int mulc=0;
    
    
    public calculator()
    {
    	frame.setSize(350,450);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.add(panel);
    	frame.setTitle("Procalculator");
    	
    	
    	panel.setBackground(Color.BLACK);
        Border border=BorderFactory.createLineBorder(Color.CYAN, 4);
        panel.setBorder(border);
        panel.add(textarea);
        Border tborder=BorderFactory.createLineBorder(Color.CYAN, 4);
        textarea.setBorder( tborder);
        Font font=new Font("arial",Font.BOLD,33);
        textarea.setFont(font);
        textarea.setForeground(Color.orange);
        textarea.setPreferredSize(new Dimension(2,10));
        textarea.setLineWrap(true);
        
       
       button1.setPreferredSize(new Dimension(100,40));
       button2.setPreferredSize(new Dimension(100,40));
       button3.setPreferredSize(new Dimension(100,40));
       button4.setPreferredSize(new Dimension(100,40));
       button5.setPreferredSize(new Dimension(100,40));
       button6.setPreferredSize(new Dimension(100,40));
       button7.setPreferredSize(new Dimension(100,40));
       button8.setPreferredSize(new Dimension(100,40));
       button9.setPreferredSize(new Dimension(100,40)); 
       button0.setPreferredSize(new Dimension(100,40));
      
       
       
       
       add.setPreferredSize(new Dimension(100,40));
       
        
       sub.setPreferredSize(new Dimension(100,40));
      
       mul.setPreferredSize(new Dimension(100,40));
       dot.setPreferredSize(new Dimension(100,400));
       
       div.setPreferredSize(new Dimension(100,40));
      
       
       eq.setPreferredSize(new Dimension(100,40));
       
         
         
      clear.setPreferredSize(new Dimension(100,40));
       
    	
       panel.add(button1);
       panel.add(button2);
       panel.add(button3);
       panel.add(button4);
       panel.add(button5);
       panel.add(button6);
       panel.add(button7);
       panel.add(button8);
       panel.add(button9);
       panel.add(button0);
       panel.add(add);
       panel.add(sub);
       panel.add(div);
       panel.add(mul);
       panel.add(eq);
       panel.add(clear);
       panel.add(dot);
       
     
       
       button1.addActionListener((ActionListener) this);
       button2.addActionListener((ActionListener) this);
       button3.addActionListener((ActionListener) this);
       button4.addActionListener((ActionListener) this);
       button5.addActionListener((ActionListener) this);
       button6.addActionListener((ActionListener) this);
       button7.addActionListener((ActionListener) this);
       button8.addActionListener((ActionListener) this);
       button9.addActionListener((ActionListener) this);
       button0.addActionListener((ActionListener) this);
       add.addActionListener((ActionListener) this);
       sub.addActionListener((ActionListener) this);
       div.addActionListener((ActionListener) this);
       clear.addActionListener((ActionListener) this);
       eq.addActionListener((ActionListener) this);
       mul.addActionListener((ActionListener) this);
       dot.addActionListener((ActionListener) this);
       
       
       
    	
    }
    
    public  void actionPerformed(ActionEvent e)
    {
    	Object source=e.getSource();
    	
    	if(source==clear)
    	{
    		number1=0.0;
    	    number2=0.0;
            textarea.setText(" "); 
    	}
    	
    	if(source==button1)
    	  textarea.append("1");

    	if(source==button2)
    	  textarea.append("2");

    	if(source==button3)
    	  textarea.append("3");

    	if(source==button4)
    	  textarea.append("4");

    	if(source==button5)
    	  textarea.append("5");

    	if(source==button6)
    	  textarea.append("6");

    	if(source==button7)
    	  textarea.append("7");

    	if(source==button8)
    	  textarea.append("8");

    	if(source==button9)
    	  textarea.append("9");

    	if(source==button0)
    	  textarea.append("0");

    	if(source==dot)
    	  textarea.append(".");
    	

    	if(source==add)
    	{
    		number1=number_reader();
    		textarea.setText(" ");
    		addc=1;
    		subc=0;
    		divc=0;
    		mulc=0;
    		
    	}

    	 if(source==sub)
    	{
    		number1=number_reader();
    		textarea.setText(" ");
    		addc=0;
    		subc=1;
    		divc=0;
    		mulc=0;
    		
    	}

    	 if(source==div)
    	{
    		number1=number_reader();
    		textarea.setText(" ");
    		addc=0;
    		subc=0;
    		divc=1;
    		mulc=0;
    		
    	}

    	 if(source==mul)
    	{
    		number1=number_reader();
    		textarea.setText(" ");
    		addc=0;
    		subc=0;
    		divc=0;
    		mulc=1;
    		
    	}

    	 if(source==eq)
    	{
    		number2=number_reader();
    		if(addc>0)
    		{
    	 		number3=number1+number2;
    			textarea.setText(Double.toString(number3));
    		}
    		 if(subc>0)
    		{
    			number3=number1-number2;
    			textarea.setText(Double.toString(number3));
    		}
    		 if(divc>0)
    		{
    			number3=number1/number2;
    			textarea.setText(Double.toString(number3));
    		}
    		 if(mulc>0)
    		{
    			number3=(number1)*(number2);
    			textarea.setText(Double.toString(number3));
    		}
    		
    		
    	}
    	  
}
    public double number_reader()
    {
    	double num;
    	String s=textarea.getText();
    	num=Double.valueOf(s);
    	return num;
    }
    
}
