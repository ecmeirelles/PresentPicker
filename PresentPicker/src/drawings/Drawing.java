package drawings;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Drawing {
	/* Drawing attributes, especially for the polygons */
	private int xPagesLeft[] = {700, 700,800};
	private int xPagesRight[] = {920, 920,820};
	private int yPages[] = {685, 700, 700};
	
	private int xStar[] = {850, 870, 890, 910, 930, 920, 930, 910, 890, 870, 850, 860, 850};
	private int yStar[] = {600, 600, 580, 600, 600, 620, 640, 640, 660, 640, 640, 620, 600};
	
	private int xDress[] = {840, 860, 820};
	private int yDress[] = {765, 800, 800};

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
		g2.fillOval(855, 705, 45, 40);
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
	
	/* Function to draw an icon to Religion's interest */
	public void drawReligion(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		/* Drawing the cross */
		g2.fillRect(830, 680, 30, 120);
		g2.fillRect(800, 710, 90, 30);
		/* Drawing the moon */
		g2.setColor(Color.ORANGE);
		g2.fillOval(800, 600, 100, 100);
		g2.setColor(new Color(241,241,241));
		g2.fillOval(820, 580, 100, 100);
		/* Drawing the star */
		g2.setColor(Color.ORANGE);
		g2.fillPolygon(xStar, yStar, 13);
	}
	
	/* Function to draw an icon to kid's interest */
	public void drawKids(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		/* ----- Drawing the girl ----- */
		/* Drawing the head */
		g2.drawOval(820, 705, 40, 40);
		/* Drawing the body */
		g2.drawLine(840, 745, 840, 800);
		/* Drawing the legs */
		g2.drawLine(840, 800, 825, 815);
		g2.drawLine(840, 800, 855, 815);
		/* Drawing the arms */
		g2.drawLine(840, 760, 825, 775);
		g2.drawLine(840, 760, 865, 775);
		/* Drawing the dress */
		g2.setColor(Color.PINK);
		g2.fillPolygon(xDress, yDress, 3);
		
		/* ----- Drawing the boy ----- */
		/* Drawing the head */
		g2.setColor(Color.BLACK);
		g2.drawOval(870, 705, 40, 40);
		/* Drawing the body */
		g2.drawLine(890, 745, 890, 800);
		/* Drawing the legs */
		g2.drawLine(890, 800, 875, 815);
		g2.drawLine(890, 800, 905, 815);
		/* Drawing the arms */
		g2.drawLine(890, 760, 865, 775);
		g2.drawLine(890, 760, 905, 775);
		
	}
	
	/* Function to draw an icon to outdoor's interest */
	public void drawOutdoor(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		/* Drawing the barbecue */
		g2.setColor(Color.RED);
		g2.fillRect(820, 700, 100, 10);
		g2.setColor(Color.DARK_GRAY);
		g2.fillArc(820, 675, 100, 70, 180, 180);
		g2.fillRect(845, 740, 10, 50);
		g2.fillRect(885, 740, 10, 50);
		g2.fillRect(840, 770, 60, 10);
	}
	
	/* Function to draw an icon to outdoor's interest */
	public void drawGame(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		/* Drawing the TV */
		g2.drawRect(820, 700, 120, 70);
		g2.drawRect(830, 710, 100, 50);
		/* Drawing the console */
		g2.fillRect(810, 750, 50, 20);
		/* Set XOR Mode to the buttons of the console */
		g2.setXORMode(Color.GRAY);
		g2.fillOval(820, 755, 10, 10);
		g2.fillOval(840, 755, 10, 10);
		/* Set back to the paint mode */
		g2.setPaintMode();
		g2.fillArc(810, 763, 20, 15, 180, 180);
		g2.fillArc(840, 763, 20, 15, 180, 180);
	}
}
