package Final;





import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Graph extends JPanel {
	int[] x;
	int[] y, y1, y2;
	int[] tempX;
	int[] temp1X;
	int[] temp2X;

	public Graph(int[] x) {
		setPreferredSize(new Dimension(520, 350));
		this.x = x;

		int temp = 0;
		y = new int[x.length];
		y1 = new int[x.length];
		y2 = new int[x.length];

		for (int i = 0; i < x.length; i++) {
			temp += 300 / x.length;
			y[i] = temp;
			y1[i] = (int) (temp + .5);
			y2[i] = (int) (temp - .5);
		}

		tempX = new int[x.length];
		temp1X = new int[x.length];
		temp2X = new int[x.length];

		int size = 500;

		System.out.println();
		for (int i = 0; i < x.length; i++) {
			tempX[i] = (x[i] * size) / 200;
			temp1X[i] = (int) (tempX[i] + .5);
			temp2X[i] = (int) (tempX[i] + .5);
			//System.out.print(tempX[i] + ",");
		}
	}

	@Override
	protected void paintComponent(Graphics g2) {
		super.paintComponent(g2);
		Graphics2D g = (Graphics2D) g2;
		g.setColor(Color.GRAY);

	/*	for (int i = 0; i < this.getSize().getHeight(); i = i + 15) {
			g.drawLine(0, i, this.getSize().width, i);
		}

		for (int i = 0; i < this.getSize().width; i = i + 15) {
			g.drawLine(i, 0, i, this.getSize().height);
		}*/

		g.setColor(Color.red);
		g.drawPolyline(tempX, y, x.length);
		g.drawPolyline(temp1X, y1, x.length);
		g.drawPolyline(temp2X, y2, x.length);

		Font f = new Font("Times New Roman", Font.BOLD, 14);
		g.setFont(f);

		for (int i = 0; i < temp1X.length; i++) {
			g.setColor(Color.BLUE);
			g.fillOval(temp1X[i] - 5, y[i] - 5, 10, 10);
			g.setColor(Color.BLACK);
			g.drawString(" " + x[i], temp1X[i], y[i]);

		}
	}
	
	 public static void test(int[] input) {
	        JFrame f = new JFrame();
	       // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setTitle("Graph");
	        f.add(new Graph(input));
	        f.setSize(1024,768);
	        f.setLocation(0,0);
	        f.setVisible(true);
	    }
}
