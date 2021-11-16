package lab_7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addPublicationWindow {
	
	public JFrame addPubicationWindow;
	public JTextField addTypeText;
    public JTextField addQuantity;
    public JButton addPublication;
    public JButton backHomeFromPublicationbutton;
   


	/**
	 * Create the application.
	 */
	public addPublicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		addPubicationWindow = new JFrame();
		addPubicationWindow.setBounds(100, 100, 450, 300);
		addPubicationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addPubicationWindow.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Item Type");
		addPubicationWindow.getContentPane().add(lblNewLabel);
		
		addTypeText = new JTextField();
		addPubicationWindow.getContentPane().add(addTypeText);
		addTypeText.setColumns(10);
		
		JLabel add = new JLabel("Quantity");
		addPubicationWindow.getContentPane().add(add);
		
		addQuantity = new JTextField();
		addPubicationWindow.getContentPane().add(addQuantity);
		addQuantity.setColumns(10);
		
		addPublication = new JButton("Add new Item");
		addPubicationWindow.getContentPane().add(addPublication);
		
		backHomeFromPublicationbutton = new JButton("Back to Home Page");
		addPubicationWindow.getContentPane().add(backHomeFromPublicationbutton);
	}

}
