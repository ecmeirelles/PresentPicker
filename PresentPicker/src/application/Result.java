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
	private JLabel productIconLabel1;
	private JLabel productNameLabel1;
	private JLabel productPriceLabel1;
	private JLabel productIconLabel2;
	private JLabel productNameLabel2;
	private JLabel productPriceLabel2;
	private JLabel productIconLabel3;
	private JLabel productNameLabel3;
	private JLabel productPriceLabel3;
	
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
		resultsInterestLabel.setBounds(140, 130, 450, 30);
		pane.add(resultsInterestLabel);

		/* Create an empty icon label which will receive the image of the first product corresponding to the selected radio 
		 * button in the form page and add it into the panel */
		productIconLabel1 = new JLabel("");
		productIconLabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Result.this.setVisible(false);
				new Detail().setVisible(true);
			}
		});
		productIconLabel1.setBounds(50, 180, 220, 250);
		productIconLabel1.setIcon(new ImageIcon(""));
		/* Set the label centralized horizontally in the page */
		productIconLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productIconLabel1);
		
		/* Create an empty label which will receive the name of the first product corresponding to the selected radio 
		 * button in the form page and add it into the panel */
		productNameLabel1 = new JLabel("");
		productNameLabel1.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productNameLabel1.setBounds(50, 430, 220, 30);
		productNameLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productNameLabel1);
		
		/* Create an empty label which will receive the price of the first product corresponding to the selected radio 
		 * button in the form page and add it into the panel */
		productPriceLabel1 = new JLabel("");
		productPriceLabel1.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productPriceLabel1.setBounds(50, 460, 220, 30);
		productPriceLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productPriceLabel1);
		
		/* Create an empty icon label which will receive the image of the second product corresponding to the selected radio 
		 * button in the form page and add it into the panel */
		productIconLabel2 = new JLabel("");
		productIconLabel2.setBounds(350, 180, 220, 250);
		productIconLabel2.setIcon(new ImageIcon(""));
		productIconLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productIconLabel2);
		
		/* Create an empty label which will receive the name of the second product corresponding to the selected radio 
		 * button in the form page and add it into the panel */
		productNameLabel2 = new JLabel("");
		productNameLabel2.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productNameLabel2.setBounds(350, 430, 220, 30);
		productNameLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productNameLabel2);
		
		/* Create an empty label which will receive the price of the second product corresponding to the selected radio 
		 * button in the form page and add it into the panel */
		productPriceLabel2 = new JLabel("");
		productPriceLabel2.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productPriceLabel2.setBounds(350, 460, 220, 30);
		productPriceLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productPriceLabel2);
		
		/* Create an empty icon label which will receive the image of the third product corresponding to the selected radio 
		 * button in the form page and add it into the panel */
		productIconLabel3 = new JLabel("");
		productIconLabel3.setBounds(650, 180, 220, 250);
		productIconLabel3.setIcon(new ImageIcon(""));
		productIconLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productIconLabel3);
		
		/* Create an empty label which will receive the name of the third product corresponding to the selected radio 
		 * button in the form page and add it into the panel */
		productNameLabel3 = new JLabel("");
		productNameLabel3.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productNameLabel3.setBounds(650, 430, 220, 30);
		productNameLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productNameLabel3);
		
		/* Create an empty label which will receive the price of the third product corresponding to the selected radio 
		 * button in the form page and add it into the panel */
		productPriceLabel3 = new JLabel("");
		productPriceLabel3.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productPriceLabel3.setBounds(650, 460, 220, 30);
		productPriceLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productPriceLabel3);
	}
	
	/* Functions to receive part of information sent from the form page */
	public void radioButtonResult1(String nameRadioButton, String productImageAddress, String productName, 
			double productPrice) {
		resultsInterestLabel.setText(nameRadioButton);
		productIconLabel1.setIcon(new ImageIcon(productImageAddress));
		productNameLabel1.setText(productName);
		productPriceLabel1.setText(Double.toString(productPrice) + " €");
	}
	
	public void radioButtonResult2(String productImageAddress, String productName, 
			double productPrice) {
		productIconLabel2.setIcon(new ImageIcon(productImageAddress));
		productNameLabel2.setText(productName);
		productPriceLabel2.setText(Double.toString(productPrice) + " €");
	}
	
	public void radioButtonResult3(String productImageAddress, String productName, 
			double productPrice) {
		productIconLabel3.setIcon(new ImageIcon(productImageAddress));
		productNameLabel3.setText(productName);
		productPriceLabel3.setText(Double.toString(productPrice) + " €");
	}
}
