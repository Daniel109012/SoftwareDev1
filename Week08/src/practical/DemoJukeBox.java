package practical;

import java.util.Collection;
import java.util.LinkedList;

public class DemoJukeBox {

	public static void main(String[] args) {
		JukeBox jukeBox = new JukeBox();
		

        Song s1 = new Song("Bohemian Rhapsody");
        Song s2 = new Song("Imagine");
        Song s3 = new Song("Hotel California");
        
        jukeBox.addSong(s1);
        jukeBox.addSong(s2);
        
        jukeBox.printPlayList();
        jukeBox.size();
        
        jukeBox.play();
        jukeBox.printPlayList();
        jukeBox.size();
        
        Collection <Song> moreSongs = new LinkedList<>();
        moreSongs.add(s3);
        moreSongs.add(new Song("StairWay to Heaven"));
        
        jukeBox.addSong(moreSongs);
        jukeBox.printPlayList();
        jukeBox.size();
	}

}
