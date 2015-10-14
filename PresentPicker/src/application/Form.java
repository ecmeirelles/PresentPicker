package application;

import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import gifted.Gifted;

public class Form extends JFrame {
	/* Form attributes */
	private JPanel pane;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel genderLabel;
	private JLabel ageLabel;
	private JLabel interestLabel;
	private JLabel relationshipLabel;
	private JLabel appIconLabel;
	private JLabel appNameLabel;
	private JLabel formDescriptionLabel;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField ageTextField;
	private JTextField relationshipTextField;
	private JComboBox<String> genderComboBox;
	private JCheckBox musicCheckBox;
	private JCheckBox movieBookCheckBox;
	private JCheckBox religionCheckBox;
	private JCheckBox sportCheckBox;
	private JCheckBox gameCheckBox;
	private JCheckBox outdoorCheckBox;
	private JCheckBox kidsCheckBox;
	private JCheckBox houseCheckBox;
	private JCheckBox drinkCheckBox;
	private JButton searchButton;
	private JButton cleanButton;
	
	private String genders[] = {"", "Male", "Female"};
	public final String FONT_TITTLE = "Andalus";
	public final String FONT_BODY = "Sylfaen";
	public final String FONT_BUTTON = "Sylfaen";
	
	Gifted gifted = new Gifted();

	public static void main(String[] args) {
		
		Form frame = new Form();
		/* Make the window visible */
		frame.setVisible(true);
	}
	
	public Form() {
		
		setBounds(400, 100, 1000, 860);
		setTitle("Present Picker");
		/* Disable resize */
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);
		
		appIconLabel = new JLabel("");
		appIconLabel.setBounds(20, 20, 64, 64);
		appIconLabel.setIcon(new ImageIcon("src\\gift-icon.png"));
		pane.add(appIconLabel);
		
		appNameLabel = new JLabel("PRESENT PICKER");
		appNameLabel.setFont(new Font(FONT_TITTLE, Font.BOLD, 24));
		appNameLabel.setBounds(100, 40, 250, 30);
		pane.add(appNameLabel);
		
		formDescriptionLabel = new JLabel("We need some information regarding the gifted...");
		formDescriptionLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		formDescriptionLabel.setBounds(50, 130, 380, 30);
		pane.add(formDescriptionLabel);
		
		firstNameLabel = new JLabel("First Name: ");
		firstNameLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		firstNameLabel.setBounds(50, 180, 100, 30);
		pane.add(firstNameLabel);
		
		firstNameTextField = new JTextField();
		firstNameTextField.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		firstNameTextField.setBounds(170, 180, 300, 30);
		pane.add(firstNameTextField);
		
		lastNameLabel = new JLabel("Last Name: ");
		lastNameLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		lastNameLabel.setBounds(520, 180, 100, 30);
		pane.add(lastNameLabel);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		lastNameTextField.setBounds(620, 180, 300, 30);
		pane.add(lastNameTextField);
		
		genderLabel = new JLabel("Gender: ");
		genderLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		genderLabel.setBounds(50, 250, 100, 30);
		pane.add(genderLabel);
		
		genderComboBox = new JComboBox<String>(genders);
		genderComboBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		genderComboBox.setBounds(170, 250, 300, 30);
		pane.add(genderComboBox);
		
		ageLabel = new JLabel("Age: ");
		ageLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		ageLabel.setBounds(520, 250, 100, 30);
		pane.add(ageLabel);
		
		ageTextField = new JTextField();
		ageTextField.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		ageTextField.setBounds(620, 250, 100, 30);
		pane.add(ageTextField);
		
		relationshipLabel = new JLabel("Relationship with you: ");
		relationshipLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		relationshipLabel.setBounds(50, 330, 200, 30);
		pane.add(relationshipLabel);
		
		relationshipTextField = new JTextField();
		relationshipTextField.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		relationshipTextField.setBounds(240, 330, 230, 30);
		pane.add(relationshipTextField);
		
		interestLabel = new JLabel("Interests: ");
		interestLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		interestLabel.setBounds(50, 410, 150, 30);
		pane.add(interestLabel);
		
		movieBookCheckBox = new JCheckBox("Movies/Books");
		movieBookCheckBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		movieBookCheckBox.setBounds(50, 480, 150, 30);
		pane.add(movieBookCheckBox);
		
		sportCheckBox = new JCheckBox("Sports");
		sportCheckBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		sportCheckBox.setBounds(50, 530, 150, 30);
		pane.add(sportCheckBox);
		
		religionCheckBox = new JCheckBox("Religion");
		religionCheckBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		religionCheckBox.setBounds(50, 580, 150, 30);
		pane.add(religionCheckBox);
		
		kidsCheckBox = new JCheckBox("Kids");
		kidsCheckBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		kidsCheckBox.setBounds(350, 480, 150, 30);
		pane.add(kidsCheckBox);
		
		outdoorCheckBox = new JCheckBox("Outdoor");
		outdoorCheckBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		outdoorCheckBox.setBounds(350, 530, 150, 30);
		pane.add(outdoorCheckBox);
		
		houseCheckBox = new JCheckBox("House");
		houseCheckBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		houseCheckBox.setBounds(350, 580, 150, 30);
		pane.add(houseCheckBox);
		
		gameCheckBox = new JCheckBox("Games");
		gameCheckBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		gameCheckBox.setBounds(650, 480, 150, 30);
		pane.add(gameCheckBox);
		
		drinkCheckBox = new JCheckBox("Drink Enthusiastic");
		drinkCheckBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		drinkCheckBox.setBounds(650, 530, 150, 30);
		pane.add(drinkCheckBox);
		
		musicCheckBox = new JCheckBox("Music");
		musicCheckBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		musicCheckBox.setBounds(650, 580, 150, 30);
		pane.add(musicCheckBox);
		
		cleanButton = new JButton("CLEAN");
		cleanButton.setFont(new Font(FONT_BUTTON, Font.PLAIN, 16));
		cleanButton.setBounds(320, 700, 150, 30);
		
		cleanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				firstNameTextField.setText("");
				lastNameTextField.setText("");
				genderComboBox.setSelectedItem("");
				ageTextField.setText("");
				relationshipTextField.setText("");
				movieBookCheckBox.setSelected(false);
				sportCheckBox.setSelected(false);
				religionCheckBox.setSelected(false);
				kidsCheckBox.setSelected(false);
				outdoorCheckBox.setSelected(false);
				houseCheckBox.setSelected(false);
				gameCheckBox.setSelected(false);
				drinkCheckBox.setSelected(false);
				musicCheckBox.setSelected(false);
				
			}
		});
		
		pane.add(cleanButton);
		
		searchButton = new JButton("SEARCH");
		searchButton.setFont(new Font(FONT_BUTTON, Font.PLAIN, 16));
		searchButton.setBounds(520, 700, 150, 30);
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				gifted.setFirstNameGifted(firstNameTextField.getText());
				gifted.setLastNameGifted(lastNameTextField.getText());
				gifted.setRelationshipGifted(relationshipTextField.getText());
				gifted.setAgeGifted(Integer.parseInt(ageTextField.getText()));
				gifted.setGenderGifted(genderComboBox.getSelectedItem().toString());
				
				System.out.println("Name: " + gifted.getFirstNameGifted() + " " + 
						gifted.getLastNameGifted());
				System.out.println("Gender: " + gifted.getGenderGifted());
				System.out.println("Age: " + gifted.getAgeGifted());
				System.out.println("Relationship: " + gifted.getRelationshipGifted());
				
				//TODO Action regarding all the checkboxes 
			}
		});
		
		pane.add(searchButton);
	}
}
