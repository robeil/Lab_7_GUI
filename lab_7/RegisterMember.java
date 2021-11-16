package lab_7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class RegisterMember {

	
	public JFrame registerNewMember;
	public JTextField newNameText;
	public JTextField memberTypeText;
	public JButton registerMemberButton;
	public JButton backHomeRegisterButton;
	public JTextPane infonNewMember;


	/**
	 * Create the application.
	 */
	public RegisterMember() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		registerNewMember = new JFrame();
		registerNewMember.setBounds(100, 100, 450, 300);
		registerNewMember.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registerNewMember.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Name");
		registerNewMember.getContentPane().add(lblNewLabel);
		
		newNameText = new JTextField();
		registerNewMember.getContentPane().add(newNameText);
		newNameText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Member type");
		registerNewMember.getContentPane().add(lblNewLabel_1);
		
		memberTypeText = new JTextField();
		registerNewMember.getContentPane().add(memberTypeText);
		memberTypeText.setColumns(10);
		
		infonNewMember = new JTextPane();
		infonNewMember.setEditable(false);
		registerNewMember.getContentPane().add(infonNewMember);
		
		registerMemberButton = new JButton("Regitser");
		registerNewMember.getContentPane().add(registerMemberButton);
		
		backHomeRegisterButton = new JButton("Back to home Page");
		registerNewMember.getContentPane().add(backHomeRegisterButton);
	}

}
