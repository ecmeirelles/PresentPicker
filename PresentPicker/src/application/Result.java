package application;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
	private JLabel productIconLabel;
	private JLabel productNameLabel;
	private JLabel productPriceLabel;
	
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
		appIconLabel.setIcon(new ImageIcon("src\\gift-icon.png"));
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
		
		productIconLabel = new JLabel("");
		productIconLabel.setBounds(50, 180, 200, 250);
		pane.add(productIconLabel);
	}
	
	ArrayList<String> categoriesCheckBox = new ArrayList<String>();
	public void checkBoxResult(String nomeCheckBox) {
		categoriesCheckBox.add(nomeCheckBox);
		resultsInterestLabel.setText(categoriesCheckBox.toString());
	}
	
	public void productImageResult(String productImageAddress) {
		productIconLabel.setIcon(new ImageIcon(productImageAddress));
	}
}
