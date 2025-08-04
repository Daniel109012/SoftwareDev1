package question01;

import java.util.ArrayList;
import java.util.List;

public class Module {
	
	String title;
	List <Lecture> lectures;
	
	public Module(String title) {
		this.title = title;
		this.lectures = new ArrayList<>();
	}
	
	public void addLecture(Lecture lecture) {
		lectures.add(lecture);
	}
	
	public String toString() {
		
		StringBuilder output = new StringBuilder ("Module: " + title + "\nLectures: \n");
		for(Lecture lecture : lectures) {
			output.append(lecture.toString()).append("\n");
		}
		return output.toString();
		
	}

}
