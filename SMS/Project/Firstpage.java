import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;




 class Result extends JFrame implements ActionListener
	{
		Container c;
		Firstpage prev;
		JTable jt;
		JScrollPane sp;
		JButton b1;
		
		Result(Firstpage obj)
		
		{
			prev=obj;
			
			c=getContentPane();
			String column[]={"Name","Roll NO.","Pointer"};
			String data[][]=new String[1000][3];
			
			b1=new JButton("BACK");
			try{  
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Manish@12345");
               
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from miniproject.result");
				int i=0;
                while(rs.next()==true) 
                       
                {
					
					
					data[i][0]=rs.getString(1);
                    data[i][1]=rs.getString(2);
                    data[i][2]=rs.getString(3);
                   
                    
					i++;
                 }
                jt=new JTable(data,column);
				sp=new JScrollPane(jt);
				
				 add(sp,BorderLayout.CENTER);
				 add(b1,BorderLayout.SOUTH);
				 b1.addActionListener(this);
				 this.setSize(700,500);
				 this.setVisible(true);
                con.close();  
				
            }
			catch(Exception ex)
                { 
                    System.out.println(ex);
                }  
		}
		
		
		public void actionPerformed(ActionEvent e)
				{
					if(e.getActionCommand().equals("BACK"))
					{
						this.setVisible(false);
						prev.setVisible(true);
					}
				}
	}



class Fees extends JFrame implements ActionListener
	 	{
		Container c;
		Firstpage prev;
		JTable jt;
		JScrollPane sp;
		JButton b1;
		
		Fees(Firstpage obj)
		
		{
			prev=obj;
			
			c=getContentPane();
			String column[]={"Name","Roll NO.","For Sem","Amount"};
			String data[][]=new String[1000][4];
			
			b1=new JButton("BACK");
			try{  
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Manish@12345");
               
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from miniproject.fees");
				int i=0;
                while(rs.next()==true) 
                       
                {
					
					
					data[i][0]=rs.getString(1);
                    data[i][1]=rs.getString(2);
                    data[i][2]=rs.getString(3);
					data[i][3]=rs.getString(4);
					
                   
                    
					i++;
                 }
                jt=new JTable(data,column);
				sp=new JScrollPane(jt);
				
				 add(sp,BorderLayout.CENTER);
				 add(b1,BorderLayout.SOUTH);
				 b1.addActionListener(this);
				 this.setSize(700,500);
				 this.setVisible(true);
                con.close();  
				
            }
			catch(Exception ex)
                { 
                    System.out.println(ex);
                }  
		}
		
		
		public void actionPerformed(ActionEvent e)
				{
					if(e.getActionCommand().equals("BACK"))
					{
						this.setVisible(false);
						prev.setVisible(true);
					}
				}
	}





class Attendance extends JFrame implements ActionListener
		{
		Container c;
		Firstpage prev;
		JTable jt;
		JScrollPane sp;
		JButton b1;
		
		Attendance(Firstpage obj)
		
		{
			prev=obj;
			
			c=getContentPane();
			String column[]={"Name","Roll NO.","Attendance"};
			String data[][]=new String[1000][3];
			
			b1=new JButton("BACK");
			try{  
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Manish@12345");
               
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from miniproject.attendance");
				int i=0;
                while(rs.next()==true) 
                       
                {
					
					
					data[i][0]=rs.getString(1);
                    data[i][1]=rs.getString(2);
                    data[i][2]=rs.getString(3);
                   
                    
					i++;
                 }
                jt=new JTable(data,column);
				sp=new JScrollPane(jt);
				
				 add(sp,BorderLayout.CENTER);
				 add(b1,BorderLayout.SOUTH);
				 b1.addActionListener(this);
				 this.setSize(700,500);
				 this.setVisible(true);
				 b1.setVisible(true);
                con.close();  
				
            }
			catch(Exception ex)
                { 
                    System.out.println(ex);
                }  
		}
		
		
		public void actionPerformed(ActionEvent e)
				{
					if(e.getActionCommand().equals("BACK"))
					{
						this.setVisible(false);
						prev.setVisible(true);
					}
				}
	}

















class Firstpage extends JFrame implements ActionListener

{
	JButton battendance,bfees,bresult;
	JLabel limage;
	
	Firstpage()
	{
		ImageIcon bg=new ImageIcon("E:\\notepad ++ java\\firstpagebg.jpeg");
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
			Firstpage f=new Firstpage();
			f.setSize(700,700);
			f.setLayout(null);
			f.setLocation(30,20);
			f.setTitle("School Management System Program");
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}