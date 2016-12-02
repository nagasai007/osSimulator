package Final;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;



public class diskgui {

	private JFrame frame3;
	private JComboBox<String> Box;
	private JTextField head;
	private JTextField input;
	private JTextField headm;
	
	
	
	
	private JTextField output;
	/**
	 * Launch the application.
	 */
	public static void HAI() {
		EventQueue.invokeLater(new Runnable() {
			
			
			public void run() {
				try {
					diskgui window = new diskgui();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public diskgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame3.
	 */
	void initialize() {
		frame3 = new JFrame();
		//frame3.setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\Nagasai\\Desktop\\java\\bg.jpg"));
		//background.setBounds(0, 0, 1368, 768);
		frame3.setContentPane(background);
		//
		//frame3.setLayout(new FlowLayout());

		frame3.getContentPane().setBackground(Color.BLACK);
		frame3.setBounds(100, 100, 450, 300);
		frame3.setSize(1368,768);
		frame3.setLocation(0,0);
		
		ImageIcon simulate = new ImageIcon("C:\\Users\\Nagasai\\Desktop\\java\\button-off-1.png");
		ImageIcon simulate1 = new ImageIcon("C:\\Users\\Nagasai\\Desktop\\java\\button-on-1.png");
		//frame3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//frame3.addWindowListener(new ExitListener());
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		Box = new JComboBox<String>();
		frame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                try {
					formWindowClosing(evt);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

		
	/*	addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowClosing(evt);
            }
        });*/

		
	
		
		JButton b = new JButton("");
		b.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		
				 b.setIcon(simulate1);
				if((String)Box.getSelectedItem()=="FCFS")
				{   		System.out.println("hai how are you");
						      String Val,S="",v="";
								Val = input.getText();
								converttoint z = new converttoint(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 FCFS a1= new FCFS(h,L);
								 int[] r = a1.method();
								 int y = a1.method3();
								  v= v+""+y;
								 Graph.test(r);
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  output.setText(S);
							  headm.setText(v);
							  S="";
							  v="";
								//output.setText(""+r.length);
								 
							
						
				}

				else if((String)Box.getSelectedItem()=="SSTF")
				{   		
						
								//System.out.println("sTSAUD");
							      String Val,S="",v="";
								Val = input.getText();
								converttoint z = new converttoint(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 SSTF a1= new SSTF(h,L);
								 int[] r = a1.method();
								 int y= a1.method3();
								//a1.Get(L,L.length);
								 v=v+""+y;
								 Graph.test(r);
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  output.setText(S);
							  headm.setText(v);
								//output.setText(""+r.length);
							  S="";
							  v=""; 
						
				}
				else if((String)Box.getSelectedItem()=="SCAN")
				{   		
						
								//System.out.println("sTSAUD");
							      String Val,S="",v="";
								Val = input.getText();
								converttoint z = new converttoint(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 Scan a1= new Scan(h,L);
								 int[] r = a1.method();
								 int y= a1.method3();
								 v=v+""+y;
								Graph.test(r);
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  output.setText(S);
							  headm.setText(v);
								//output.setText(""+r.length);
							  S="";
							  v="";
						
				}
				else if((String)Box.getSelectedItem()=="CSCAN")
				{   	
								//System.out.println("sTSAUD");
							      String Val,S="",v="";
								Val = input.getText();
								converttoint z = new converttoint(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 Cscan a1= new Cscan(h,L);
								 int[] r = a1.method();
								 int y =a1.method3();
								 v=v+""+y;
								Graph.test(r);
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  output.setText(S);
							  headm.setText(v);
								//output.setText(""+r.length);
							  S="";
							  v="";
						
				}
				else if((String)Box.getSelectedItem()=="CLOOK")
				{   		
						
								//System.out.println("sTSAUD");
							      String Val,S="",v="";
								Val = input.getText();
								converttoint z = new converttoint(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 Clook a1= new Clook(h,L);
								 int[] r = a1.method();
								 int y= a1.method3();
								 v=v+""+y;
								Graph.test(r);
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	//System.out.println(r[i]);
							    	}
							  output.setText(S);
							  headm.setText(v);
								//output.setText(""+r.length);
							  S="";
							  v="";
						
				}
				else if((String)Box.getSelectedItem()=="SELECT"){
					String infoMessage="Please select the process";
					JOptionPane.showMessageDialog(null, infoMessage, "Warning : " + "Input Error", JOptionPane.INFORMATION_MESSAGE);
					b.setIcon(simulate);
				}
				
	}
	});
		b.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		b.setBounds(400, 527, 170, 70);
		b.setIcon(simulate);
		b.setBackground(new Color(59, 89, 182));
        b.setForeground(Color.WHITE);
		frame3.getContentPane().add(b);
		JButton btnHome = new JButton("Home");
		  btnHome.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseClicked(MouseEvent arg0) {
		  		Home h=new Home();
		  		h.main(null);
		  		frame3.setVisible(false);
		  	}
		  });
		  btnHome.setBounds(20, 20, 89, 23);
		  frame3.getContentPane().add(btnHome);
		
		Box.setBounds(165, 100, 117, 28);
		frame3.getContentPane().add(Box);
		Box.addItem("SELECT");
		Box.addItem("FCFS");
		Box.addItem("SSTF");
		Box.addItem("SCAN");
		Box.addItem("CSCAN");
		Box.addItem("CLOOK");
		JLabel lblDiskSchedulingAlgorithms = new JLabel("Disk Scheduling Algorithms");
		lblDiskSchedulingAlgorithms.setForeground(Color.RED);
		lblDiskSchedulingAlgorithms.setBackground(Color.BLACK);
		lblDiskSchedulingAlgorithms.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblDiskSchedulingAlgorithms.setBounds(416, 11, 684, 58);
		frame3.getContentPane().add(lblDiskSchedulingAlgorithms);
		
		JLabel lblSelectAlgorithm = new JLabel("Select Algorithm : ");
		lblSelectAlgorithm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSelectAlgorithm.setForeground(Color.BLUE);
		lblSelectAlgorithm.setBounds(10, 91, 158, 41);
		frame3.getContentPane().add(lblSelectAlgorithm);
		
		head = new JTextField();
		head.setBounds(483, 190, 122, 28);
		frame3.getContentPane().add(head);
		head.setColumns(10);
		
		JLabel lblHead = new JLabel("Head : ");
		lblHead.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblHead.setForeground(Color.BLUE);
		lblHead.setBounds(390, 190, 66, 23);
		frame3.getContentPane().add(lblHead);
		
		
		JLabel sim = new JLabel("Simulate");
		sim.setFont(new Font("Times New Roman", Font.PLAIN, 30));
	sim.setForeground(Color.BLUE);
		sim.setBounds(420,610, 200,50);
		frame3.getContentPane().add(sim);
		
		input = new JTextField();
		input.setBounds(483, 274, 237, 36);
		frame3.getContentPane().add(input);
		input.setColumns(10);
		
		JLabel lblInput = new JLabel("Input : ");
		lblInput.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblInput.setForeground(Color.BLUE);
		lblInput.setBounds(393, 278, 80, 23);
		frame3.getContentPane().add(lblInput);
		
		headm = new JTextField();
		headm.setBounds(483, 351, 122, 28);
		frame3.getContentPane().add(headm);
		headm.setColumns(10);
		
		JLabel lblHeadMovement = new JLabel("Head Movement : ");
		lblHeadMovement.setForeground(Color.BLUE);
		lblHeadMovement.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblHeadMovement.setBounds(311, 348, 158, 28);
		frame3.getContentPane().add(lblHeadMovement);
		
		output= new JTextField();
		output.setBounds(482, 415, 238, 31);
		frame3.getContentPane().add(output);
		output.setColumns(10);
		
		JLabel lblOutput = new JLabel("Output : ");
		lblOutput.setForeground(Color.BLUE);
		lblOutput.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblOutput.setBounds(390, 415, 122, 28);
		frame3.getContentPane().add(lblOutput);
		
		
			
		
		
	}


	 private void formWindowClosing(java.awt.event.WindowEvent evt) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		 UIManager.put("OptionPane.background", Color.black);
		 UIManager.put("Button.background", Color.blue);
		 UIManager.put("Button.text", Color.blue);
		 UIManager.put("Panel.background", Color.black);
		 UIManager.put("OptionPane.foreground", Color.white);
		 UIManager.put("OptionPane.messagebackground", Color.white);
		 UIManager.put("OptionPane.textbackground", Color.BLUE);
		 UIManager.put("OptionPane.warningDialog.titlePane.shadow", Color.white);
		 UIManager.put("OptionPane.warningDialog.border.background", Color.white);
		 UIManager.put("OptionPane.warningDialog.titlePane.background", Color.white);
		 UIManager.put("OptionPane.warningDialog.titlePane.foreground", Color.white);
		 UIManager.put("OptionPane.questionDialog.border.background", Color.white);
		 UIManager.put("OptionPane.questionDialog.titlePane.background", Color.white);
		 UIManager.put("OptionPane.questionDialog.titlePane.foreground", Color.white);
		 UIManager.put("OptionPane.questionDialog.titlePane.shadow", Color.white);
		 UIManager.put("OptionPane.messageForeground", Color.white);
		 UIManager.put("OptionPane.foreground", Color.white);
		 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		 UIManager.put("OptionPane.errorDialog.border.background", Color.white);
		 UIManager.put("OptionPane.errorDialog.titlePane.background", Color.white);
		 UIManager.put("OptionPane.errorDialog.titlePane.foreground", Color.white);
		 UIManager.put("OptionPane.errorDialog.titlePane.shadow", Color.white);
		 javax.swing.JOptionPane.showMessageDialog(null,"   Developer : Nagasai \n" +"   Subject : Operating Systems\n" +"   Contact : nagasaigoud.p15@iiits.in","About Developer",javax.swing.JOptionPane.PLAIN_MESSAGE); 
			    }
}
