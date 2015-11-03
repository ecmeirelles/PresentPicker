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

import gifted.Gifted;
import product.*;

/* Class that represents the form of the main program, which will send information to search for a gift */
public class Form extends JFrame {
	/* Form attributes */
	private JPanel pane;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel genderLabel;
	private JLabel ageLabel;
	private JLabel interestLabel;
	private JLabel appIconLabel;
	private JLabel appNameLabel;
	private JLabel formDescriptionLabel;
	private JLabel errorLabel;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField ageTextField;
	private JComboBox<String> genderComboBox;
	private JRadioButton bookRadioButton;
	private JRadioButton religionRadioButton;
	private JRadioButton sportRadioButton;
	private JRadioButton gameRadioButton;
	private JRadioButton outdoorRadioButton;
	private JRadioButton kidsRadioButton;
	private JButton searchButton;
	private JButton cleanButton;
	private ButtonGroup buttonGroup;
	
	/* String used to display the options in the JComboBox */
	private String genders[] = {"", "Male", "Female"};
	
	/* Constants to standardize all fonts */
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
		
		/* Create an informational label and add it into the panel */
		formDescriptionLabel = new JLabel("We need some information regarding the gifted...");
		formDescriptionLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		formDescriptionLabel.setBounds(50, 200, 380, 30);
		pane.add(formDescriptionLabel);
		
		/* Create a label (First Name: ) and add it into the panel */
		firstNameLabel = new JLabel("First Name: ");
		firstNameLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		firstNameLabel.setBounds(50, 270, 100, 30);
		pane.add(firstNameLabel);
		
		/* Create a text field asking for first name and add it into the panel */
		firstNameTextField = new JTextField();
		firstNameTextField.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		firstNameTextField.setBounds(170, 270, 300, 30);
		pane.add(firstNameTextField);
		
		/* Create a label (Last Name: ) and add it into the panel */
		lastNameLabel = new JLabel("Last Name: ");
		lastNameLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		lastNameLabel.setBounds(520, 270, 100, 30);
		pane.add(lastNameLabel);
		
		/* Create a text field asking for last name and add it into the panel */
		lastNameTextField = new JTextField();
		lastNameTextField.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		lastNameTextField.setBounds(620, 270, 300, 30);
		pane.add(lastNameTextField);
		
		/* Create a label (Gender: ) and add it into the panel */
		genderLabel = new JLabel("Gender: ");
		genderLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		genderLabel.setBounds(50, 340, 100, 30);
		pane.add(genderLabel);
		
		/* Create a combo box asking for gender and add it into the panel */
		genderComboBox = new JComboBox<String>(genders);
		genderComboBox.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		genderComboBox.setBounds(170, 340, 300, 30);
		pane.add(genderComboBox);
		
		/* Create a label (Age: ) and add it into the panel */
		ageLabel = new JLabel("Age: ");
		ageLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		ageLabel.setBounds(520, 340, 100, 30);
		pane.add(ageLabel);
		
