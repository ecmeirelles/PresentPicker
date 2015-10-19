package application;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import category.BookMovie;
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
	private JRadioButton musicRadioButton;
	private JRadioButton movieBookRadioButton;
	private JRadioButton religionRadioButton;
	private JRadioButton sportRadioButton;
	private JRadioButton gameRadioButton;
	private JRadioButton outdoorRadioButton;
	private JRadioButton kidsRadioButton;
	private JRadioButton houseRadioButton;
	private JRadioButton drinkRadioButton;
	private JButton searchButton;
	private JButton cleanButton;
	private ButtonGroup buttonGroup;
	
	private String genders[] = {"", "Male", "Female"};
	public final String FONT_TITTLE = "Andalus";
	public final String FONT_BODY = "Sylfaen";
	public final String FONT_BUTTON = "Sylfaen";
	private static final long serialVersionUID = 1L;
	
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
		appIconLabel.setIcon(new ImageIcon("src\\images\\gift-icon.png"));
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
		
		interestLabel = new JLabel("Main Interest: ");
		interestLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		interestLabel.setBounds(50, 410, 150, 30);
		pane.add(interestLabel);
		
		movieBookRadioButton = new JRadioButton("Movies/Books");
		movieBookRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		movieBookRadioButton.setBounds(50, 480, 150, 30);
		pane.add(movieBookRadioButton);
		
		sportRadioButton = new JRadioButton("Sports");
		sportRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		sportRadioButton.setBounds(50, 530, 150, 30);
		pane.add(sportRadioButton);
		
		religionRadioButton = new JRadioButton("Religion");
		religionRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		religionRadioButton.setBounds(50, 580, 150, 30);
		pane.add(religionRadioButton);
		
		kidsRadioButton = new JRadioButton("Kids");
		kidsRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		kidsRadioButton.setBounds(350, 480, 150, 30);
		pane.add(kidsRadioButton);
		
		outdoorRadioButton = new JRadioButton("Outdoor");
		outdoorRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		outdoorRadioButton.setBounds(350, 530, 150, 30);
		pane.add(outdoorRadioButton);
		
		houseRadioButton = new JRadioButton("House");
		houseRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		houseRadioButton.setBounds(350, 580, 150, 30);
		pane.add(houseRadioButton);
		
		gameRadioButton = new JRadioButton("Games");
		gameRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		gameRadioButton.setBounds(650, 480, 150, 30);
		pane.add(gameRadioButton);
		
		drinkRadioButton = new JRadioButton("Drink Enthusiastic");
		drinkRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		drinkRadioButton.setBounds(650, 530, 150, 30);
		pane.add(drinkRadioButton);
		
		musicRadioButton = new JRadioButton("Music");
		musicRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		musicRadioButton.setBounds(650, 580, 150, 30);
		pane.add(musicRadioButton);
		
		/* Used to enable just one selection at a time */
		buttonGroup = new ButtonGroup();
		buttonGroup.add(movieBookRadioButton);
		buttonGroup.add(sportRadioButton);
		buttonGroup.add(religionRadioButton);
		buttonGroup.add(musicRadioButton);
		buttonGroup.add(drinkRadioButton);
		buttonGroup.add(outdoorRadioButton);
		buttonGroup.add(kidsRadioButton);
		buttonGroup.add(gameRadioButton);
		buttonGroup.add(houseRadioButton);
		
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
				movieBookRadioButton.setSelected(false);
				sportRadioButton.setSelected(false);
				religionRadioButton.setSelected(false);
				kidsRadioButton.setSelected(false);
				outdoorRadioButton.setSelected(false);
				houseRadioButton.setSelected(false);
				gameRadioButton.setSelected(false);
				drinkRadioButton.setSelected(false);
				musicRadioButton.setSelected(false);
				
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
				
				Form.this.setVisible(false);		
				
				//TODO Action regarding all the checkboxes
				Result result = new Result();
						
				if (movieBookRadioButton.isSelected()) {
					BookMovie book = new BookMovie("Paula Hawkins", 325, "The Girl on the Train", "Rachel catches the"
							+ " same commuter train every morning. She knows it will wait at the same signal each time,"
							+ " overlooking a row of back gardens. She's even started to feel like she knows the people"
							+ " who live in one of the houses. 'Jess and Jason', she calls them. Their life - as she "
							+ "sees it - is perfect. If only Rachel could be that happy. And then she sees something "
							+ "shocking. It's only a minute until the train moves on, but it's enough. Now everything's"
							+ " changed. Now Rachel has a chance to become a part of the lives she's only watched from"
							+ " afar. Now they'll see she's much more than just the girl on the train.", "Eason", 
							"src\\images\\girlOnTrain.jpg", 17.99);
					
					result.checkBoxResult(movieBookRadioButton.getText(), book.getImageProduct(), book.getNameProduct(), 
							book.getPriceProduct());
				}
				/*
				if (sportCheckBox.isSelected()) {
					result.checkBoxResult(sportCheckBox.getText());
				}
				
				if (religionCheckBox.isSelected()) {
					result.checkBoxResult(religionCheckBox.getText());
				}
				
				if (kidsCheckBox.isSelected()) {
					result.checkBoxResult(kidsCheckBox.getText());
				}
				
				if (outdoorCheckBox.isSelected()) {
					result.checkBoxResult(outdoorCheckBox.getText());
				}
				
				if (houseCheckBox.isSelected()) {
					result.checkBoxResult(houseCheckBox.getText());
				}
				
				if (gameCheckBox.isSelected()) {
					result.checkBoxResult(gameCheckBox.getText());
				}
				
				if (drinkCheckBox.isSelected()) {
					result.checkBoxResult(drinkCheckBox.getText());
				}
				
				if (musicCheckBox.isSelected()) {
					result.checkBoxResult(musicCheckBox.getText());
				}
				*/
				
				result.setVisible(true);
			}
		});
		
		pane.add(searchButton);
	}
}
