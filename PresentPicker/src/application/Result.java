package application;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Result extends JFrame {
	private static final long serialVersionUID = 1L;
	public final String FONT_TITTLE = "Andalus";
	public final String FONT_BODY = "Sylfaen";
	public final String FONT_BUTTON = "Sylfaen";
	
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
	
	private int increment;
	private int i = 0;
	
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
		
		appIconLabel = new JLabel("");
		appIconLabel.setBounds(20, 20, 64, 64);
		appIconLabel.setIcon(new ImageIcon("src\\images\\gift-icon.png"));
		pane.add(appIconLabel);
		
		appNameLabel = new JLabel("PRESENT PICKER");
		appNameLabel.setFont(new Font(FONT_TITTLE, Font.BOLD, 24));
		appNameLabel.setBounds(100, 40, 250, 30);
		pane.add(appNameLabel);
		
		resultsForLabel = new JLabel("Results for");
		resultsForLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		resultsForLabel.setBounds(50, 130, 120, 30);
		pane.add(resultsForLabel);
		
		resultsInterestLabel = new JLabel("");
		resultsInterestLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		resultsInterestLabel.setBounds(140, 130, 450, 30);
		pane.add(resultsInterestLabel);

		productIconLabel1 = new JLabel("");
		productIconLabel1.setBounds(50, 180, 200, 250);
		productIconLabel1.setIcon(new ImageIcon(""));
		productIconLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productIconLabel1);
		
		productNameLabel1 = new JLabel("");
		productNameLabel1.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productNameLabel1.setBounds(50, 430, 200, 30);
		productNameLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productNameLabel1);
		
		productPriceLabel1 = new JLabel("");
		productPriceLabel1.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productPriceLabel1.setBounds(50, 460, 200, 30);
		productPriceLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productPriceLabel1);
		
		productIconLabel2 = new JLabel("");
		productIconLabel2.setBounds(350, 180, 200, 250);
		productIconLabel2.setIcon(new ImageIcon(""));
		productIconLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productIconLabel2);
		
		productNameLabel2 = new JLabel("");
		productNameLabel2.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productNameLabel2.setBounds(350, 430, 200, 30);
		productNameLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productNameLabel2);
		
		productPriceLabel2 = new JLabel("");
		productPriceLabel2.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productPriceLabel2.setBounds(350, 460, 200, 30);
		productPriceLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productPriceLabel2);
		
		productIconLabel3 = new JLabel("");
		productIconLabel3.setBounds(650, 180, 200, 250);
		productIconLabel3.setIcon(new ImageIcon(""));
		productIconLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productIconLabel3);
		
		productNameLabel3 = new JLabel("");
		productNameLabel3.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productNameLabel3.setBounds(650, 430, 200, 30);
		productNameLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productNameLabel3);
		
		productPriceLabel3 = new JLabel("");
		productPriceLabel3.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		productPriceLabel3.setBounds(650, 460, 200, 30);
		productPriceLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(productPriceLabel3);
	}
	
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
