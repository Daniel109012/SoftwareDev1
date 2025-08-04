package question01;

public class Lecture {
	
	String name;
	int duration;
	
	public Lecture(String name, int duration) {
		this.name = name;
		this.duration = duration; //minutes
	}
	

	public String toString() {
		String output;
		output = "name: " + name + "(" + duration + " mins)";
		return output;
	}

}
