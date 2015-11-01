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

import category.*;
import gifted.Gifted;

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
	private JLabel backLabel;
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
		
		/* Create a label which will allow the user to go back to the previous page */
		backLabel = new JLabel("Previous Page");
		/* When the user clicks in the label the current page becomes invisible and the previous one (Welcome)
		 * becomes visible */
		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Form.this.setVisible(false);
				new Welcome().setVisible(true);
			}
		});
		
		backLabel.setFont(new Font(FONT_BODY, Font.BOLD, 16));
		backLabel.setIcon(new ImageIcon("src\\images\\back.png"));
		backLabel.setBounds(30, 100, 200, 30);
		pane.add(backLabel);
		
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
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
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
							/* Create instances of Book with some information of a real book, get this information and 
							 * send part of it (image, name and price) to the result page*/
							if (bookRadioButton.isSelected()) {
								result.radioButtonReceived(bookRadioButton.getText());
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
	
								result.radioButtonResult(0, book1.getImageProduct(), book1.getNameProduct(), book1.getPriceProduct());
	
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
	
								result.radioButtonResult(1, book2.getImageProduct(), book2.getNameProduct(), book2.getPriceProduct());
	
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
	
								result.radioButtonResult(2, book3.getImageProduct(), book3.getNameProduct(), book3.getPriceProduct());
							}
							
							/* Create instances of Sport with some information of a real sport equipment, get this information and 
							 * send part of it (image, name and price) to the result page*/
							else if (sportRadioButton.isSelected()) {
								result.radioButtonReceived(sportRadioButton.getText());
								Sport sport1 = new Sport("Rugby", "S/M/L/XL/XXL/XXXL", "Canterbury Ireland RFU", "The Canterbury Ireland RFU "
										+ "Home Pro Shirt combines Canterburys classic loop neckline with a lightweight wicking fabric for all "
										+ "round comfort, complete with 3D injection moulded Shamrock adorning the chest rounding off the look "
										+ "perfectly. ", "Sports Direct", "src\\images\\rugbyTShirt.jpg", 62.39);
	
								result.radioButtonResult(0, sport1.getImageProduct(), sport1.getNameProduct(), sport1.getPriceProduct());
	
								Sport sport2 = new Sport("Martial Art", "One size", "Lonsdale M Core Headguard", "The Lonsdale M Core Headguard "
										+ "is perfect for sparring sessions, has an L Core front designed for maximum cushioning by using multiple"
										+ " layers of closed cell foam and M Core sides for maximum breathability and keep you cooler for longer."
										+ " The Lonsdale Headguard is a one size fits all with an adjustable hook and loop tape fastening.", 
										"Sports Direct", "src\\images\\headguard.jpg", 11.99);
	
								result.radioButtonResult(1, sport2.getImageProduct(), sport2.getNameProduct(), sport2.getPriceProduct());
	
								Sport sport3 = new Sport("Football", "6 to 13", "Adidas Goletto FG", "Get a comfortable fit with the adidas "
										+ "Goletto FG Mens Football Boots thanks to the padded and shaped ankle collar with cushioned foam "
										+ "insole, whilst the full laced front helps to secure the foot in place. These Football Boots have a "
										+ "stitched forefoot for increased ball control and the moulded studs for increased traction and support "
										+ "on firm ground.", "Sports Direct", "src\\images\\footballBoots.jpg", 31.20);
								
								result.radioButtonResult(2, sport3.getImageProduct(), sport3.getNameProduct(), sport3.getPriceProduct());
							}
							
							/* Create instances of Religion with some information of a real religious equipment, get this information and 
							 * send part of it (image, name and price) to the result page*/
							else if (religionRadioButton.isSelected()) {
								result.radioButtonReceived(religionRadioButton.getText());
								Religion religion1 = new Religion("30 cm", "St Joseph Statue", "", "Veritas", "src\\images\\stJoseph.jpg", 34.95);
	
								result.radioButtonResult(0, religion1.getImageProduct(), religion1.getNameProduct(), religion1.getPriceProduct());
	
								Religion religion2 = new Religion("35 cm", "Olive Wood Crucifix", "", "Veritas", "src\\images\\oliveCrucifix.png", 
										25.00);
	
								result.radioButtonResult(1, religion2.getImageProduct(), religion2.getNameProduct(), 
										religion2.getPriceProduct());
	
								Religion religion3 = new Religion("", "CD Table of the World", "In this new recording from Tony Alonso, you will find "
										+ "ritual songs of mission and ministry that challenge us to take the Gospel vision from the table of Christ "
										+ "Jesus to the table of the world. Songs like 'How Good It Is' and 'I Will Arise' portray a message of "
										+ "forgiveness, reconciliation, peace, and unity. These themes are also reflected in the usage of diverse "
										+ "languages and music from other cultures throughout this recording. Many of the songs are bilingual, "
										+ "incorporating both Spanish and English.", "Veritas", "src\\images\\tableWorld.jpg", 14.95);
								
								result.radioButtonResult(2, religion3.getImageProduct(), religion3.getNameProduct(), religion3.getPriceProduct());
							}
							
							/* Create instances of Kid with some information of real toys, get this information and 
							 * send part of it (image, name and price) to the result page*/
							else if (kidsRadioButton.isSelected()) {
								result.radioButtonReceived(kidsRadioButton.getText());
								Kid kid1 = new Kid(3, "Robotic Puppy", "Newborn Teksta Puppy is a sweet and adorable life-like robotic Puppy that"
										+ " responds to your voice and touch. Engineered with state-of-the-art artificial intelligence, Tekstas "
										+ "toyetic interaction offers many emotions and an expressive light-up eye patterns to share his "
										+ "feelings. As your devoted companion, using cutting edge hand gesture technology, you can command "
										+ "Newborn Teksta Puppy to sit, walk, beg and sing. ", "Debenhams", "src\\images\\roboticPuppy.jpg", 28.00);
								
								result.radioButtonResult(0, kid1.getImageProduct(), kid1.getNameProduct(), kid1.getPriceProduct());
								
								Kid kid2 = new Kid(4, "LEGO Comics Super Heroes", "DK's LEGO DC Comics Super Heroes Level 3 Reader features "
										+ "LEGO Batman and many more of DC's best-loved LEGO Super Heroes as they fight to protect the world "
										+ "from cunning villains. Discover how LEGO Batman fights crime in Gotham City and learn all about his "
										+ "super talents, gadgets and vehicles. Meet the villains that LEGO Batman must battle, as well as the "
										+ "allies who help Batman on his most dangerous missions. DK Readers have easy-to-read stories with word"
										+ " repetition and pictures to build literacy skills, DK Readers are a multi-level reading programme "
										+ "guaranteed to capture a child's interest while developing reading skills and general knowledge, "
										+ "compatible with the framework for teaching literacy.", "Debenhams", "src\\images\\legoBatman.jpg", 7.00);
								
								result.radioButtonResult(1, kid2.getImageProduct(), kid2.getNameProduct(), kid2.getPriceProduct());
								
								Kid kid3 = new Kid(1, "Oball Rollie Elephant", "The Oball Rollie Elephant is soft, and flexible for little hands "
										+ "even the tiniest hands can pick them up! Babies will love this easy-to-grasp toy so much that they won't"
										+ " want to put it down. The toy features an internal rattle ball to encourage auditory and tactile "
										+ "stimulation. Baby will get a grip on playtime with this character's bold colors and dynamic play "
										+ "patterns.", "Debenhams", "src\\images\\elephantToy.jpg", 5.10);
								
								result.radioButtonResult(2, kid3.getImageProduct(), kid3.getNameProduct(), kid3.getPriceProduct());
							}
							
							/* Create instances of Outdoor with some information of real outdoor equipments, get this information and 
							 * send part of it (image, name and price) to the result page*/
							else if (outdoorRadioButton.isSelected()) {
								result.radioButtonReceived(outdoorRadioButton.getText());
								Outdoor outdoor1 = new Outdoor("104 cm x 72 cm", "La Hacienda", "This Large Kettle Barbecue is the perfect way to "
										+ "enjoy BBQ treats in the sunshine. Make the most of the summer and get the family out in the garden as you "
										+ "serve up sizzling sausages, crispy chicken legs, grilled burgers, juicy steaks and much more just the way"
										+ " you like it.", "House Of Fraser", "src\\images\\barbecue.jpg", 76.99);
								
								result.radioButtonResult(0, outdoor1.getImageProduct(), outdoor1.getNameProduct(), outdoor1.getPriceProduct());
								
								Outdoor outdoor2 = new Outdoor("25 cm x 16 cm x 13.5 cm", "Decorative Birdhouse", "Wonderfully unique and charming, "
										+ "this industrial finish birdhouse will bring colour and style to any garden space. A quirky twist on a "
										+ "traditional design this contemporary piece is hand painted to ensure each one is unique in its own way. "
										+ "Securely hang from a north facing branch, on a shady fence or wall in your garden. ", "House of Fraser", 
										"src\\images\\birdHouse.jpg", 17.50);
								
								result.radioButtonResult(1, outdoor2.getImageProduct(), outdoor2.getNameProduct(), outdoor2.getPriceProduct());
								
								Outdoor outdoor3 = new Outdoor("52 cm x 14 cm", "Trowel And Weeder Set", "Radius Hand Tools feature an advanced, "
										+ "patented, high performance ergonomic grip providing more leverage with less wrist stress. The Ultra Light "
										+ "Weight aluminium/ magnesium blades ensure an impressive strength to weight ratio making light work of "
										+ "those awkward jobs in the garden. Radius Hand Tools all feature a unique, secure and comfortable Natural "
										+ "Radius Grip that minimises hand and wrist stress making them suitable for more prolonged use whether "
										+ "conditions are wet or dry. ", "House of Fraser", "src\\images\\gardenEquipment.png", 19.95);
								
								result.radioButtonResult(2, outdoor3.getImageProduct(), outdoor3.getNameProduct(), outdoor3.getPriceProduct());
							}
							
							/* Create instances of Game with some information of real games, get this information and 
							 * send part of it (image, name and price) to the result page*/
							else if (gameRadioButton.isSelected()) {
								result.radioButtonReceived(gameRadioButton.getText());
								Game game1 = new Game("XBox One", "Halo 5: Guardians", "", "Game Stop", "src\\images\\halo5.jpg", 69.99);
								
								result.radioButtonResult(0, game1.getImageProduct(), game1.getNameProduct(), game1.getPriceProduct());
								
								Game game2 = new Game("PlayStation 4", "WWE 2K16", "The newest addition to the flagship WWE franchise will deliver "
										+ "authentic, high-powered and hard-hitting action, including fan-favourite features and new WWE Superstars, "
										+ "Divas and Legends, gameplay innovations, presentation updates and more.", "Game Stop", 
										"src\\images\\WWW2k16.jpg", 74.99);
								
								result.radioButtonResult(1, game2.getImageProduct(), game2.getNameProduct(), game2.getPriceProduct());
								
								Game game3 = new Game("Wii U", "Project Zero", "Feel the fingers of fear on the nape of your neck in Project Zero: "
										+ "Maiden of Black Water, only on Wii U. Explore dank, dark locations, exorcise malevolent apparitions with "
										+ "a strange camera, and tread deep into a mystery that spans this world and the next.", "Game Stop", 
										"src\\images\\projectZero.jpg", 69.99);
								
								result.radioButtonResult(2, game3.getImageProduct(), game3.getNameProduct(), game3.getPriceProduct());
							}
							break;
							
						/* Female */
						case 2:
							/* Create instances of Book with some information of a real book, get this information and 
							 * send part of it (image, name and price) to the result page*/
							if (bookRadioButton.isSelected()) {
								result.radioButtonReceived(bookRadioButton.getText());
								Book book1 = new Book("Paula Hawkins", 325, "The Girl on the Train", "Rachel catches the"
										+ " same commuter train every morning. She knows it will wait at the same signal each time,"
										+ " overlooking a row of back gardens. She's even started to feel like she knows the people"
										+ " who live in one of the houses. 'Jess and Jason', she calls them. Their life - as she "
										+ "sees it - is perfect. If only Rachel could be that happy. And then she sees something "
										+ "shocking. It's only a minute until the train moves on, but it's enough. Now everything's"
										+ " changed. Now Rachel has a chance to become a part of the lives she's only watched from"
										+ " afar. Now they'll see she's much more than just the girl on the train.", "Eason", 
										"src\\images\\girlOnTrain.jpg", 17.99);
	
								result.radioButtonResult(0, book1.getImageProduct(), book1.getNameProduct(), book1.getPriceProduct());
								
								Book book2 = new Book("Stephenie Meyer", 441, "Twilight Reimagined", "Celebrate the tenth "
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
	
								result.radioButtonResult(1, book2.getImageProduct(), book2.getNameProduct(), book2.getPriceProduct());
								
								Book book3 = new Book("Jacky Colliss Harvey", 240, "Red", "In her history of red hair and "
										+ "red-headedness, Jacky Colliss Harvey begins by tracing the redhead gene in prehistory, as it made "
										+ "its way out of Africa with the early human diaspora to emerge under northern skies. She goes on to "
										+ "explore red hair in the ancient world, the prejudice manifested against it across medieval Europe, "
										+ "and red hair during the Renaissance, when it was seen as both an indicator of Jewishness and the "
										+ "height of fashion in Protestant England, thanks to Elizabeth I. She also examines depictions of red "
										+ "hair in art and literature, looks at modern medicine and the genetic decoding of red hair, and "
										+ "considers red hair in contemporary culture, from advertising to 'gingerism' and bullying.", "Eason",
										"src\\images\\red.jpg", 25.50);
	
								result.radioButtonResult(2, book3.getImageProduct(), book3.getNameProduct(), book3.getPriceProduct());
							}
							
							/* Create instances of Sport with some information of a real sport equipment, get this information and 
							 * send part of it (image, name and price) to the result page*/
							else if (sportRadioButton.isSelected()) {
								result.radioButtonReceived(sportRadioButton.getText());
								Sport sport1 = new Sport("Swimming", "XL", "Slazenger Tankini Set", "The Slazenger Tankini Set offers a comfortable"
										+ " fit for your swim, whilst still offering a sporty and stylish look. This ladies tankini set is a two"
										+ " piece set with a short style bottoms and full length tankini top both with contrasting piping and the"
										+ " Slazenger logo. ", "Sports Direct", "src\\images\\tankini.jpg", 6.59);
	
								result.radioButtonResult(0, sport1.getImageProduct(), sport1.getNameProduct(), sport1.getPriceProduct());
								
								Sport sport2 = new Sport("Cricket", "H/SH", "Slazenger V100 Advance", "This Slazenger V100 Advance Cricket Bat is"
										+ " perfect for beginners who want to perfect a wide range of shots due to the OctoPlus grip, tapered toe"
										+ " to promote the favoured stance and the Kashmir willow construction provides long lasting durability. "
										+ "This Slazenger cricket bat has an OctoPlus grip to give you the confidence to play the shots you want"
										+ " whilst the Slazenger branding completes the look.", "Sports Direct", "src\\images\\cricketBat.jpg", 
										18.59);
	
								result.radioButtonResult(1, sport2.getImageProduct(), sport2.getNameProduct(), sport2.getPriceProduct());
								
								Sport sport3 = new Sport("Running", "XXS/XS/S/M", "Karrimor Xlite Sports", "This Sports Bra has an elasticated "
										+ "chest band for a secure fit, as well as mesh panels for breathability. This Running Top also features"
										+ " a V Neck design and a racer back for freedom of movement and a great look.", "Sports Direct", 
										"src\\images\\xliteRun.jpg", 8.39);
								
								result.radioButtonResult(2, sport3.getImageProduct(), sport3.getNameProduct(), sport3.getPriceProduct());
							}
							
							/* Create instances of Religion with some information of a real religious equipment, get this information and 
							 * send part of it (image, name and price) to the result page*/
							else if (religionRadioButton.isSelected()) {
								result.radioButtonReceived(religionRadioButton.getText());
								Religion religion1 = new Religion("", "My Guardian Angel", "Enchanting pearl oval pendant with silver chain "
										+ "comes gift-boxed.", "Veritas", "src\\images\\guardianAngel.png", 24.95);
								
								result.radioButtonResult(0, religion1.getImageProduct(), religion1.getNameProduct(), religion1.getPriceProduct());
								
								Religion religion2 = new Religion("", "Glass Rosary Beads", "Color: Green", "Veritas", 
										"src\\images\\rosary.jpg", 6.95);
								
								result.radioButtonResult(1, religion2.getImageProduct(), religion2.getNameProduct(), religion2.getPriceProduct());
								
								Religion religion3 = new Religion("", "St John Paul II Prayer Card", "", "Veritas", "src\\images\\prayerCard.jpg",
										6.50);
								
								result.radioButtonResult(2, religion3.getImageProduct(), religion3.getNameProduct(), religion3.getPriceProduct());
							}
							
							/* Create instances of Kid with some information of real toys, get this information and 
							 * send part of it (image, name and price) to the result page*/
							else if (kidsRadioButton.isSelected()) {
								result.radioButtonReceived(kidsRadioButton.getText());
								Kid kid1 = new Kid(0, "Owl Rattle", "Baby will have oodles fo fun with this soft rattle.", "Debenhams", 
										"src\\images\\owl.jpg", 5.10);
								
								result.radioButtonResult(0, kid1.getImageProduct(), kid1.getNameProduct(), kid1.getPriceProduct());
								
								Kid kid2 = new Kid(1, "Disney Frozen Else", "Elsa the powerful Snow Queen from Disney's Frozen is now available as a "
										+ "cute and cuddly soft toy. Recreate scenes from the movie or cuddle up with your favourite Frozen princess"
										+ " at night. This beautifully soft toy shows Elsa in her iconic blue gown, just like the movie.", 
										"Debenhams", "src\\images\\elsaFrozen.jpg", 27.00);
								
								result.radioButtonResult(1, kid2.getImageProduct(), kid2.getNameProduct(), kid2.getPriceProduct());
								
								Kid kid3 = new Kid(3, "Minions Walkie Talkies", "Designed to look like your favourite Minions, Dave and Stuart, these"
										+ " fun Walkie Talkies will keep you entertained for hours. Walkie Talkies include volume control and are easy"
										+ " use for little hands, just press the button and talk. Why not pretend to be on a secret Minion mission and"
										+ " let the adventure begin. Over and out!", "Debenhams", "src\\images\\minions.jpg", 20.00);
								
								result.radioButtonResult(2, kid3.getImageProduct(), kid3.getNameProduct(), kid3.getPriceProduct());
							}
							
							/* Create instances of Outdoor with some information of real outdoor equipments, get this information and 
							 * send part of it (image, name and price) to the result page*/
							else if (outdoorRadioButton.isSelected()) {
								result.radioButtonReceived(outdoorRadioButton.getText());
								Outdoor outdoor1 = new Outdoor("39 cm x 2 cm", "Wall Heart", "This funky and colourful wall art heart is the perfect "
										+ "accessory to liven up any space in the home or garden. Finished in stunning bright colours and with an "
										+ "industrial finish this eye catching piece is sure to draw attention. Made from steel, this piece is coated "
										+ "in paint that is suitable for outdoor use and has a size of 39cm high, 22cm wide and 6cm deep. A unique and "
										+ "stylish piece that can be hung quickly and easily on any wall or fence - fixings not supplied. Add a piece "
										+ "of industrial romance to your living space. Home is where the heart is...", "House Of Fraser", 
										"src\\images\\wallHeart.png", 19.75);
								
								result.radioButtonResult(0, outdoor1.getImageProduct(), outdoor1.getNameProduct(), outdoor1.getPriceProduct());
								
								Outdoor outdoor2 = new Outdoor("79 cm x 120 cm x 120 cm", "Rattan Round Table", "Eden Rattan Round Table With 8mm "
										+ "tempered glass - Hand woven and easy to assemble (Flatpack), it can be left outdoors in all weather "
										+ "conditions, thanks to UV resistant PVC rattan. A great way of adding an extra dimension to your garden, "
										+ "this handsome furniture will serve you well for many years to come.", "House of Fraser", 
										"src\\images\\roundTable.png", 309.00);
								
								result.radioButtonResult(1, outdoor2.getImageProduct(), outdoor2.getNameProduct(), outdoor2.getPriceProduct());
								
								Outdoor outdoor3 = new Outdoor("120 cm x 25 cm x 120 cm", "Small Play Pool", "Bestway: Tots will love splashing about "
										+ "in the Small Play Pool. Measuring 102cm in diameter and standing at 25cm tall, this handy little pool is "
										+ "perfect for back-garden fun. Please note: styles vary - this pool comes in red, green or blue. One colour "
										+ "will be chosen at random for you.", "House of Fraser", "src\\images\\pool.png", 6.00);
								
								result.radioButtonResult(2, outdoor3.getImageProduct(), outdoor3.getNameProduct(), outdoor3.getPriceProduct());
							}
							
							/* Create instances of Game with some information of real games, get this information and 
							 * send part of it (image, name and price) to the result page*/
							else if (gameRadioButton.isSelected()) {
								result.radioButtonReceived(gameRadioButton.getText());
								Game game1 = new Game("Nitendo 3DS", "Garfield Kart", "The laziest cat in the world gets a serious speed boost! "
										+ "Three difficulties and four game modes await you. Quick race, championship, time trial and daily challenge. "
										+ "Up to four friends can play against each other via the local wifi network. It's time to burn rubber and eat "
										+ "lasagne!", "Game Stop", "src\\images\\garfieldKart.jpg", 29.99);
								
								result.radioButtonResult(0, game1.getImageProduct(), game1.getNameProduct(), game1.getPriceProduct());
								
								Game game2 = new Game("XBox 360", "Just Dance 2016", "Bust a move to “Uptown Funk” by Mark Ronson Ft. Bruno Mars and "
										+ "feel the beat in “All About That Bass” by Meghan Trainor - Just Dance 2016 features an amazing tracklist "
										+ "with visuals that are more creative and breath-taking than ever before.", "Game Stop", 
										"src\\images\\justDance.jpg", 44.99);
								
								result.radioButtonResult(1, game2.getImageProduct(), game2.getNameProduct(), game2.getPriceProduct());
								
								Game game3 = new Game("PC", "The Sims 4", "Treat your Sims to a day of pampering with The Sims™ 4 Spa Day. Visit the "
										+ "all-new Perfect Balance Spa for a revitalizing massage, or work on the all-new Wellness skill with some "
										+ "yoga. After a relaxing mud bath, step into the sauna to melt away the daily stresses. You’ll also get a "
										+ "variety of all-new objects and décor, so you can pack your home with so much tranquility that your Sims "
										+ "can’t help but find their inner peace!", "Game Stop", "src\\images\\theSims4.jpg", 44.99);
								
								result.radioButtonResult(2, game3.getImageProduct(), game3.getNameProduct(), game3.getPriceProduct());
							}
							break;
					}
					
					/* Set form page as invisible and result page as visible */
					Form.this.setVisible(false);
					result.setVisible(true);
				}
				
				catch (Exception e) {
					errorLabel.setText("[ERROR] Please complete everything.");
				}
			}
		});
		
		pane.add(searchButton);
	}
}
