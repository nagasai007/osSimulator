package Final;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;

public class Home {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1368,768);
		frame.setTitle("Os simulator");
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\Nagasai\\Desktop\\java\\macOS.jpg"));
		
		frame.setContentPane(background);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
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
		ImageIcon disk = new ImageIcon("C:\\Users\\Nagasai\\Desktop\\java\\disk.jpg");
		ImageIcon page=new ImageIcon("C:\\Users\\Nagasai\\Desktop\\java\\page.png");
		ImageIcon process=new ImageIcon("C:\\Users\\Nagasai\\Desktop\\java\\process.jpg");
		ImageIcon dining=new ImageIcon("C:\\Users\\Nagasai\\Desktop\\java\\dining.jpg");
		JButton disk1 = new JButton("");
		disk1.setIcon(disk);
		disk1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					
					diskgui.HAI();
					frame.setVisible(false);
			}
		
		});
		disk1.setBounds(350, 400, 300, 200);
	    frame.getContentPane().add(disk1);

	    
	    
	    JButton page1 = new JButton("");
		page1.setIcon(page);
		page1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				pagegui.HAI();
				frame.setVisible(false);
			}
		
		});
		page1.setBounds(350, 100, 300, 200);
	    frame.getContentPane().add(page1);

	    
	    
	    
	           
	    JButton process1 = new JButton("");
		process1.setIcon(process);
		process1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		
				processscheduling p=new processscheduling();
				p.HAI();
				//frame.setVisible(false);
			}
		
		});
		process1.setBounds(750, 100, 300, 200);
	    frame.getContentPane().add(process1);
	    
	    
	    
	    
	    
	    JButton dining1 = new JButton("");
	    dining1.setIcon(dining);
	    dining1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
					dininggui d=new dininggui();
			d.HAI();
			frame.setVisible(false);
				
			}
		
		});
	    dining1.setBounds(750, 400, 300, 200);
	    frame.getContentPane().add(dining1);
	    
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
		 javax.swing.JOptionPane.showMessageDialog(null,"   Developer : Group7 \n" +"   Subject : Operating Systems\n" +"   Contact : Group7@iiits.in","About Developer",javax.swing.JOptionPane.PLAIN_MESSAGE); 
			    }
}