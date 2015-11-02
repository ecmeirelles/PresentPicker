package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import drawings.Drawing;

public class Result extends JFrame {
	private static final long serialVersionUID = 1L;
	/* Constants to standardize all fonts */
	public final String FONT_TITTLE = "Andalus";
	public final String FONT_BODY = "Sylfaen";
	public final String FONT_BUTTON = "Sylfaen";
	
	/* Form attributes */
	private JPanel pane;
	private JLabel resultsForLabel;
	private JLabel appIconLabel;
	private JLabel appNameLabel;
	private JLabel resultsInterestLabel;
	private JLabel productIconLabel[];
	private JLabel productNameLabel[];
	private JLabel productPriceLabel[];
	private JLabel giftedNameLabel;
	private JLabel backLabel;
	
	private int xPosition = 50;
	private ArrayList<String> urlPage = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		Result frame = new Result();
		/* Make the window visible */
		frame.setVisible(true);
	}
	
	public Result() {
		
		/* Create the window - size = 1000x860 and start = (400, 100) */
		setBounds(400, 100, 1000, 860);
		setTitle("Present Picker");
		/* Disable resize */
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		/* Set layout as null means set it as AbsolutLayout */
		pane.setLayout(null);
		
		/* Create an image using a label and add it into the panel */
		appIconLabel = new JLabel("");
		/* When use AbsolutLayout it is needed to inform the exactly position of the component */
		appIconLabel.setBounds(20, 20, 64, 64);
		/* Demonstrate where the image is in the project */
		appIconLabel.setIcon(new ImageIcon("src\\images\\gift-icon.png"));
		pane.add(appIconLabel);
		
		/* Create a label (Present Picker) and add it into the panel */
		appNameLabel = new JLabel("Present Picker");
		/* Set font attributes to label */
		appNameLabel.setFont(new Font(FONT_TITTLE, Font.BOLD, 24));
		appNameLabel.setForeground(new Color(7, 168, 88));
		appNameLabel.setBounds(100, 40, 250, 30);
		pane.add(appNameLabel);
		
		/* Create a label which will allow the user to go back to the previous page */
		backLabel = new JLabel("Previous Page");
		/* When the user clicks in the label the current page becomes invisible and the previous one (Welcome)
		 * becomes visible */
		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Result.this.setVisible(false);
				new Form().setVisible(true);
			}
		});
		
		backLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		backLabel.setIcon(new ImageIcon("src\\images\\back.png"));
		backLabel.setBounds(30, 100, 200, 30);
		pane.add(backLabel);
		
		/* Create a label (Results for) and add it into the panel */
		resultsForLabel = new JLabel("Results for");
		resultsForLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		resultsForLabel.setBounds(50, 170, 120, 30);
		pane.add(resultsForLabel);
		
		/* Create an empty label which will receive the name of the radio button selected in the form page and 
		 * add it into the panel */
		resultsInterestLabel = new JLabel("");
		resultsInterestLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		resultsInterestLabel.setBounds(140, 170, 100, 30);
		pane.add(resultsInterestLabel);
		
		/* Create an empty label which will receive the name of the gifted informed in the form page and add it into the panel */
		giftedNameLabel = new JLabel("");
		giftedNameLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		giftedNameLabel.setBounds(215, 170, 450, 30);
		pane.add(giftedNameLabel);

		/* Create 3 empty labels which will receive information of the product corresponding to the selected radio 
		 * button in the form page and add them into the panel */
		productIconLabel = new JLabel[3];
		productNameLabel = new JLabel[3];
		productPriceLabel = new JLabel[3];
		
		/* Create a loop starting with 0 and ending with 3 to add all the components into the panel */
		for (int i = 0; i < 3 ; i++) {
			final int fi = i;
			productIconLabel[i] = new JLabel("");
			
			/* When the person pressed the image, then he/she will be redirect to the store page */
			productIconLabel[i].addMouseListener( new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					try {
						/* Open a little window showing what will happen */
						JOptionPane.showMessageDialog(null, "You'll be redirect to the store page...");
						/* Responsible for opening the specific URL in the person's default browser */
						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + urlPage.get(fi));
						/* Close the JFrame */
						Result.this.dispatchEvent(new WindowEvent(Result.this, WindowEvent.WINDOW_CLOSING));
					} catch (IOException e) {
						System.out.println("Sorry, the page cannot be opened.");
					}  
				}
			});
			
			productIconLabel[i].setBounds(xPosition, 220, 220, 250);
			productIconLabel[i].setIcon(new ImageIcon(""));
			/* Set the label centralized horizontally in the page */
			productIconLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			pane.add(productIconLabel[i]);
			
			productNameLabel[i] = new JLabel("");
			productNameLabel[i].setFont(new Font(FONT_BODY, Font.BOLD, 16));
			productNameLabel[i].setBounds(xPosition, 470, 220, 30);
			productNameLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			pane.add(productNameLabel[i]);
			
			productPriceLabel[i] = new JLabel("");
			productPriceLabel[i].setFont(new Font(FONT_BODY, Font.BOLD, 16));
			productPriceLabel[i].setBounds(xPosition, 500, 220, 30);
			productPriceLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			pane.add(productPriceLabel[i]);
			
			xPosition = xPosition + 300;
		}
	}
	/* Function to receive the name of the gifted */
	public void giftedNameReceived (String firstName, String lastName) {
		giftedNameLabel.setText("to " + firstName + " " + lastName);
	}
	
	/* Function to receive the name of the radio button which was selected */
	public void radioButtonReceived (String nameRadioButton) {
		resultsInterestLabel.setText(nameRadioButton);
	}
	
	/* Function to receive part of information sent from the form page */
	public void radioButtonResult(int productIndexNumber, String productImageAddress, String productName, 
			double productPrice, String url) {
		productIconLabel[productIndexNumber].setIcon(new ImageIcon(productImageAddress));
		productNameLabel[productIndexNumber].setText(productName);
		productPriceLabel[productIndexNumber].setText(Double.toString(productPrice) + " €");
		urlPage.add(productIndexNumber, url);
	}
	
	/* Function to add the drawings into the panel */
	Drawing drawing = new Drawing();
	public void paint(Graphics g) {
		super.paint(g);
		
		switch(resultsInterestLabel.getText()) {
			case "Books":
				drawing.drawBook(g);
				break;
			case "Sports":
				drawing.drawSport(g);
				break;
			case "Religion":
				drawing.drawReligion(g);
				break;
			case "Kids":
				drawing.drawKids(g);
				break;
			case "Outdoor":
				drawing.drawOutdoor(g);
				break;
			case "Games":
				drawing.drawGame(g);
				break;
		}
	}
}
