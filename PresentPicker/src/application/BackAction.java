package application;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/* When the user clicks in the label the current page becomes invisible and the previous one (Form) becomes visible */
public class BackAction extends MouseAdapter implements MouseListener {
	Result result;
	Form form = new Form();
	
	public BackAction(Result result) {
		this.result = result;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		result.setVisible(false);
		result.setInformationBack(form);
		form.setVisible(true);
	}
}
