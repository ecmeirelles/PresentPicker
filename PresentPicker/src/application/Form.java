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

import category.Book;
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
	private JRadioButton bookRadioButton;
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
		
		bookRadioButton = new JRadioButton("Books");
		bookRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		bookRadioButton.setBounds(50, 480, 150, 30);
		pane.add(bookRadioButton);
		
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
		buttonGroup.add(bookRadioButton);
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
				bookRadioButton.setSelected(false);
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
					
				Result result = new Result();
				
				switch(genderComboBox.getSelectedIndex()) {
					/* Nothing */
					case 0:
						break;
						
					/* Male */
					case 1:
						if (bookRadioButton.isSelected()) {
							Book book1 = new Book("David Lagercrantz", 544, "The girl in the spider's web", "She is the girl "
									+ "with the dragon tattoo. Lisbeth Salander. An uncompromising misfit whose burning sense of injustice"
									+ " and talent for investigation will never respect boundaries of state or status. He is a campaigning"
									+ " journalist. Mikael Blomkvist. A lone wolf whose integrity and championing of the truth bring him "
									+ "time and again to the brink of unemployment - and prosecution. The call comes in late at night: "
									+ "a superhacker has gained access to critical, top secret U.S. intelligence. Blomkvist knows only "
									+ "one person who could crack the best security systems in the world. This case has all the hallmarks "
									+ "of Salander. She is accused of acting without reason, taking risks just because she can, but "
									+ "though they have lost touch, Blomkvist knows Lisbeth better than that. There must be something "
									+ "deeper at the heart of this - maybe even the scoop that Millennium magazine so desperately needs "
									+ "for its survival. A tangled web of truth that someone is prepared to kill to protect.", "Eason", 
									"src\\images\\girlSpiderWeb.jpg", 16.99);
							
							result.radioButtonResult1(bookRadioButton.getText(), book1.getImageProduct(), book1.getNameProduct(), 
									book1.getPriceProduct());
							
							Book book2 = new Book("Peter Stringer", 280, "Pulling the Strings", "The long-awaited autobiography "
									+ "of Ireland's most beloved rugby player: Peter Stringer When Peter Stringer played youth rugby, he "
									+ "was so small that people told his parents he shouldn't be allowed on the pitch. Fortunately for "
									+ "Munster and for Ireland, they paid no attention. Over 200 provincial caps and 98 international caps "
									+ "later, Stringer is a legend. Since making his Munster debut in 1998, his lightning-quick passing, "
									+ "sniping breaks and brave defending have electrified fans - never more so than when he deceived the "
									+ "entire Biarritz team at a scrum to sneak in for the try that brought Munster its first Heineken Cup "
									+ "in 2006. In Ireland's breakthrough season of 2009, his man-of-the-match performance at Murrayfield "
									+ "helped overturn a late deficit en route to the Six Nations Grand Slam. Now, for the first time, Peter "
									+ "Stringer tells his own story - a story of overcoming the odds, and a story every Irish rugby fan will "
									+ "want to read.", "Eason", "src\\images\\pullingStrings.jpg", 22.99);
							
							result.radioButtonResult2(book2.getImageProduct(), book2.getNameProduct(), 
									book2.getPriceProduct());
							
							Book book3 = new Book("Paul Williams", 288, "Almost the Perfect Murder", "For over a year everyone "
									+ "assumed missing Dublin woman Elaine O'Hara had ended her own life. But after her remains were found "
									+ "garda discovered that Elaine was in thrall to a man who had spent years grooming her to let him kill "
									+ "her. That man was Graham Dwyer, a married father of three and partner in a Dublin architecture "
									+ "practice. Almost the Perfect Murder details the exhaustive investigation - one of the most complex "
									+ "and chilling in Irish criminal justice history - that allowed garda to build a case against Dwyer. "
									+ "And it outlines the twists and turns - both in the courtroom and behind the scenes - during the "
									+ "dramatic trial that followed. Almost the Perfect Murder contains startling new material based on "
									+ "extensive research conducted especially for the book. This includes fresh insights into the garda "
									+ "investigation and background information on Graham Dwyer. This is the definitive account of the case "
									+ "that gripped the nation by Ireland's leading crime journalist, Paul Williams. 'An example of "
									+ "doggedness and tenacious police work, which saw that justice was done, and seen to be done' Irish "
									+ "Independent.", "Eason", "src\\images\\perfectMurder.jpg", 19.99);
							
							result.radioButtonResult3(book3.getImageProduct(), book3.getNameProduct(), 
									book3.getPriceProduct());
						}						
						break;
						
					/* Female */
					case 2:
						if (bookRadioButton.isSelected()) {
							Book book1 = new Book("Paula Hawkins", 325, "The Girl on the Train", "Rachel catches the"
									+ " same commuter train every morning. She knows it will wait at the same signal each time,"
									+ " overlooking a row of back gardens. She's even started to feel like she knows the people"
									+ " who live in one of the houses. 'Jess and Jason', she calls them. Their life - as she "
									+ "sees it - is perfect. If only Rachel could be that happy. And then she sees something "
									+ "shocking. It's only a minute until the train moves on, but it's enough. Now everything's"
									+ " changed. Now Rachel has a chance to become a part of the lives she's only watched from"
									+ " afar. Now they'll see she's much more than just the girl on the train.", "Eason", 
									"src\\images\\girlOnTrain.jpg", 17.99);
							
							result.radioButtonResult1(bookRadioButton.getText(), book1.getImageProduct(), book1.getNameProduct(), 
									book1.getPriceProduct());
							
							Book book2 = new Book("Stephenie Meyer", 442, "Twilight Reimagined", "Celebrate the tenth "
									+ "anniversary of Twilight ! This special tenth anniversary edition includes the original novel "
									+ "as well as exclusive new bonus content. Readers will relish experiencing the iconic love story "
									+ "of Bella and Edward again . . . or for the very first time. Deeply romantic and extraordinarily "
									+ "suspenseful,Twilight has enraptured millions of readers since its first publication in 2005 and "
									+ "has become a modern classic, redefining genres within young adult literature and inspiring a "
									+ "phenomenon that has had readers yearning for more. The novel was a Sunday Times and New York "
									+ "Times bestseller. The Twilight Saga, which also includes New Moon, Eclipse, Breaking Dawn, The "
									+ "Short Second Life of Bree Tanner: An Eclipse Novella, and The Twilight Saga: The Official "
									+ "Illustrated Guide , has sold nearly 155 million copies worldwide.", "Eason", 
									"src\\images\\twilight.jpg", 19.99);
							
							result.radioButtonResult2(book2.getImageProduct(), book2.getNameProduct(), 
									book2.getPriceProduct());
							
							Book book3 = new Book("Jacky Colliss Harvey", 240, "Red", "In her history of red hair and "
									+ "red-headedness, Jacky Colliss Harvey begins by tracing the redhead gene in prehistory, as it made "
									+ "its way out of Africa with the early human diaspora to emerge under northern skies. She goes on to "
									+ "explore red hair in the ancient world, the prejudice manifested against it across medieval Europe, "
									+ "and red hair during the Renaissance, when it was seen as both an indicator of Jewishness and the "
									+ "height of fashion in Protestant England, thanks to Elizabeth I. She also examines depictions of red "
									+ "hair in art and literature, looks at modern medicine and the genetic decoding of red hair, and "
									+ "considers red hair in contemporary culture, from advertising to 'gingerism' and bullying.", "Eason",
									"src\\images\\red.jpg", 25.50);
							
							result.radioButtonResult3(book3.getImageProduct(), book3.getNameProduct(), 
									book3.getPriceProduct());
						}
						break;
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
				
				Form.this.setVisible(false);
				result.setVisible(true);
			}
		});
		
		pane.add(searchButton);
	}
}
