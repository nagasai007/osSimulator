package Final;
import javax.swing.*;
import java.io.*;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class dining {
	JFrame frame;
	
	static class Group7//Somophore class monitor
	{
		int status[];//status of each philosopher 0 ->THINK 1->HUNGRY 2->EATING
		void pickup(int i)
		{
			status[i]=1;
			test(i);
			System.out.println("Picking Up "+i);
		}
		void test(int i)
		{
			if(status[(i+4)%5]!=2 && status[(i+1)%5]!=2 && status[i]==1)
			{
				status[i]=2;
			}
		}
		void putdown(int i)
		{
			status[i]=0;
			System.out.println("Put Down "  +  i);
			test((i+4)%5);
			test((i+1)%5);
		}
		Group7(){
			status=new int[5];
			System.out.println("HERERE");
			for(int i=0;i<5;i++)
			{
				status[i]=0;
			}
		}
	}
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dining window=new dining();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public dining(){
		initialize();
	}
	public void initialize(){
		ImageIcon eat = new ImageIcon("E:\\workspace\\group7\\src\\group7\\eat.png");
		ImageIcon hungry = new ImageIcon("E:\\workspace\\group7\\src\\group7\\hungry.png");
		ImageIcon think = new ImageIcon("E:\\workspace\\group7\\src\\group7\\thinking.png");

		Group7 d = new Group7();
		
		
		 frame = new JFrame("DINNER STARTS HERE");
		  frame.setVisible(true);
		  frame.setSize(1368,768);//Full resolution of this computer
		  frame.setLayout(null);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  //JPanel panel = new JPanel(); 
		  //frame.add(panel);
		  
		  JButton button3=new JButton("");
		  JButton button5 = new JButton("");
		  JButton button2 = new JButton("");
		  
		  
		  JButton button4 = new JButton("");
		   
		  
		  
		  JButton button1 = new JButton("");
		  
		  
		  
		  frame.getContentPane().add(button1);
		  frame.getContentPane().add(button2);
		  frame.getContentPane().add(button3);
		  frame.getContentPane().add(button4);
		  frame.getContentPane().add(button5);
		  frame.getContentPane().setBackground(Color.black);
		  button1.setBounds(100,250,200,200);
		  button2.setBounds(500, 20, 200, 200);
		  button3.setBounds(900, 250, 200, 200);
		  button4.setBounds(800, 500, 200, 200);
		  button5.setBounds(200, 500, 200, 200);
		
		  button1.setIcon(think);
		  button2.setIcon(think);
		  button3.setIcon(think);
		  button4.setIcon(think);
		  button5.setIcon(think);
		  
		  
		  
		  
		  Random rand=new Random();
		  int w=rand.nextInt(5);
		  System.out.println(w);
		  while(true){
			  			if(w==0){
										if(d.status[0]==2)
										{
											d.putdown(0);
										}
										else
										{
											d.pickup(0);
										}
										if(d.status[0]==0)
										{
											button1.setBackground(Color.green);
											button1.setIcon(think);
										}
										else if(d.status[0]==1)
										{
											button1.setBackground(Color.orange);
											button1.setIcon(hungry);
										}
										else if(d.status[0]==2)
										{
											button1.setBackground(Color.red);
											button1.setIcon(eat);
										}
										
										
										if(d.status[1]==0)
										{
											button2.setBackground(Color.green);
											button2.setIcon(think);
										}
										else if(d.status[1]==1)
										{
											button2.setBackground(Color.orange);
											button2.setIcon(hungry);
										}
										else if(d.status[1]==2)
										{
											button2.setBackground(Color.red);
											button2.setIcon(eat);
										}
										
										
										if(d.status[2]==0)
										{
											button3.setBackground(Color.green);
											button3.setIcon(think);
										}
										else if(d.status[2]==1)
										{
											button3.setBackground(Color.orange);
											button3.setIcon(hungry);
										}
										else if(d.status[2]==2)
										{
											button3.setBackground(Color.red);
											button3.setIcon(eat);
										}
										
										
										
										if(d.status[3]==0)
										{
											button4.setBackground(Color.green);
											button4.setIcon(think);
										}
										else if(d.status[3]==1)
										{
											button4.setBackground(Color.orange);
											button4.setIcon(hungry);
										}
										else if(d.status[3]==2)
										{
											button4.setBackground(Color.red);
											button4.setIcon(eat);
										}
										
										if(d.status[4]==0)
										{
											button5.setBackground(Color.green);
											button5.setIcon(think);
										}
										else if(d.status[4]==1)
										{
											button5.setBackground(Color.orange);
											button5.setIcon(hungry);
										}
										else if(d.status[4]==2)
										{
											button5.setBackground(Color.red);
											button5.setIcon(eat);
										}
			  					}
					
				  
				  
		
				  
				   
			  			else if(w==1){
			  				
											if(d.status[1]==2)
											{
												d.putdown(1);
											}
											else
											{
												d.pickup(1);
											}
												if(d.status[0]==0)
												{
													button1.setBackground(Color.green);
													button1.setIcon(think);
												}
												else if(d.status[0]==1)
												{
													button1.setBackground(Color.orange);
													button1.setIcon(hungry);
												}
												else if(d.status[0]==2)
												{
													button1.setBackground(Color.red);
													button1.setIcon(eat);
												}
												
												
												if(d.status[1]==0)
												{
													button2.setBackground(Color.green);
													button2.setIcon(think);
												}
												else if(d.status[1]==1)
												{
													button2.setBackground(Color.orange);
													button2.setIcon(hungry);
												}
												else if(d.status[1]==2)
												{
													button2.setBackground(Color.red);
													button2.setIcon(eat);
												}
												
												
												if(d.status[2]==0)
												{
													button3.setBackground(Color.green);
													button3.setIcon(think);
												}
												else if(d.status[2]==1)
												{
													button3.setBackground(Color.orange);
													button3.setIcon(hungry);
												}
												else if(d.status[2]==2)
												{
													button3.setBackground(Color.red);
													button3.setIcon(eat);
												}
												
												
												
												if(d.status[3]==0)
												{
													button4.setBackground(Color.green);
													button4.setIcon(think);
												}
												else if(d.status[3]==1)
												{
													button4.setBackground(Color.orange);
													button4.setIcon(hungry);
												}
												else if(d.status[3]==2)
												{
													button4.setBackground(Color.red);
													button4.setIcon(eat);
												}
												
												if(d.status[4]==0)
												{
													button5.setBackground(Color.green);
													button5.setIcon(think);
												}
												else if(d.status[4]==1)
												{
													button5.setBackground(Color.orange);
													button5.setIcon(hungry);
												}
												else if(d.status[4]==2)
												{
													button5.setBackground(Color.red);
													button5.setIcon(eat);
												}
							
			  							}
					
				 
				  
				  
				   
			  			else if(w==2) {
											if(d.status[2]==2)
											{
												d.putdown(2);
											}
											else
											{
												d.pickup(2);
											}
											if(d.status[0]==0)
											{
												button1.setBackground(Color.green);
												button1.setIcon(think);
											}
											else if(d.status[0]==1)
											{
												button1.setBackground(Color.orange);
												button1.setIcon(hungry);
											}
											else if(d.status[0]==2)
											{
												button1.setBackground(Color.red);
												button1.setIcon(eat);
											}
											
											
											if(d.status[1]==0)
											{
												button2.setBackground(Color.green);
												button2.setIcon(think);
											}
											else if(d.status[1]==1)
											{
												button2.setBackground(Color.orange);
												button2.setIcon(hungry);
											}
											else if(d.status[1]==2)
											{
												button2.setBackground(Color.red);
												button2.setIcon(eat);
											}
											
											
											if(d.status[2]==0)
											{
												button3.setBackground(Color.green);
												button3.setIcon(think);
											}
											else if(d.status[2]==1)
											{
												button3.setBackground(Color.orange);
												button3.setIcon(hungry);
											}
											else if(d.status[2]==2)
											{
												button3.setBackground(Color.red);
												button3.setIcon(eat);
											}
											
											
											
											if(d.status[3]==0)
											{
												button4.setBackground(Color.green);
												button4.setIcon(think);
											}
											else if(d.status[3]==1)
											{
												button4.setBackground(Color.orange);
												button4.setIcon(hungry);
											}
											else if(d.status[3]==2)
											{
												button4.setBackground(Color.red);
												button4.setIcon(eat);
											}
											
											if(d.status[4]==0)
											{
												button5.setBackground(Color.green);
												button5.setIcon(think);
											}
											else if(d.status[4]==1)
											{
												button5.setBackground(Color.orange);
												button5.setIcon(hungry);
											}
											else if(d.status[4]==2)
											{
												button5.setBackground(Color.red);
												button5.setIcon(eat);
											}
									}
					
				 
				  
				  
			  			else if(w==3){
											if(d.status[3]==2)
											{
												d.putdown(3);
											}
											else
											{
												d.pickup(3);
											}
											if(d.status[0]==0)
											{
												button1.setBackground(Color.green);
												button1.setIcon(think);
											}
											else if(d.status[0]==1)
											{
												button1.setBackground(Color.orange);
												button1.setIcon(hungry);
											}
											else if(d.status[0]==2)
											{
												button1.setBackground(Color.red);
												button1.setIcon(eat);
											}
											
											
											if(d.status[1]==0)
											{
												button2.setBackground(Color.green);
												button2.setIcon(think);
											}
											else if(d.status[1]==1)
											{
												button2.setBackground(Color.orange);
												button2.setIcon(hungry);
											}
											else if(d.status[1]==2)
											{
												button2.setBackground(Color.red);
												button2.setIcon(eat);
											}
											
											
											if(d.status[2]==0)
											{
												button3.setBackground(Color.green);
												button3.setIcon(think);
											}
											else if(d.status[2]==1)
											{
												button3.setBackground(Color.orange);
												button3.setIcon(hungry);
											}
											else if(d.status[2]==2)
											{
												button3.setBackground(Color.red);
												button3.setIcon(eat);
											}
											
											
											
											if(d.status[3]==0)
											{
												button4.setBackground(Color.green);
												button4.setIcon(think);
											}
											else if(d.status[3]==1)
											{
												button4.setBackground(Color.orange);
												button4.setIcon(hungry);
											}
											else if(d.status[3]==2)
											{
												button4.setBackground(Color.red);
												button4.setIcon(eat);
											}
											
											if(d.status[4]==0)
											{
												button5.setBackground(Color.green);
												button5.setIcon(think);
											}
											else if(d.status[4]==1)
											{
												button5.setBackground(Color.orange);
												button5.setIcon(hungry);
											}
											else if(d.status[4]==2)
											{
												button5.setBackground(Color.red);
												button5.setIcon(eat);
											}
			  						}
				  
				  
				
			  			else if(w==4) {
											if(d.status[4]==2)
											{
												d.putdown(4);
											}
											else
											{
												d.pickup(4);
											}
											if(d.status[0]==0)
											{
												button1.setBackground(Color.green);
												button1.setIcon(think);
											}
											else if(d.status[0]==1)
											{
												button1.setBackground(Color.orange);
												button1.setIcon(hungry);
											}
											else if(d.status[0]==2)
											{
												button1.setBackground(Color.red);
												button1.setIcon(eat);
											}
											
											
											if(d.status[1]==0)
											{
												button2.setBackground(Color.green);
												button2.setIcon(think);
											}
											else if(d.status[1]==1)
											{
												button2.setBackground(Color.orange);
												button2.setIcon(hungry);
											}
											else if(d.status[1]==2)
											{
												button2.setBackground(Color.red);
												button2.setIcon(eat);
											}
											
											
											if(d.status[2]==0)
											{
												button3.setBackground(Color.green);
												button3.setIcon(think);
											}
											else if(d.status[2]==1)
											{
												button3.setBackground(Color.orange);
												button3.setIcon(hungry);
											}
											else if(d.status[2]==2)
											{
												button3.setBackground(Color.red);
												button3.setIcon(eat);
											}
											
											
											
											if(d.status[3]==0)
											{
												button4.setBackground(Color.green);
												button4.setIcon(think);
											}
											else if(d.status[3]==1)
											{
												button4.setBackground(Color.orange);
												button4.setIcon(hungry);
											}
											else if(d.status[3]==2)
											{
												button4.setBackground(Color.red);
												button4.setIcon(eat);
											}
											
											if(d.status[4]==0)
											{
												button5.setBackground(Color.green);
												button5.setIcon(think);
											}
											else if(d.status[4]==1)
											{
												button5.setBackground(Color.orange);
												button5.setIcon(hungry);
											}
											else if(d.status[4]==2)
											{
												button5.setBackground(Color.red);
												button5.setIcon(eat);
											}
						}
			  			try{
			  			TimeUnit.SECONDS.sleep(1);}
			  			catch(InterruptedException io){
			  				System.out.println(io);
			  			}
			  			w=rand.nextInt(5);
			  			System.out.println(w);
			  			
				
				  
		  }

	}
	
}
