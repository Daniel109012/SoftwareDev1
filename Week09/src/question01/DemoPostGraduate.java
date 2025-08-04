package question01;

public class DemoPostGraduate {

	public static void main(String[] args) {
		//Create Lectures
		
		Lecture L1 = new Lecture("Intro to Java", 45);
		Lecture L2 = new Lecture("Object Oriented Concepts", 50);
		Lecture L3 = new Lecture("Exception Handling", 40);
		
		//Create Module and add Lectures
		Module M1 = new Module("Java Programming");
		M1.addLecture(L1);
		M1.addLecture(L2);
		M1.addLecture(L3);
		
		Module M2 = new Module("Advanced Java");
		M2.addLecture(new Lecture("Multithreading", 55));
		M2.addLecture(new Lecture("Streams API", 50));
		M2.addLecture(new Lecture("ArrayListting ", 45));
		
		//Create post Graduate Diploma and add Modules
		PostgraduateDiploma diploma = new PostgraduateDiploma("Software Development");
		diploma.addModule(M1);
		diploma.addModule(M2);
		
		//DIsplay the Program
		diploma.displayProgram();
		
		

	}

}
