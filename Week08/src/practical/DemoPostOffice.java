package practical;

import javax.swing.JOptionPane;

public class DemoPostOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String output;
		
		PostOfficeQueueSimulator p1 = new PostOfficeQueueSimulator();
		
		p1.add(new Person("Alice"));
		p1.add(new Person("John"));
		p1.add(new Person("Carlos"));
		
		p1.printQueue();
		p1.whoseAtFront();
		p1.whoseAt(2);
		
		p1.serve();
		p1.printQueue();
		
		output = ("List Length: " + p1.queueLength());
		JOptionPane.showMessageDialog(null, output);

	}

}
