package drawings;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Drawing {
	/* Drawing attributes, especially for the polygons */
	private int xPagesLeft[] = {700, 700,800};
	private int xPagesRight[] = {920, 920,820};
	private int yPages[] = {685, 700, 700};

	/* Function to draw an icon to Book's interest */
	public void drawBook(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		/* Drawing the book */
		g2.drawRect(700, 700, 220, 100);
		g2.drawRect(800, 700, 20, 100);
		/* Drawing the head */
		g2.drawArc(730, 653, 150, 80, 0, 180);
		/* Drawing the eyes */
		g2.fillOval(780, 670, 10, 15);
		g2.fillOval(825, 670, 10, 15);
		/* Drawing the pages */
		g2.drawPolygon(new Polygon(xPagesLeft, yPages, 3));
		g2.drawLine(700, 692, 800, 700);
		g2.drawPolygon(new Polygon(xPagesRight, yPages, 3));
		g2.drawLine(920, 692, 820, 700);		
		/* Drawing content of the book */
		g2.drawString("BOOK", 850, 750);
		g2.fillRect(720, 720, 60, 30);
		g2.drawLine(720, 760, 780, 760);
		g2.drawLine(720, 770, 780, 770);
		g2.drawLine(720, 780, 780, 780);
	}
	
	/* Function to draw an icon to Sport's interest */
	public void drawSport(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		/* Drawing the head */
		g2.drawOval(855, 705, 45, 40);
		/* Drawing the body */
		g2.drawLine(875, 745, 875, 800);
		/* Drawing the legs */
		g2.drawLine(875, 800, 860, 815);
		g2.drawLine(860, 815, 840, 800);
		g2.drawLine(875, 800, 900, 815);
		g2.drawLine(900, 815, 900, 830);
		/* Drawing the arms */
		g2.drawLine(875, 760, 860, 775);
		g2.drawLine(860, 775, 860, 790);
		g2.drawLine(875, 760, 900, 775);
		g2.drawLine(900, 775, 915, 760);
	}
}
