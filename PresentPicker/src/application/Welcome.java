package application;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/* Class that represents the first window of the main program, which will start the application */
public class Welcome extends JFrame {	
	/* Welcome attributes */
	private JPanel pane;
	private JLabel welcomeLabel;
	private JLabel appImageLabel;
	private JButton startButton;
	
	/* Constants to standardize all fonts */
	public final String FONT_TITTLE = "Andalus";
	public final String FONT_BODY = "Sylfaen";
	public final String FONT_BUTTON = "Sylfaen";
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		
		Welcome frame = new Welcome();
		/* Make the window visible */
		frame.setVisible(true);
	}
	
	public Welcome() {
		
		/* Create the window - size = 1000x860 and start = (400, 100) */
		setBounds(400, 100, 1000, 860);
		setTitle("Present Picker");
		/* Disable resize */
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		/* Usage of a layout manager: BorderLayout */
		pane.setLayout(new BorderLayout(0, 0));
		
		/* Create a label (Welcome to) and add it into the panel */
		welcomeLabel = new JLabel("Welcome to Present Picker");
		/*Put the label centralized horizontally in the page */
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		/* Set font attributes to label */
		welcomeLabel.setFont(new Font(FONT_TITTLE, Font.BOLD, 40));
		welcomeLabel.setForeground(new Color(51, 153, 204));
		/* Add the label in the top of the page */
		pane.add(welcomeLabel, BorderLayout.NORTH);
		
		/* Create an image using a label and add it into the panel */
		appImageLabel = new JLabel("");
		/* Set the label centralized horizontally in the page */
		appImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		/* Demonstrate where the image is in the project */
		appImageLabel.setIcon(new ImageIcon("src\\images\\present-icon.png"));
		/* Add the image in the center of the page */
		pane.add(appImageLabel, BorderLayout.CENTER);
		
		/* Create a button (Start) and add it into the panel */
		startButton = new JButton("START");
		/* Usage of some method from Font Metrics */
		startButton.getFont();
		
		/* Add an action to the button using anonymous inner class */
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				/* Set welcome page as invisible and form page as visible */
				Welcome.this.setVisible(false);
				new Form().setVisible(true);
			}
		});
		
		/* Add the button in the bottom of the page */
		pane.add(startButton, BorderLayout.SOUTH);
	}
}
