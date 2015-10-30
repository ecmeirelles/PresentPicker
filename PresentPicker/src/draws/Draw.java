package draws;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Draw {

	public void drawBook(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawRect(700, 700, 220, 100);
		g2.drawRect(800, 700, 20, 100);
		
		g2.drawArc(730, 653, 150, 80, 0, 180);
		
		g2.fillOval(780, 670, 10, 15);
		g2.fillOval(825, 670, 10, 15);
		
		g2.drawLine(700, 685, 700, 700);
		g2.drawLine(700, 685, 800, 700);
		g2.drawLine(700, 692, 800, 700);
		
		g2.drawLine(920, 685, 920, 700);
		g2.drawLine(920, 685, 820, 700);
		g2.drawLine(920, 692, 820, 700);		
		
		g2.drawString("BOOK", 850, 750);
		g2.fillRect(720, 720, 60, 30);
		g2.drawLine(720, 760, 780, 760);
		g2.drawLine(720, 770, 780, 770);
		g2.drawLine(720, 780, 780, 780);
	}
}
