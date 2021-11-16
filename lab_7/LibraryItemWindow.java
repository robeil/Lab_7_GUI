package lab_7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class LibraryItemWindow {

	public JFrame libraryItems;
	
	public JButton borrowButton = new JButton("Borrow");
	
	public JTextField itemNameText = new JTextField();
	public JTextField quntityText = new JTextField();
	public JButton returnButton = new JButton("Return");
	public JButton backHomeBorrowButton = new JButton("Back to Home Page");
	public JLabel lblNewLabel = new JLabel("Quantity");
	public JLabel lb = new JLabel("Item name");

	/**
	 * Create the application.
	 */
	public LibraryItemWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		quntityText.setColumns(10);
		itemNameText.setColumns(10);
		libraryItems = new JFrame();
		libraryItems.setBounds(100, 100, 450, 300);
		libraryItems.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libraryItems.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance()
				.createLabel("Please enter the itme name and quantity and click Borow /Return");
		libraryItems.getContentPane().add(lblNewJgoodiesLabel);
		
		libraryItems.getContentPane().add(lb);
		
		libraryItems.getContentPane().add(itemNameText);
		
		libraryItems.getContentPane().add(lblNewLabel);
		
		libraryItems.getContentPane().add(quntityText);
		
		libraryItems.getContentPane().add(returnButton);

		libraryItems.getContentPane().add(borrowButton);
		
		libraryItems.getContentPane().add(backHomeBorrowButton);
	}

}
