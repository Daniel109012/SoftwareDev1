package practical;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class PostOfficeQueueSimulator {
	
	private Queue<Person> queue;
	
	public PostOfficeQueueSimulator() {
		queue = new LinkedList<>();
	}
	
	public void add(Person p) {
//		add(Person p)	||	add the person p to the back of the queue
		
		String output;
		queue.add(p);
		output = p.getName() + " has joined the list";
		JOptionPane.showMessageDialog(null, output);
	}
	
	
	public void serve() {
//	serve()			||	remove a person from the front of the queue
		
		String output;
		
		if(!queue.isEmpty()) {
			Person served = queue.poll();
			output = (served.getName() + " has been served");
			JOptionPane.showMessageDialog(null, output);
		}else {
			output = (" no one is in the list to be served");
			JOptionPane.showMessageDialog(null, output);
		}
		
	}
	
	public int queueLength() {
//	queueLength()	||	return the number of people in the queue
		
		return queue.size();
		
	}
	
	public void printQueue() {
//	printQueue()	||	print the names of all of the people in the queue
	
		String output;
		if(queue.isEmpty()) {
			output = ("List is Empty");
			JOptionPane.showMessageDialog(null, output);
		}else {
			output = ("Current List");
			JOptionPane.showMessageDialog(null, output);
			for(Person p : queue) {
				output = (" " + p.getName());
				JOptionPane.showMessageDialog(null, output);
			}
		}
		
	}
	
	public void whoseAt(int x) {
//	whoseAt(int x)	||	print the name of the person at position x in the queue
		
		String output;
		if(x < 0 || x > queue.size()) {
			output = (" Invalid input no Person available on this Entry ");
			JOptionPane.showMessageDialog(null, output);
		}
		Person[] people = queue.toArray(new Person[0]);
		output = (" Person at the input " + x + " : " + people[x].getName());
		JOptionPane.showMessageDialog(null, output);
		
	}
	
	public void whoseAtFront() {
//	whoseAtFront()	||	print the name of the person at the front of the queue
		
		String output;
		if(!queue.isEmpty()) {
			output = (" Current Person at front : " + queue.peek().getName());
			JOptionPane.showMessageDialog(null, output);
		}else {
		output = (" List is Empty ");
		JOptionPane.showMessageDialog(null, output);
		}
		
	}

}//end class PostOfficeQueueSimulator
