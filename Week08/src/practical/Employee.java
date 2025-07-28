package practical;

public class Employee {
	private String name;
	private String position;
	
	public Employee(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String toString() {
		return name + " - " + position + "\n";
		
	}
	
}
