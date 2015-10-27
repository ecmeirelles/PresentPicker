package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
	
	private int xPosition = 50;
	
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
		
		/* Create a label (Results for) and add it into the panel */
		resultsForLabel = new JLabel("Results for");
		resultsForLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		resultsForLabel.setBounds(50, 130, 120, 30);
		pane.add(resultsForLabel);
		
		/* Create an empty label which will receive the name of the radio button selected in the form page and 
		 * add it into the panel */
		resultsInterestLabel = new JLabel("");
		resultsInterestLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		resultsInterestLabel.setBounds(140, 130, 100, 30);
		pane.add(resultsInterestLabel);
		
		/* Create an empty label which will receive the name of the gifted informed in the form page and add it into the panel */
		giftedNameLabel = new JLabel("");
		giftedNameLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		giftedNameLabel.setBounds(215, 130, 450, 30);
		pane.add(giftedNameLabel);

		/* Create 3 empty labels which will receive information of the product corresponding to the selected radio 
		 * button in the form page and add them into the panel */
		productIconLabel = new JLabel[3];
		productNameLabel = new JLabel[3];
		productPriceLabel = new JLabel[3];
		
		for (int i = 0; i < 3; i++) {
			productIconLabel[i] = new JLabel("");
			
			productIconLabel[i].addMouseListener( new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					Result.this.setVisible(false);
					new Detail().setVisible(true);
				}
			});
			
			productIconLabel[i].setBounds(xPosition, 180, 220, 250);
			productIconLabel[i].setIcon(new ImageIcon(""));
			/* Set the label centralized horizontally in the page */
			productIconLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			pane.add(productIconLabel[i]);
			
			productNameLabel[i] = new JLabel("");
			productNameLabel[i].setFont(new Font(FONT_BODY, Font.BOLD, 16));
			productNameLabel[i].setBounds(xPosition, 430, 220, 30);
			productNameLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			pane.add(productNameLabel[i]);
			
			productPriceLabel[i] = new JLabel("");
			productPriceLabel[i].setFont(new Font(FONT_BODY, Font.BOLD, 16));
			productPriceLabel[i].setBounds(xPosition, 460, 220, 30);
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
			double productPrice) {
		productIconLabel[productIndexNumber].setIcon(new ImageIcon(productImageAddress));
		productNameLabel[productIndexNumber].setText(productName);
		productPriceLabel[productIndexNumber].setText(Double.toString(productPrice) + " €");
	}
}
