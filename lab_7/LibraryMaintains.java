package lab_7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class LibraryMaintains {

	public JFrame LibraryMaintains;

	public JButton facultyButton = new JButton("Faculty");
	public JButton memberButton = new JButton("Library member");
	public JButton studentButton = new JButton("Student");
	public JButton registerButton = new JButton("Register new user");
	public JButton addpublicationButton = new JButton("Add Publication");
	public  JButton exitButton = new JButton("Exit");
	
	/**
	 * Create the application.
	 */
	public LibraryMaintains() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		LibraryMaintains = new JFrame();
		LibraryMaintains.setBounds(100, 100, 450, 300);
		LibraryMaintains.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LibraryMaintains.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Welcome to our Library");
		LibraryMaintains.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please select any button below that best describe you and thank you ");
		LibraryMaintains.getContentPane().add(lblNewLabel_1);
		
		
		LibraryMaintains.getContentPane().add(studentButton);
		
		
		LibraryMaintains.getContentPane().add(memberButton);
		
		
		LibraryMaintains.getContentPane().add(facultyButton);
		
		LibraryMaintains.getContentPane().add(registerButton);
		
		LibraryMaintains.getContentPane().add(addpublicationButton);
		
		LibraryMaintains.getContentPane().add(exitButton);
	}

}
