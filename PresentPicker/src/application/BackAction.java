package application;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/* Class that represents an action to come back to the previous page keeping information */
public class BackAction extends MouseAdapter implements MouseListener {
	/* BackAction attributes */
	Result result;
	Form form = new Form();
	
	/* Constructor receiving an instance of Result */
	public BackAction(Result result) {
		this.result = result;
	}
	
	/* When the person clicks on the label, the previous page appears with all information sent previously been there */
	@Override
	public void mouseClicked(MouseEvent arg0) {
		result.setVisible(false);
		result.setInformationBack(form);
		form.setVisible(true);
	}
}
