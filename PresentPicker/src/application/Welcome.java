package application;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome extends JFrame {
	/* Welcome attributes */
	private JLabel welcomeLabel;
	private JLabel appNameLabel;
	private JLabel appImageLabel;
	private JButton startButton;
	
	public static void main(String[] args) {
		/* Create the window - size = 1000x860 and start = (400, 100) */
		Welcome frame = new Welcome();
		frame.setBounds(400, 100, 1000, 860);
		frame.setTitle("Present Picker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* Make the window visible */
		frame.setVisible(true);
	}
	
	public Welcome() {
		Container pane = getContentPane();
		/* Set layout as null means set it as AbsolutLayout */
		pane.setLayout(null);
		
		/* Create a label (Welcome to) and add it into the panel */
		welcomeLabel = new JLabel("WELCOME TO");
		/* Set font attributes to label */
		welcomeLabel.setFont(new Font("Andalus", Font.BOLD, 20));
		/* Usage of AbsolutLayout means that you need to specify where the component is */
		welcomeLabel.setBounds(690, 280, 150, 30);
		pane.add(welcomeLabel);
		
		/* Create a label (Present Picker) and add it into the panel */
		appNameLabel = new JLabel("PRESENT PICKER");
		appNameLabel.setFont(new Font("Andalus", Font.BOLD, 40));
		appNameLabel.setForeground(new Color(0, 102, 255));
		appNameLabel.setBounds(600, 320, 320, 30);
		pane.add(appNameLabel);
		
		/* Create an image using a label and add it into the panel */
		appImageLabel = new JLabel("");
		appImageLabel.setBounds(50, 170, 512, 512);
		/* Demonstrate where the image is in the project */
		appImageLabel.setIcon(new ImageIcon("src\\present-icon.png"));
		pane.add(appImageLabel);
		
		/* Create a button (Start) and add it into the panel */
		startButton = new JButton("START");
		startButton.setFont(new Font("Andalus", Font.PLAIN, 16));
		startButton.setBounds(690, 500, 120, 40);
		
		/* Add an action to the button using anonymous inner class */
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Welcome.this.setVisible(false);
				new Form().setVisible(true);
			}
		});
		pane.add(startButton);
	}
}
