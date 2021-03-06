package Final;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class roundRobin {
	JFrame f;
	roundRobin(program[] p , int counter){
		if(counter==0)
		{
			f=new JFrame();  
		    f.setTitle("Round Robin Inputs");
		    String[][] data=new String[100][];
		    for(int i=0;i<100;i++){
		    	data[i]=new String[4];
		    }
		    String column[]={"P.ID","Arrival Time","Burst Time","Priority"};  
		    for(int i=0;i<10;i++){
		    	data[i][0]=Integer.toString(p[i].pid);
		    	data[i][1]=Integer.toString(p[i].arrivalTime);
		    	data[i][2]=Integer.toString(p[i].burstTime);
		    }
		    
		      
		    JTable table=new JTable(data,column);  
		    table.setBounds(30,40,200,300);  
		    table.setBounds(30,40,200,300);  
		    table.setBounds(30,40,200,300);  
		    table.setBounds(30,40,200,300);  
		    table.setBounds(30,40,200,300);  
		    table.setBackground(new java.awt.Color(0, 0, 0));
    	    table.setFont(new java.awt.Font("Tahoma", 1, 12));
    	    table.setForeground(new java.awt.Color(102, 255, 102));
    	    table.setGridColor(new java.awt.Color(198, 198, 48));
    	    table.setRowSelectionAllowed(false);
    	    table.setSurrendersFocusOnKeystroke(true);
    	    table.getTableHeader().setReorderingAllowed(false); 
		      
		    JScrollPane sp=new JScrollPane(table);  
		    f.add(sp);  
		    f.setSize(300,400);  
		//  f.setLayout(null);  
		    f.setVisible(true);  
			
		}
		else{
			
			f=new JFrame();  
			if(counter==1)
			{
				f.setTitle("Preemptive ");
			}
			else if(counter==2)
			{
				f.setTitle("Round Robin");
			}
			else if(counter==3)
			{
				f.setTitle("Non Preemptive ");
			}
			
			else if(counter==4)
			{
				f.setTitle("First Come First Serve");
			}
			else if(counter==5)
			{
				f.setTitle("Non Preemptive Priority");
			}
			else
			{
				f.setTitle("Preemtive Priority");
			}  
		    String[][] data=new String[100][];
		    for(int i=0;i<100;i++){
		    	data[i]=new String[2];
		    }
		    String column[]={"P.ID","Waiting Time"};  
		    for(int i=0;i<10;i++){
		    	data[i][0]=Integer.toString(p[i].pid);
		    	data[i][1]=Integer.toString(p[i].waitingTime);
		    }
		    
		      
		    JTable table=new JTable(data,column);  
		    table.setBounds(30,40,200,300);  
		    table.setBounds(30,40,200,300);  
		    table.setBounds(30,40,200,300);  
		    table.setBounds(30,40,200,300);  
		    table.setBounds(30,40,200,300);  
		    table.setBackground(new java.awt.Color(0, 0, 0));
    	    table.setFont(new java.awt.Font("Tahoma", 1, 12));
    	    table.setForeground(new java.awt.Color(102, 255, 102));
    	    table.setGridColor(new java.awt.Color(198, 198, 48));
    	    table.setRowSelectionAllowed(false);
    	    table.setSurrendersFocusOnKeystroke(true);
    	    table.getTableHeader().setReorderingAllowed(false); 
		    
		    JScrollPane sp=new JScrollPane(table);  
		    f.add(sp);  
		      
		    f.setSize(300,400);  
		//  f.setLayout(null);  
		    f.setVisible(true);  
	
		}

	}
	static class program{
		public int burstTime;
		public int pid;
		public boolean executing;
		public boolean robin;
		public boolean executed;
		public int arrivalTime;
		int waitingTime;
		public int setBurstTime(){
			burstTime=(int)(Math.random()*10+1);
			return burstTime;
		}
		public int setArrivalTime(int x){
			arrivalTime=(int)(x+1+Math.random()*10);
			//Crespoters code
			return arrivalTime;
		}
		public void print(){
			System.out.println(pid+"\t"+arrivalTime+"\t\t"+burstTime);
		}
		program(int x){
			robin=false;
			waitingTime=0;
			executing=false;
			executed=false;
			pid=x;
		}
	}
static void updateWaitingTime(program[] programs,int endTime){
		
		for(int i=0;i<10;i++)
		{
			//Crespoters code
			if(programs[i].arrivalTime>endTime){
				break;
			}
			if(!(programs[i].executed||programs[i].executing))
			{

				programs[i].waitingTime++;
			}
		}
		
	}
	static boolean allFinished(program[] programs){
		for(int i=0;i<10;i++){
			if(programs[i].executed==false){
				return false;
				//Crespoters code
			}
		}
		return true;
	}
	public static void main(String args[]){
		Queue robins=new LinkedList();
		int t=0;
		int quantumTime=2;//Change this to change the quantum time
		program[] programs=new program[10];
		for(int i=0;i<10;i++){
			programs[i]=new program(i);
		}
		System.out.println("Generating 10 programs with Quantum time of 2 seconds\n");
		System.out.println("P.id\tArrivalTime\tBurstTime");
		for(int i=0;i<10;i++)
		{
			programs[i].setBurstTime();
			//Crespoters code
			t=programs[i].setArrivalTime(t);
			programs[i].print();
		}
		new roundRobin(programs,0);
		System.out.println("Time\tExecutingPid");
		int executing=0;
		for(int time=0;!allFinished(programs);)
		{
			for(int i=0;i<10;i++){
				if(programs[i].arrivalTime<=time && !programs[i].robin){
					robins.add(i);
					programs[i].robin=true;
				}
			}
			if(robins.isEmpty()){
				System.out.println(time+"\t\t"+"-");
				time++;
				continue;
			}
			executing=(int)robins.element();
			robins.remove();
			for(int i=0;i<quantumTime;i++){
				if(programs[executing].burstTime!=0)
				{
					System.out.println(time+"\t\t"+executing);
					programs[executing].burstTime--;
					
				}
				else
				{
					System.out.println(time+"\t\t"+"blank");
				}
				updateWaitingTime(programs,time);
				time++;
			}
			if(programs[executing].burstTime==0){
				programs[executing].executed=true;
			}
			else
			{
				robins.add(executing);
			}
				
		}
		System.out.println("P.Id\tWaitingTime");
		for(int i=0;i<10;i++){
			System.out.println(i+"\t\t"+programs[i].waitingTime);
		}
		new roundRobin(programs,2);
	}
}

