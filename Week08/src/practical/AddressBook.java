package practical;

import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class AddressBook {
	
	private TreeMap<String, String> addressBook;
	
	
	public AddressBook() {
		addressBook = new TreeMap<>();
	}
	

//	Adds an entry by prompting the user
	public void addEntry() {
		String name = JOptionPane.showInputDialog("Enter Name: \n");
		String address = JOptionPane.showInputDialog("Enter address: \n");
		addEntry(name, address);
		
	}

//  Adds an entry with given name and address
	public void addEntry(String name, String address) {
		addressBook.put(name, address);
		JOptionPane.showMessageDialog(null, "Entry added for " + name);
	}
	


    public void deleteEntry() {
        String key = JOptionPane.showInputDialog("Enter the name to delete:");
        deleteEntry(key);
    }

	
//	Deletes an Entry by Key
	public void deleteEntry(String key) {
		if (addressBook.containsKey(key)) {
			addressBook.remove(key);
			JOptionPane.showMessageDialog(null, "Entry for " + key + " removed.");
		}else {
			JOptionPane.showMessageDialog(null, "No entry found for " + key);
		}
	}
	
	public void displayContents() {
		if(addressBook.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Address Book is Empty.");
		}else {
			StringBuilder output = new StringBuilder("Address Book Contents: \n");
			for(Map.Entry<String, String> entry : addressBook.entrySet()) {
				output.append("Name: " + entry.getKey() + " | Address: " + entry.getValue() + "\n");
			}
			JOptionPane.showMessageDialog(null, output.toString());
		}
			
	}
	
	public void go() {
		while (true) {
			String choice = JOptionPane.showInputDialog(
	                "Address Book Menu:\n" +
	                "1. Add Entry\n" +
	                "2. Delete Entry\n" +
	                "3. Display Contents\n" +
	                "4. Exit\n" +
	                "Choose an option:"
			);
			
			if(choice == null) break;
			
			switch(choice) {
			case "1":
				addEntry();
				break;
			case "2":
				deleteEntry();
				break;
			case "3":
				displayContents();
				break;
			case "4":
				JOptionPane.showMessageDialog(null, "Exit Address Book.");
				return;
			default:
				JOptionPane.showMessageDialog(null, "Invalid Option. Please try again.");

			}
			


		}
	}
	

}
