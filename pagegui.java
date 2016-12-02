package Final;



import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
//import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
//import javax.swing.UnsupportedLookAndFeelException;
//import javax.swing.table.TableModel;



//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
//import java.awt.BorderLayout;

public class pagegui {
	private JFrame frame2 ;
    
	private static JTextField textField;
	private static JTextField textField_1;
	private static JLabel npf;
	static JTable table;
	static JScrollPane scrollPane;
		
	static JComboBox<String> Box; 
	/**
	 * Launch the application.
	 */
	public static void HAI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagegui window = new pagegui();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public pagegui(){
		initialize();
	}
	 void initialize(){
		 frame2 = new JFrame();
			JLabel background=new JLabel(new ImageIcon("C:\\Users\\Nagasai\\Desktop\\java\\bg.jpg"));
			frame2.setContentPane(background);
			//frame2.getContentPane().setBackground(Color.BLACK);
			frame2.setSize(1368,768);
			//frame2.setLocation(0,0);
			 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 Box = new JComboBox<String>();
			    
			    Box.setBounds(150, 50, 117, 28);
				
			    Box.addItem("SELECT");
				Box.addItem("FIFO");
				Box.addItem("LRU");
				Box.addItem("OPTIMAL");
				Box.addItem("SCA");
				
				frame2.getContentPane().add(Box);
				
				
				JLabel algo = new JLabel("Select an Algorithm : ");
			    algo.setForeground(Color.BLUE);
			    algo.setBounds(10, 50, 120, 28);
			    frame2.getContentPane().add(algo);
			  //  TableModel dataModel;
			    fifo f= new fifo();
		    
		    
		    JButton btnSimulate = new JButton("Simulate");
		    btnSimulate.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent arg0) {
		    		
		    		
		    		
		    		
		    		if((String)Box.getSelectedItem()=="FIFO")
					{
		    		
		    	    String Val;
		    	    fifo f= new fifo();
		    	    Val=textField_1.getText();
		    	    converttoint z = new converttoint(Val);
					int[] L= z.method1();
					int nf = Integer.parseInt(textField.getText());
					int[] out=f.FIFO(L,nf);
					int temp=f.noofpf();
					String pgf=Integer.toString(temp);
					npf.setText(pgf);
		    	    Object data[][];
		    	    Object column[];
		    	    int r=nf;
		    	    int c=L.length;
		    	    int k=0;
		    	    data = new Object[r][c];
		    	    column=new Object[c];
		    	    for(int j=0;j<c;j++)
		    	    {	String S="Add "+L[j];
		    	    	column[j]=S;
		    	            for(int i=0;i<r;i++)
		    	            {
		    	            	if(out[k]==-1){
		    	            		data[i][j]="-1";
		    	            		k++;
		    	            		}
		    	            	else{
		    	                    data[i][j]= Integer.toString(out[k]);k++;}                            
		    	            }
		    	    }  		
		    	   

		    	    table = new JTable(data, column);
		    	    table.setBackground(new java.awt.Color(0, 0, 0));
		    	    table.setFont(new java.awt.Font("Tahoma", 1, 12));
		    	    table.setForeground(new java.awt.Color(102, 255, 102));
		    	    table.setGridColor(new java.awt.Color(198, 198, 48));
		    	    table.setRowSelectionAllowed(false);
		    	    table.setSurrendersFocusOnKeystroke(true);
		    	    table.getTableHeader().setReorderingAllowed(false);
		    	    frame2.getContentPane().setLayout(null);
		    	    JScrollPane scrollPane = new JScrollPane();
		    	    scrollPane.getViewport().add(table);
		    	    scrollPane.setForeground(new java.awt.Color(102, 255, 102));
		    	    scrollPane.setBounds(454, 70, 800,500);
		    	    scrollPane.setBackground(Color.BLACK);
		    	    scrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		    	    scrollPane.setFocusable(false);
		    	    scrollPane.getViewport().setBackground(table.getBackground());
		    	    scrollPane.setViewportView(table);
		    	    frame2.getContentPane().add(scrollPane);
		    	   
		    	    

		    		
		    		
					}
		    		else if((String)Box.getSelectedItem()=="LRU"){
		    			String Val;
		    			
		        	    Val=textField_1.getText();
		        	    converttoint z = new converttoint(Val);
		    			int[] L= z.method1();
		    			lru l=new lru();
		    			int nf = Integer.parseInt(textField.getText());
		    			int[] out=l.LRU(L,nf);
		    			int temp=l.noofpf();
		    			String pgf=Integer.toString(temp);
		    			npf.setText(pgf);
		        	    Object data[][];
		        	    Object column[];
		        	    int r=nf;
		        	    int c=L.length;
		        	    int k=0;
		        	    data = new Object[r][c];
		        	    column=new Object[c];
		        	    for(int j=0;j<c;j++)
		        	    {	String S="Add "+L[j];
		        	    	column[j]=S;
		        	            for(int i=0;i<r;i++)
		        	            {
		        	            	if(out[k]==-1){
		        	            		data[i][j]="-1";
		        	            		k++;
		        	            		}
		        	            	else{
		        	                    data[i][j]= Integer.toString(out[k]);k++;}                            
		        	            }
		        	    }  		
		        	   

		        	    table = new JTable(data, column);
		        	    table.setBackground(new java.awt.Color(0, 0, 0));
		        	    table.setFont(new java.awt.Font("Tahoma", 1, 12));
		        	    table.setForeground(new java.awt.Color(102, 255, 102));
		        	    table.setGridColor(new java.awt.Color(198, 198, 48));
		        	    table.setRowSelectionAllowed(false);
		        	    table.setSurrendersFocusOnKeystroke(true);
		        	    table.getTableHeader().setReorderingAllowed(false);
		        	    frame2.getContentPane().setLayout(null);
		        	    JScrollPane scrollPane = new JScrollPane();
		        	    scrollPane.getViewport().add(table);
		        	    scrollPane.setForeground(new java.awt.Color(102, 255, 102));
		        	    scrollPane.setBounds(454, 70, 800,500);
		        	    scrollPane.setBackground(Color.BLACK);
		        	    scrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		        	    scrollPane.setFocusable(false);
		        	    scrollPane.getViewport().setBackground(table.getBackground());
		        	    scrollPane.setViewportView(table);
		        	    frame2.getContentPane().add(scrollPane);
		        	   
		    		}
		    			
		    		
		    		
		    		else if((String)Box.getSelectedItem()=="OPTIMAL"){
		    			optimal o=new optimal();
		    			String Val;
		    			
		        	    Val=textField_1.getText();
		        	    converttoint z = new converttoint(Val);
		    			int[] L= z.method1();
		    			int nf = Integer.parseInt(textField.getText());
		    			
		    			int[] out=o.out(L,nf);
		    			int temp=o.noofpf();
		    			String pgf=Integer.toString(temp);
		    			npf.setText(pgf);
		        	    Object data[][];
		        	    Object column[];
		        	    int r=nf;
		        	    int c=L.length;
		        	    int k=0;
		        	    data = new Object[r][c];
		        	    column=new Object[c];
		        	    for(int j=0;j<c;j++)
		        	    {	String S="Add "+L[j];
		        	    	column[j]=S;
		        	            for(int i=0;i<r;i++)
		        	            {
		        	            	if(out[k]==-1){
		        	            		data[i][j]="-1";
		        	            		k++;
		        	            		}
		        	            	else{
		        	                    data[i][j]= Integer.toString(out[k]);k++;}                            
		        	            }
		        	    }  		
		        	   

		        	    table = new JTable(data, column);
		        	    table.setBackground(new java.awt.Color(0, 0, 0));
		        	    table.setFont(new java.awt.Font("Tahoma", 1, 12));
		        	    table.setForeground(new java.awt.Color(102, 255, 102));
		        	    table.setGridColor(new java.awt.Color(198, 198, 48));
		        	    table.setRowSelectionAllowed(false);
		        	    table.setSurrendersFocusOnKeystroke(true);
		        	    table.getTableHeader().setReorderingAllowed(false);
		        	    frame2.getContentPane().setLayout(null);
		        	    JScrollPane scrollPane = new JScrollPane();
		        	    scrollPane.getViewport().add(table);
		        	    scrollPane.setForeground(new java.awt.Color(102, 255, 102));
		        	    scrollPane.setBounds(454, 70, 800,500);
		        	    scrollPane.setBackground(Color.BLACK);
		        	    scrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		        	    scrollPane.setFocusable(false);
		        	    scrollPane.getViewport().setBackground(table.getBackground());
		        	    scrollPane.setViewportView(table);
		        	    frame2.getContentPane().add(scrollPane);
		        	   
		    		}
		    		
		    		
		    		
		    		
		    		
		    		
		    		else if((String)Box.getSelectedItem()=="SCA"){
		    			String Val;
		    			SecondChance s=new SecondChance();
		    			
		    			
		        	    Val=textField_1.getText();
		        	    converttoint z = new converttoint(Val);
		    			int[] L= z.method1();
		    			int nf = Integer.parseInt(textField.getText());
		    			int out=s.sca(L,nf);
		    			String pgf=Integer.toString(out);
		    			npf.setText(pgf);
		        	   
		        	    int r=nf;
		        	    int c=L.length;
		        	    int k=0;
		        	    		        	    
		        	    Object data[][];
			    		data = new Object[1][1];
			    		Object column[];
			    		column = new Object[1];
				    	
				    	for(int j=0;j<1;j++)
				    	{column[j]="";
				    		for(int i=0;i<1;i++)
				    		{
				    			data[i][j]=new Object();
				    			data[i][j]="";
				    		}
				    	}
				    	table = new JTable(data, column);
		        	    table.setBackground(new java.awt.Color(0, 0, 0));
		        	    table.setFont(new java.awt.Font("Tahoma", 1, 12));
		        	    table.setForeground(new java.awt.Color(102, 255, 102));
		        	    table.setGridColor(new java.awt.Color(198, 198, 48));
		        	    table.setRowSelectionAllowed(false);
		        	    table.setSurrendersFocusOnKeystroke(true);
		        	    table.getTableHeader().setReorderingAllowed(false);
		        	    frame2.getContentPane().setLayout(null);
		        	    scrollPane = new JScrollPane();
		        	    scrollPane.getViewport().add(table);
		        	    scrollPane.setForeground(new java.awt.Color(102, 255, 102));
		        	    scrollPane.setBounds(454, 70, 800,500);
		        	    scrollPane.setBackground(Color.BLACK);
		        	    scrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		        	    scrollPane.setFocusable(false);
		        	    scrollPane.getViewport().setBackground(table.getBackground());
		        	    scrollPane.setViewportView(table);
		        	    frame2.getContentPane().add(scrollPane);
			    	  
		    		}
		    		

		    		
		    		
		    	}
		    });
		    btnSimulate.setBounds(131, 400, 89, 23);
		    frame2.getContentPane().add(btnSimulate);
		   
		    JButton btnReset = new JButton("Reset");
		    btnReset.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		String s="";
		    		textField.setText(s);
		    		textField_1.setText(s);
		    		Object data[][];
		    		data = new Object[3][1];
		    		Object column[];
		    		column = new Object[1];
			    	
			    	for(int j=0;j<1;j++)
			    	{column[j]="";
			    		for(int i=0;i<3;i++)
			    		{
			    			data[i][j]=new Object();
			    			data[i][j]="";
			    		}
			    	}
			    	table = new JTable(data, column);
	        	    table.setBackground(new java.awt.Color(0, 0, 0));
	        	    table.setFont(new java.awt.Font("Tahoma", 1, 12));
	        	    table.setForeground(new java.awt.Color(102, 255, 102));
	        	    table.setGridColor(new java.awt.Color(198, 198, 48));
	        	    table.setRowSelectionAllowed(false);
	        	    table.setSurrendersFocusOnKeystroke(true);
	        	    table.getTableHeader().setReorderingAllowed(false);
	        	    frame2.getContentPane().setLayout(null);
	        	    scrollPane = new JScrollPane();
	        	    scrollPane.getViewport().add(table);
	        	    scrollPane.setForeground(new java.awt.Color(102, 255, 102));
	        	    scrollPane.setBounds(454, 70, 800,500);
	        	    scrollPane.setBackground(Color.BLACK);
	        	    scrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
	        	    scrollPane.setFocusable(false);
	        	    scrollPane.getViewport().setBackground(table.getBackground());
	        	    scrollPane.setViewportView(table);
	        	    frame2.getContentPane().add(scrollPane);
		    		}
		    });
		    btnReset.setBounds(250, 400, 89, 23);
		    frame2.getContentPane().add(btnReset);
		     
		    
		    JButton btnHome = new JButton("Home");
			  btnHome.addMouseListener(new MouseAdapter() {
			  	@Override
			  	public void mouseClicked(MouseEvent arg0) {
			  		Home h=new Home();
			  		h.main(null);
			  		frame2.setVisible(false);
			  	}
			  });
			  btnHome.setBounds(20, 20, 89, 23);
			  frame2.getContentPane().add(btnHome);
			 
			  JLabel lblDiskSchedulingAlgorithms = new JLabel("Page Replacement Algorithms");
				lblDiskSchedulingAlgorithms.setForeground(Color.RED);
				lblDiskSchedulingAlgorithms.setBackground(Color.BLACK);
				lblDiskSchedulingAlgorithms.setFont(new Font("Times New Roman", Font.BOLD, 50));
				lblDiskSchedulingAlgorithms.setBounds(416, 11, 684, 58);
				frame2.getContentPane().add(lblDiskSchedulingAlgorithms);
			  
		    textField = new JTextField();
		    textField.setBounds(150, 150, 86, 20);
		    frame2.getContentPane().add(textField);
		    textField.setColumns(10);
		    
		    JLabel lblNoOfFrames = new JLabel("no of frames : ");
		    lblNoOfFrames.setForeground(Color.BLUE);
		    lblNoOfFrames.setBounds(65, 145, 106, 28);
		    frame2.getContentPane().add(lblNoOfFrames);
		    
		    JLabel lblPages = new JLabel(" pages : ");
		    lblPages.setForeground(Color.BLUE);
		    lblPages.setBounds(100, 195, 74, 28);
		    frame2.getContentPane().add(lblPages);
		    
		    textField_1 = new JTextField();
		    textField_1.setBounds(150, 200, 203, 20);
		    frame2.getContentPane().add(textField_1);
		    textField_1.setColumns(10);
		    
		    JLabel noofpf = new JLabel(" No of page Faults : ");
		    noofpf.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		    noofpf.setForeground(Color.BLUE);
		    noofpf.setBounds(50, 300, 300, 28);
		    frame2.getContentPane().add(noofpf);

		    npf = new JLabel("");
		    npf.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		    npf.setForeground(Color.BLUE);
		    npf.setBounds(250, 300, 300, 28);
		    frame2.getContentPane().add(npf);
		    
		    frame2.getContentPane().setBackground(Color.BLACK);
		   

		 


		 
	 }
	
}