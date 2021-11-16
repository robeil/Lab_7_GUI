package lab_7;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.io.EOFException;

import javax.swing.JOptionPane;

public class Program {

	private static Student student;
	private static LibraryMember libraryMember;
	private static Faculty faculty;

	private static final double BOOKFEE = 0.25;
	private static final double MAGAZINEFEE = 0.10;
	private static final double CDFEE = 0.05;

	private static final double BOOKPRICE = 5.99;
	private static final double MAGAZINESUBSCRIPTION = 9.99;
	private static final double CDPRICE = 5.99;

	private static LibraryMaintains libraryMaintains;
	private static LibraryItemWindow libraryItemWindow;
	private static RegisterMember registerNewMember;
	private static addPublicationWindow addPublicationWindow;

	// private static List<User> users = new ArrayList<User>();
	private static List<Item> items = new ArrayList<Item>();
	private static List<Members> members = new ArrayList<Members>();

	/**
	 * Launch the application.
	 * 
	 * @throws ClassNotFoundException
	 */

	public static void main(String[] args) throws ClassNotFoundException, StreamCorruptedException {

		File file = new File("/Users/robeilaregawi/Desktop/NewGuiFolder/newGui/src/lab_7/Libraryfile.txt");

		// reading the memebr file from the array
		if (file.isFile() && file.canRead()) {
			// reading form file
			try {
				FileInputStream fs = new FileInputStream(file);
				ObjectInputStream fo = new ObjectInputStream(fs);

				members = (List<Members>) fo.readObject();

				fo.close();
				fs.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

			// reading the items from the array
			try {

				FileInputStream fs = new FileInputStream(file);
				ObjectInputStream fo = new ObjectInputStream(fs);

				items = (List<Item>) fo.readObject();

			} catch (IOException i) {
				i.printStackTrace();
			}

		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {

					libraryMaintains = new LibraryMaintains();
					libraryItemWindow = new LibraryItemWindow();
					registerNewMember = new RegisterMember();
					addPublicationWindow = new addPublicationWindow();
					libraryMaintains.LibraryMaintains.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
				// going to the registraiton window
				libraryMaintains.registerButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						// making reguster page visible
						registerNewMember.registerNewMember.setVisible(true);

					}

				});

				// registering new memebr
				registerNewMember.registerMemberButton.addActionListener(new ActionListener() { // FIXME ===> ????

					public void actionPerformed(ActionEvent e) {

						String newName = registerNewMember.newNameText.getText().toUpperCase();
						String newType = registerNewMember.memberTypeText.getText().toUpperCase();

						int i = 0;

						if (members != null) {

							// looping the array if the user is already exist or not
							for (i = 0; i < members.size(); i++) {

								if (members.get(i).equals(newName)) {

									JOptionPane.showMessageDialog(registerNewMember.registerMemberButton,
											"You are already registerd");
									break;
								}
							}
						}

						if (members == null || members.size() == i) {

							// adding the new user to the array
							Members add1 = new Members(newName, newType);
							members.add(add1);
							JOptionPane.showMessageDialog(registerNewMember.registerMemberButton,
									newName + " Registered as " + newType);
							// cleaning the text area

						}
						registerNewMember.newNameText.setText(" ");
						registerNewMember.memberTypeText.setText(" ");

					}
				});

				// going to publciation window
				libraryMaintains.addpublicationButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						addPublicationWindow.addPubicationWindow.setVisible(true);
					}
				});

				// adding new publication to the library system
				addPublicationWindow.addPublication.addActionListener(new ActionListener() {

					int addedQuantity = 0;

					public void actionPerformed(ActionEvent e) {

						String addedName = addPublicationWindow.addTypeText.getText();
						String addedNumber = addPublicationWindow.addQuantity.getText();
					
						if (addedName != null & addedNumber != null) {
							// adding the new items to the library
							Item publication1 = new Item(addedName, addedNumber);
							// adding to the item ArryList
							items.add(publication1);
							JOptionPane.showMessageDialog(addPublicationWindow.addPublication,
									addedNumber + " " + addedName + "(s) added.");
						} else {
							JOptionPane.showMessageDialog(addPublicationWindow.addPublication,
									"Input can not be empty");
						}
						// cleaning the text field area
						addPublicationWindow.addTypeText.setText(" ");
						addPublicationWindow.addQuantity.setText(" ");

					}

				});
				// taking student user to the first page
				libraryMaintains.studentButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						libraryItemWindow.libraryItems.setVisible(true);

					}

				});

				// taking the memebr user to the first page
				libraryMaintains.memberButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						libraryItemWindow.libraryItems.setVisible(true);

					}

				});
				// taking faculty user to the first page
				libraryMaintains.facultyButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						libraryItemWindow.libraryItems.setVisible(true);

					}

				});

				// taking user from the libraryitmewindow to the home page
				libraryItemWindow.backHomeBorrowButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						libraryMaintains.LibraryMaintains.setVisible(true);
					}

				});

				// taking user from the libraryitmewindow to the home page
				registerNewMember.backHomeRegisterButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						libraryMaintains.LibraryMaintains.setVisible(true);
					}

				});

				// taking user from the libraryitmewindow to the home page
				addPublicationWindow.backHomeFromPublicationbutton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						libraryMaintains.LibraryMaintains.setVisible(true);
					}

				});

				// borrowing item and give info when to return
				libraryItemWindow.borrowButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						String borrowing = libraryItemWindow.itemNameText.getText();
						String number = libraryItemWindow.quntityText.getText();
						
						JOptionPane.showMessageDialog(libraryItemWindow.borrowButton, "You are borrowing "+ number +" "+borrowing);
						
						libraryItemWindow.itemNameText.setText(" ");
						libraryItemWindow.quntityText.setText(" ");
						//trying to print the info and call the method
						super.toString();
						borrowing();
					
					}
					
				});

				// returning item check if there is overdue fee
				libraryItemWindow.returnButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						String returning = libraryItemWindow.itemNameText.getText();
						String number = libraryItemWindow.quntityText.getText();

						JOptionPane.showMessageDialog(libraryItemWindow.borrowButton, "You are returnig "+ number +" "+returning);
						
						libraryItemWindow.itemNameText.setText(" ");
						libraryItemWindow.quntityText.setText(" ");
					}

				});

				// exit button
				libraryMaintains.exitButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						closeApp();

					}

				});

			}

			// borrowing any book
			void borrowing() {
				// checking if the user is student
				if (members.equals(student)) {

					if (Integer.parseInt(libraryItemWindow.quntityText.getText()) > student.getSTUDENTALLOWANCE()) {

						JOptionPane.showMessageDialog(libraryItemWindow.borrowButton,
								"You allowed to borrow only 5 Publications for 2 weeks");
					} else {

						if (items.size() > Integer.parseInt(libraryItemWindow.quntityText.getText())) {
							items.remove(libraryItemWindow.itemNameText.getText());
							JOptionPane.showMessageDialog(libraryItemWindow.borrowButton, "You are borrowing "
									+ Integer.parseInt(libraryItemWindow.quntityText.getText()) + "For 2 weeks");
						}

					}

					// checking if the user is library member
					if (members.equals(faculty)) {

						if (Integer.parseInt(libraryItemWindow.quntityText.getText()) > faculty.getFACULTYALLOWANCE()) {

							JOptionPane.showMessageDialog(libraryItemWindow.borrowButton,
									"You only allowed to borrow 10 Publications for 4 weeks");
						} else {

							if (items.size() > Integer.parseInt(libraryItemWindow.quntityText.getText())) {
								items.remove(libraryItemWindow.itemNameText.getText());
								JOptionPane.showMessageDialog(libraryItemWindow.borrowButton, "You are borrowing "
										+ Integer.parseInt(libraryItemWindow.quntityText.getText()) + "For 4 weeks");

							}
						}
					}
				}
			}

			// closing all the window
			void closeApp() {

				// writing the members form the array to the file
				try {

					FileOutputStream fo = new FileOutputStream(
							"/Users/robeilaregawi/Desktop/NewGuiFolder/newGui/src/lab_7/Libraryfile.txt", true);
					ObjectOutputStream oos = new ObjectOutputStream(fo);

					for (Members m : members) {
						oos.writeObject(m);
					}

					// looping the array and write to the file
					fo.close();
					oos.close();

				} catch (Exception e) {
					e.printStackTrace();
				}

				// writing the items from the array to the file
				try {

					FileOutputStream fo = new FileOutputStream(
							"/Users/robeilaregawi/Desktop/NewGuiFolder/newGui/src/lab_7/Libraryfile.txt", true);
					ObjectOutputStream oos = new ObjectOutputStream(fo);

					// looping the array and write to the file
					for (Item i : items) {
						oos.writeObject(i);
					}
					oos.close();
					fo.close();

				} catch (Exception e) {
					e.printStackTrace();
				}

				// closing the windows
				System.exit(0);
			}
		});
	}

}