		/* Create a text field asking for age and add it into the panel */
		ageTextField = new JTextField();
		ageTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* If age is below 11 years old, then the kidsRadioButton becomes selected */ 
				if (Integer.parseInt(ageTextField.getText()) < 11) {
					kidsRadioButton.setSelected(true);
				}
			}
		});
		ageTextField.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		ageTextField.setBounds(620, 340, 100, 30);
		pane.add(ageTextField);
		
		/* Create a label (Main Interest: ) and add it into the panel */
		interestLabel = new JLabel("Main Interest: ");
		interestLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		interestLabel.setBounds(50, 410, 150, 30);
		pane.add(interestLabel);
		
		/* Create a radio button (Books) and add it into the panel */
		bookRadioButton = new JRadioButton("Books");
		bookRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		bookRadioButton.setBounds(80, 480, 150, 30);
		pane.add(bookRadioButton);
		
		/* Create a radio button (Sports) and add it into the panel */
		sportRadioButton = new JRadioButton("Sports");
		sportRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		sportRadioButton.setBounds(80, 530, 150, 30);
		pane.add(sportRadioButton);
		
		/* Create a radio button (Religion) and add it into the panel */
		religionRadioButton = new JRadioButton("Religion");
		religionRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		religionRadioButton.setBounds(380, 480, 150, 30);
		pane.add(religionRadioButton);
		
		/* Create a radio button (Kids) and add it into the panel */
		kidsRadioButton = new JRadioButton("Kids");
		kidsRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		kidsRadioButton.setBounds(380, 530, 150, 30);
		pane.add(kidsRadioButton);
		
		/* Create a radio button (Outdoor) and add it into the panel */
		outdoorRadioButton = new JRadioButton("Outdoor");
		outdoorRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		outdoorRadioButton.setBounds(680, 480, 150, 30);
		pane.add(outdoorRadioButton);
		
		/* Create a radio button (Games) and add it into the panel */
		gameRadioButton = new JRadioButton("Games");
		gameRadioButton.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		gameRadioButton.setBounds(680, 530, 150, 30);
		pane.add(gameRadioButton);
		
		/* Used to enable just one selection at a time */
		buttonGroup = new ButtonGroup();
		buttonGroup.add(bookRadioButton);
		buttonGroup.add(sportRadioButton);
		buttonGroup.add(religionRadioButton);
		buttonGroup.add(outdoorRadioButton);
		buttonGroup.add(kidsRadioButton);
		buttonGroup.add(gameRadioButton);
		
		
		/* Create a label to be shown if some information is missing and add it into the panel */
		errorLabel = new JLabel("");
		errorLabel.setFont(new Font(FONT_BODY, Font.PLAIN, 16));
		errorLabel.setForeground(Color.RED);
		errorLabel.setBounds(50, 750, 300, 30);
		pane.add(errorLabel);
		
		/* Create a button to clean all information given and add it into the panel */
		cleanButton = new JButton("CLEAN");
		cleanButton.setFont(new Font(FONT_BUTTON, Font.PLAIN, 16));
		cleanButton.setBounds(320, 700, 150, 30);
		
		/* To clean information it is necessary just set everything as empty or false */
		cleanButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				firstNameTextField.setText("");
				lastNameTextField.setText("");
				genderComboBox.setSelectedItem("");
				ageTextField.setText("");
				buttonGroup.clearSelection();
			}
		});
		
		pane.add(cleanButton);
		
		/* Create a button to do the action and add it into the panel */
		searchButton = new JButton("SEARCH");
		searchButton.setFont(new Font(FONT_BUTTON, Font.PLAIN, 16));
		searchButton.setBounds(520, 700, 150, 30);
		/* Usage of a named inner listener class */
		searchButton.addActionListener(new SearchListener());
		pane.add(searchButton);
	}
	
	/* Getters to access the firstName, lastName, age and gender attributes */
	public JTextField getFirstNameTextField() {
		return firstNameTextField;
	}
	
	public JTextField getLastNameTextField() {
		return lastNameTextField;
	}
	
	public JTextField getAgeTextField() {
		return ageTextField;
	}
	
	public JComboBox<String> getGenderComboBox() {
		return genderComboBox;
	}

	/* Inner class to do an actionListener */
	private class SearchListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			/* Create an instance of the result page */
			Result result = new Result();
			
			try {
				/* First of all it is necessary get all information given */
				result.giftedNameReceived(firstNameTextField.getText(), lastNameTextField.getText());
				gifted.setAgeGifted(Integer.parseInt(ageTextField.getText()));
				gifted.setGenderGifted(genderComboBox.getSelectedItem().toString());
			
				/* Use the gender selected (by index) to show the right options */
				switch(genderComboBox.getSelectedIndex()) {
					/* Nothing */
					case 0:
						break;
						
					/* Male */
					case 1:
						/* Create instances of Product with some information of real books, get this information and 
						 * send it to the result page */
						if (bookRadioButton.isSelected()) {
							result.radioButtonReceived(bookRadioButton.getText());
							Product book1 = new Product("The girl in the spider's web", 
									"http://www.easons.com/p-3543944-the-girl-in-the-spiders-web.aspx", "Eason", 
									"src\\images\\girlSpiderWeb.jpg", 16.99);
							
							result.radioButtonResult(0, book1.getImageProduct(), book1.getNameProduct(), book1.getPriceProduct(), 
									book1.getUrlProduct());
							
							Product book2 = new Product("Pulling the Strings", "http://www.easons.com/p-3870831-pulling-the-strings.aspx", 
									"Eason", "src\\images\\pullingStrings.jpg", 22.99);
	
							result.radioButtonResult(1, book2.getImageProduct(), book2.getNameProduct(), book2.getPriceProduct(), 
									book2.getUrlProduct());
							
							Product book3 = new Product("Almost the Perfect Murder", 
									"http://www.easons.com/p-3713841-almost-the-perfect-murder.aspx", "Eason", 
									"src\\images\\perfectMurder.jpg", 19.99);
	
							result.radioButtonResult(2, book3.getImageProduct(), book3.getNameProduct(), book3.getPriceProduct(), 
									book3.getUrlProduct());
						}
						
						/* Create instances of Product with some information of real sport equipments, get this information and 
						 * send it to the result page */
						else if (sportRadioButton.isSelected()) {
							result.radioButtonReceived(sportRadioButton.getText());
							Product sport1 = new Product("Canterbury Ireland RFU", 
									"http://ie.sportsdirect.com/canterbury-ireland-rfu-home-pro-shirt-2015-2016-381123?colcode=38112316", 
									"Sports Direct", "src\\images\\rugbyTShirt.jpg", 62.39);
	
							result.radioButtonResult(0, sport1.getImageProduct(), sport1.getNameProduct(), sport1.getPriceProduct(), 
									sport1.getUrlProduct());
	
							Product sport2 = new Product("Lonsdale Pro Headguard", 
									"http://ie.sportsdirect.com/lonsdale-pro-training-head-guard-762352?colcode=76235241", 
									"Sports Direct", "src\\images\\headguard.jpg", 17.99);
	
							result.radioButtonResult(1, sport2.getImageProduct(), sport2.getNameProduct(), sport2.getPriceProduct(), 
									sport2.getUrlProduct());
							
							Product sport3 = new Product("Adidas Goletto FG", 
									"http://ie.sportsdirect.com/adidas-goletto-fg-mens-football-boots-203298?colcode=20329824", 
									"Sports Direct", "src\\images\\footballBoots.jpg", 31.20);	
							
							result.radioButtonResult(2, sport3.getImageProduct(), sport3.getNameProduct(), sport3.getPriceProduct(), 
									sport3.getUrlProduct());
						}
						
						/* Create instances of Product with some information of real religious equipments, get this information and 
						 * send it to the result page */
						else if (religionRadioButton.isSelected()) {
							result.radioButtonReceived(religionRadioButton.getText());
							Product religion1 = new Product("St Joseph Statue", "http://www.veritasbooksonline.com/st-joseph-statue-30cm.html", 
									"Veritas", "src\\images\\stJoseph.jpg", 34.95);	
	
							result.radioButtonResult(0, religion1.getImageProduct(), religion1.getNameProduct(), religion1.getPriceProduct(),
									religion1.getUrlProduct());
	
							Product religion2 = new Product("Olive Wood Crucifix", 
									"http://www.veritasbooksonline.com/wooden-crucifix-with-silver-corpus-1.html", "Veritas", 
									"src\\images\\oliveCrucifix.png", 45.00);	
							
							result.radioButtonResult(1, religion2.getImageProduct(), religion2.getNameProduct(), religion2.getPriceProduct(), 
									religion2.getUrlProduct());
							
							Product religion3 = new Product("CD Table of the World", 
									"http://www.veritasbooksonline.com/table-of-the-world.html", "Veritas", "src\\images\\tableWorld.jpg", 
									14.95);
							
							result.radioButtonResult(2, religion3.getImageProduct(), religion3.getNameProduct(), religion3.getPriceProduct(),
									religion3.getUrlProduct());
						}
						
						/* Create instances of Product with some information of real kids toys, get this information and send it to the result 
						 * page */
						else if (kidsRadioButton.isSelected()) {
							result.radioButtonReceived(kidsRadioButton.getText());
							Product kid1 = new Product("Robotic Puppy", 
									"http://www.debenhams.ie/webapp/wcs/stores/servlet/prod_10052_10001_171040454899_-1", "Debenhams", 
									"src\\images\\roboticPuppy.jpg", 28.00);
							
							result.radioButtonResult(0, kid1.getImageProduct(), kid1.getNameProduct(), kid1.getPriceProduct(), 
									kid1.getUrlProduct());
							
							Product kid2 = new Product("LEGO Comics Super Heroes", 
									"http://www.debenhams.ie/webapp/wcs/stores/servlet/prod_10052_10001_171040584099_-1", "Debenhams", 
									"src\\images\\legoBatman.jpg", 7.00);
							
							result.radioButtonResult(1, kid2.getImageProduct(), kid2.getNameProduct(), kid2.getPriceProduct(), 
									kid2.getUrlProduct());
							
							Product kid3 = new Product("Oball Rollie Elephant", 
									"http://www.debenhams.ie/webapp/wcs/stores/servlet/prod_10052_10001_171050933799_-1", "Debenhams", 
									"src\\images\\elephantToy.jpg", 5.10);
							
							result.radioButtonResult(2, kid3.getImageProduct(), kid3.getNameProduct(), kid3.getPriceProduct(),
									kid3.getUrlProduct());
						}
						
						/* Create instances of Product with some information of real outdoor equipments, get this information and send it to 
						 * the result page */
						else if (outdoorRadioButton.isSelected()) {
							result.radioButtonReceived(outdoorRadioButton.getText());
							Product outdoor1 = new Product("Black Kettle BBQ", 
									"http://www.houseoffraser.co.uk/La+Hacienda+54cm+black+kettle+BBQ/225052888,default,pd.html", 
									"House Of Fraser", "src\\images\\barbecue.jpg", 109.99);
							
							result.radioButtonResult(0, outdoor1.getImageProduct(), outdoor1.getNameProduct(), outdoor1.getPriceProduct(),
									outdoor1.getUrlProduct());
						
							Product outdoor2 = new Product("Decorative Birdhouse", 
									"http://www.houseoffraser.co.uk/La+Hacienda+Large+Decorative+Birdhouse/222606557,default,pd.html", 
									"House Of Fraser", "src\\images\\birdHouse.jpg", 25.00);
							
							result.radioButtonResult(1, outdoor2.getImageProduct(), outdoor2.getNameProduct(), outdoor2.getPriceProduct(),
									outdoor2.getUrlProduct());
							
							Product outdoor3 = new Product("Trowel And Weeder Set", 
									"http://www.houseoffraser.co.uk/Radius+Trowel+and+weeder+set/224107907,default,pd.html", 
									"House of Fraser", "src\\images\\gardenEquipment.png", 19.95);
							
							result.radioButtonResult(2, outdoor3.getImageProduct(), outdoor3.getNameProduct(), outdoor3.getPriceProduct(),
									outdoor3.getUrlProduct());
						}
						
						/* Create instances of Product with some information of real games, get this information and send it to 
						 * the result page */
						else if (gameRadioButton.isSelected()) {
							result.radioButtonReceived(gameRadioButton.getText());
							
							Product game1 = new Product("Halo 5: Guardians", "https://www.gamestop.ie/Xbox%20One/Games/45020/halo-5-guardians", 
									"Game Stop", "src\\images\\halo5.jpg", 69.99);
							
							result.radioButtonResult(0, game1.getImageProduct(), game1.getNameProduct(), game1.getPriceProduct(), 
									game1.getUrlProduct());
							
							
							Product game2 = new Product("WWE 2K16", "https://www.gamestop.ie/Xbox%20360/Games/52107/wwe-2k16", 
									"Game Stop", "src\\images\\WWW2k16.jpg", 54.99);
							
							result.radioButtonResult(1, game2.getImageProduct(), game2.getNameProduct(), game2.getPriceProduct(), 
									game2.getUrlProduct());
							
							
							Product game3 = new Product("Project Zero", 
									"https://www.gamestop.ie/Wii%20U/Games/52697/project-zero-maiden-of-black-water", "Game Stop", 
									"src\\images\\projectZero.jpg", 69.99);
							
							result.radioButtonResult(2, game3.getImageProduct(), game3.getNameProduct(), game3.getPriceProduct(), 
									game3.getUrlProduct());
						}
						/* End of the case: Male */
						break;
						
					/* Female */
					case 2:
						/* Create instances of Product with some information of real books, get this information and 
						 * send it to the result page */
						if (bookRadioButton.isSelected()) {
							result.radioButtonReceived(bookRadioButton.getText());
							Product book1 = new Product("The Girl on the Train", 
									"http://www.easons.com/p-3228898-the-girl-on-the-train.aspx", "Eason", "src\\images\\girlOnTrain.jpg",
									17.99);
							
							result.radioButtonResult(0, book1.getImageProduct(), book1.getNameProduct(), book1.getPriceProduct(), 
									book1.getUrlProduct());
							
							Product book2 = new Product("Twilight Reimagined", "http://www.easons.com/p-3970413-twilight.aspx", "Eason", 
									"src\\images\\twilight.jpg", 19.99);
	
							result.radioButtonResult(1, book2.getImageProduct(), book2.getNameProduct(), book2.getPriceProduct(), 
									book2.getUrlProduct());
							
							Product book3 = new Product("Red", "http://www.easons.com/p-3796039-red.aspx", "Eason", 
									"src\\images\\red.jpg", 25.50);
	
							result.radioButtonResult(2, book3.getImageProduct(), book3.getNameProduct(), book3.getPriceProduct(), 
									book3.getUrlProduct());
						}
						
						/* Create instances of Product with some information of real sport equipments, get this information and 
						 * send it to the result page */
						else if (sportRadioButton.isSelected()) {
							result.radioButtonReceived(sportRadioButton.getText());
							Product sport1 = new Product("Slazenger Tankini Set", 
									"http://ie.sportsdirect.com/slazenger-tankini-set-ladies-354023?colcode=35402322", 
									"Sports Direct", "src\\images\\tankini.jpg", 11.40);
	
							result.radioButtonResult(0, sport1.getImageProduct(), sport1.getNameProduct(), sport1.getPriceProduct(), 
									sport1.getUrlProduct());
	
							Product sport2 = new Product("Slazenger Coach Catch", 
									"http://ie.sportsdirect.com/slazenger-coach-catch-bat-851054?colcode=85105490", 
									"Sports Direct", "src\\images\\cricketBat.jpg", 8.39);
	
							result.radioButtonResult(1, sport2.getImageProduct(), sport2.getNameProduct(), sport2.getPriceProduct(), 
									sport2.getUrlProduct());
							
							Product sport3 = new Product("Karrimor Xlite Sports", 
									"http://ie.sportsdirect.com/karrimor-xlite-sports-bra-ladies-455301?colcode=45530190", 
									"Sports Direct", "src\\images\\xliteRun.jpg", 8.39);	
							
							result.radioButtonResult(2, sport3.getImageProduct(), sport3.getNameProduct(), sport3.getPriceProduct(), 
									sport3.getUrlProduct());
						}
						
						/* Create instances of Product with some information of real religious equipments, get this information and 
						 * send it to the result page */
						else if (religionRadioButton.isSelected()) {
							result.radioButtonReceived(religionRadioButton.getText());
							Product religion1 = new Product("My Guardian Angel", "http://www.veritasbooksonline.com/my-guardian-angel-1.html", 
									"Veritas", "src\\images\\guardianAngel.png", 24.95);	
	
							result.radioButtonResult(0, religion1.getImageProduct(), religion1.getNameProduct(), religion1.getPriceProduct(),
									religion1.getUrlProduct());
	
							Product religion2 = new Product("Glass Rosary Beads", "http://www.veritasbooksonline.com/glass-rosary-beads.html", 
									"Veritas", "src\\images\\rosary.jpg", 6.95);	
							
							result.radioButtonResult(1, religion2.getImageProduct(), religion2.getNameProduct(), religion2.getPriceProduct(), 
									religion2.getUrlProduct());
							
							Product religion3 = new Product("St John Paul II Prayer Card", 
									"http://www.veritasbooksonline.com/saint-john-paul-ii-prayer-card-pack.html", "Veritas", 
									"src\\images\\prayerCard.jpg", 6.50);
							
							result.radioButtonResult(2, religion3.getImageProduct(), religion3.getNameProduct(), religion3.getPriceProduct(),
									religion3.getUrlProduct());
						}
						
						/* Create instances of Product with some information of real kids toys, get this information and send it to the result 
						 * page */
						else if (kidsRadioButton.isSelected()) {
							result.radioButtonReceived(kidsRadioButton.getText());
							Product kid1 = new Product("Owl Rattle", 
									"http://www.debenhams.ie/webapp/wcs/stores/servlet/prod_10052_10001_171050933099_-1", "Debenhams", 
									"src\\images\\owl.jpg", 5.10);
							
							result.radioButtonResult(0, kid1.getImageProduct(), kid1.getNameProduct(), kid1.getPriceProduct(), 
									kid1.getUrlProduct());
							
							Product kid2 = new Product("Disney Frozen Elsa", 
									"http://www.debenhams.ie/webapp/wcs/stores/servlet/prod_10052_10001_171050500399_-1", "Debenhams", 
									"src\\images\\elsaFrozen.jpg", 27.00);
							
							result.radioButtonResult(1, kid2.getImageProduct(), kid2.getNameProduct(), kid2.getPriceProduct(), 
									kid2.getUrlProduct());
							
							Product kid3 = new Product("Minions Walkie Talkies", 
									"http://www.debenhams.ie/webapp/wcs/stores/servlet/prod_10052_10001_171040486399_-1", "Debenhams", 
									"src\\images\\minions.jpg", 20.00);
							
							result.radioButtonResult(2, kid3.getImageProduct(), kid3.getNameProduct(), kid3.getPriceProduct(),
									kid3.getUrlProduct());
						}
						
						/* Create instances of Product with some information of real outdoor equipments, get this information and send it to 
						 * the result page */
						else if (outdoorRadioButton.isSelected()) {
							result.radioButtonReceived(outdoorRadioButton.getText());
							Product outdoor1 = new Product("Wall Heart", 
									"http://www.houseoffraser.co.uk/La+Hacienda+Wall+Heart+Long/222606515,default,pd.html", 
									"House Of Fraser", "src\\images\\wallHeart.png", 28.21);
							
							result.radioButtonResult(0, outdoor1.getImageProduct(), outdoor1.getNameProduct(), outdoor1.getPriceProduct(),
									outdoor1.getUrlProduct());
						
							Product outdoor2 = new Product("Rattan Round Table", 
						   "http://www.houseoffraser.co.uk/Oseasons+120cm+Eden+rattan+round+table+with+8mm+tempered+g/221744873,default,pd.html", 
									"House Of Fraser", "src\\images\\roundTable.png", 309.00);
							
							result.radioButtonResult(1, outdoor2.getImageProduct(), outdoor2.getNameProduct(), outdoor2.getPriceProduct(),
									outdoor2.getUrlProduct());
							
							Product outdoor3 = new Product("Small Play Pool", 
									"http://www.houseoffraser.co.uk/Bestway+Small+Play+Pool/220715685,default,pd.html", 
									"House of Fraser", "src\\images\\pool.png", 6.00);
							
							result.radioButtonResult(2, outdoor3.getImageProduct(), outdoor3.getNameProduct(), outdoor3.getPriceProduct(),
									outdoor3.getUrlProduct());
						}
						
						/* Create instances of Product with some information of real games, get this information and send it to 
						 * the result page */
						else if (gameRadioButton.isSelected()) {
							result.radioButtonReceived(gameRadioButton.getText());
							
							Product game1 = new Product("Garfield Kart", "https://www.gamestop.ie/Nintendo%203DS/Games/52564/garfield-kart", 
									"Game Stop", "src\\images\\garfieldKart.jpg", 29.99);
							
							result.radioButtonResult(0, game1.getImageProduct(), game1.getNameProduct(), game1.getPriceProduct(), 
									game1.getUrlProduct());
							
							
							Product game2 = new Product("Just Dance 2016", "https://www.gamestop.ie/Xbox%20360/Games/53049/just-dance-2016", 
									"Game Stop", "src\\images\\justDance.jpg", 44.99);
							
							result.radioButtonResult(1, game2.getImageProduct(), game2.getNameProduct(), game2.getPriceProduct(), 
									game2.getUrlProduct());
							
							
							Product game3 = new Product("The Sims 4", "https://www.gamestop.ie/PC/Games/53565/the-sims-4-bundle", "Game Stop", 
									"src\\images\\theSims4.jpg", 44.99);
							
							result.radioButtonResult(2, game3.getImageProduct(), game3.getNameProduct(), game3.getPriceProduct(), 
									game3.getUrlProduct());
						}
					/* End of the case: Female */
					break;
				}
				
				/* Set form page as invisible and result page as visible */
				Form.this.setVisible(false);
				result.setVisible(true);
				/* Send some information to Result */
				result.getInformation(firstNameTextField.getText(), lastNameTextField.getText(), ageTextField.getText(), 
						genderComboBox.getSelectedIndex());
			
			} catch (Exception e) {
				errorLabel.setText("[ERROR] Please complete everything.");
			}
		/* End of actionPerfomed method */
		}
	/* End of SearchListener class */
	}
}
