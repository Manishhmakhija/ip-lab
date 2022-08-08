import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;




 class Result extends JFrame implements ActionListener
	{
		JLabel l1;
		JTextField t1;
		JButton b1,b2;
		String s1;
		secondpage prev;
		
		Result(secondpage obj)
		
		{
					
			prev=obj;
			
		  l1=new JLabel("ENTER YOUR ROLL NO");
		  l1.setBounds(200,200,150,100);
		  add(l1);
		  
          t1=new JTextField("");
		  t1.setBounds(400,200,150,50);
		  add(t1);
		  
          b1=new JButton("FIND");
		   
          b1.setBounds(300,350,150,50);
          add(b1);	

          b1.addActionListener(this);
		  b2=new JButton("Back");
		   b2.setBounds(400,450,150,50);
          add(b2);	

          b2.addActionListener(this);
		}
          public void actionPerformed(ActionEvent e)
		  {
			  s1=t1.getText(); 
				studentresult f=new studentresult(s1,this);
				f.setSize(700,700);
				f.setLayout(null);
				f.setLocation(30,20);
				f.setTitle("School Management System Program");
				
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
             if(e.getActionCommand().equals("FIND"))
			 {
				this.setVisible(false);
				f.setVisible(true);
				
			 }
			              if(e.getActionCommand().equals("Back"))
			 {
				this.setVisible(false);
				prev.setVisible(true);
				
			 }
		  }
		}
	



class Fees extends JFrame implements ActionListener
	{
		JLabel l1;
		JTextField t1;
		JButton b1,b2;
		String s1;
		secondpage prev;
		
		Fees(secondpage obj)
		
		{
		    prev=obj;
			
		  l1=new JLabel("ENTER YOUR ROLL NO");
		  l1.setBounds(200,200,150,100);
		  add(l1);
		  
          t1=new JTextField("");
		  t1.setBounds(400,200,150,50);
		  add(t1);
		  
          b1=new JButton("FIND");
          b1.setBounds(300,350,150,50);
          add(b1);	

          b1.addActionListener(this);
		  b2=new JButton("Back");
		  b2.setBounds(400,450,150,50);
          add(b2);	

          b2.addActionListener(this);
		}
          public void actionPerformed(ActionEvent e)
		  {
			  s1=t1.getText(); 
				studentfees f=new studentfees(s1,this);
				f.setSize(700,700);
				f.setLayout(null);
				f.setLocation(30,20);
				f.setTitle("School Management System Program");
				
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
             if(e.getActionCommand().equals("FIND"))
			 {
				this.setVisible(false);
				f.setVisible(true);
				
			 }
			              if(e.getActionCommand().equals("Back"))
			 {
				this.setVisible(false);
				prev.setVisible(true);
				
			 }
		  }
			
	}





class Attendance extends JFrame implements ActionListener
	{
		JLabel l1;
		JTextField t1;
		JButton b1,b2;
		String s1;
		secondpage prev;
		
		Attendance(secondpage obj)
		
		{
			prev=obj;
			
		  l1=new JLabel("ENTER YOUR ROLL NO");
		  l1.setBounds(200,200,150,100);
		  add(l1);
		  
          t1=new JTextField("");
		  t1.setBounds(400,200,150,50);
		  add(t1);
		  
          b1=new JButton("FIND");
          b1.setBounds(300,350,150,50);
          add(b1);	

          b1.addActionListener(this);
		   b2=new JButton("Back");
          b2.setBounds(400,450,150,50);
          add(b2);	

          b2.addActionListener(this);
		}
          public void actionPerformed(ActionEvent e)
		  {
			  s1=t1.getText(); 
				studentattendance a=new studentattendance(s1,this);
				a.setSize(700,700);
				a.setLayout(null);
				a.setLocation(30,20);
				a.setTitle("School Management System Program");
				
				a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
             if(e.getActionCommand().equals("FIND"))
			 {
				this.setVisible(false);
				a.setVisible(true);
				
			 }
			 if(e.getActionCommand().equals("Back"))
			 {
				this.setVisible(false);
				prev.setVisible(true);
				
			 }
		  }
	}
class secondpage extends JFrame implements ActionListener

{
	JButton battendance,bfees,bresult;
	JLabel limage;
	
	secondpage()
	{
		ImageIcon bg=new ImageIcon("E:\\notepad ++ java\\secondpagebg.jpeg");
		limage=new JLabel(bg);
		
		
		
		battendance=new JButton("Attendance");
		battendance.addActionListener(this);
		
		bfees=new JButton("Fees");
		bfees.addActionListener(this);
		
		bresult=new JButton("Result");
		bresult.addActionListener(this);
		
		
		battendance.setBounds(290,275,100,100);
		bfees.setBounds(225,425,100,100);
		bresult.setBounds(350,425,100,100);
		
		limage.setBounds(0,0,700,700);
		
		
		limage.add(battendance);
		limage.add(bfees);
		limage.add(bresult);
		
		add(limage);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		
	       if(e.getSource()==battendance)
		{
			Attendance a=new Attendance(this);
			 a.setLayout(null);
			 a.setSize(500,500);
			 a.setLocation(200,200);
			 a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
			 this.setVisible(false);
			 a.setVisible(true);
		}
		
		else if(e.getSource()==bfees)
		{
			 Fees f=new Fees(this);
			 f.setLayout(null);
			 f.setSize(500,500);
			 f.setLocation(200,200);
			 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			this.setVisible(false);
			f.setVisible(true);
		}
		
		else if(e.getSource()==bresult)
		{
			Result r=new Result(this);
			 r.setLayout(null);
			 r.setSize(500,500);
			 r.setLocation(200,200);
			 r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
			 this.setVisible(false);
			r.setVisible(true);
		}

	}
		public static void main(String args[])
		{
			secondpage f=new secondpage();
			f.setSize(700,700);
			f.setLayout(null);
			f.setLocation(30,20);
			f.setTitle("School Management System Program");
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}