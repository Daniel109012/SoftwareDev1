package question01;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PostgraduateDiploma {
	String programName;
	List<Module> modules;
	
	public PostgraduateDiploma(String programName) {
		this.programName = programName;
		this.modules = new ArrayList<>();
	}
	
	public void addModule(Module module) {
		modules.add(module);
	}
	
	public void displayProgram() {
		StringBuilder output = new StringBuilder("PostGraduate Diploma: " + programName + "\n");
		for(Module module : modules) {
			output.append(module.toString());
		}
		JOptionPane.showMessageDialog(null, output.toString());
	}

}
