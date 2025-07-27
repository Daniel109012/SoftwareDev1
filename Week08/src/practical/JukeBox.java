package practical;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class JukeBox {
	
	private Queue<Song> playlist;
	
	public JukeBox() {
		playlist = new LinkedList<>();
	}
	
	public void addSong(Song s) {
//		addSong(Song s)						||	add a song to the playlist
		playlist.add(s);
	}
	
	public void addSong(Collection <Song> songs) {
//	addSongs(Collection <Song> songs)	||	add a collection of songs to the playlist
		playlist.addAll(songs);
	}
	
	public void play() {
//	play()		||	play the next song in the playlist and remove it from the playlist
		String output;
		Song song = playlist.poll();
		if(song != null){
			output = ("Playing: " + song.getTitle());

		}else{
			output = ("playlist is empty.");

		}
		JOptionPane.showMessageDialog(null, output);
	}
	
	public void printPlayList() {
//	printPlayList()						||	print all songs in the playlist.
		StringBuilder output = new StringBuilder();
		if(playlist.isEmpty()) {
			output.append(" playlist is Empty");
		}else {
			output.append("Current Playlist: \n");
			for (Song song : playlist) {
				output.append("- ").append(song.getTitle()).append("\n");
			}
		}

		JOptionPane.showMessageDialog(null, output.toString());

	}
	
	public void size() {
//	size()								||	print the size of the playlist
		 String output;
		 output = ("Playlist Size: " + playlist.size());
		 JOptionPane.showMessageDialog(null, output);
	 }
	
	
//	addSongs(Collection <Song> songs)	||	add a collection of songs to the playlist


}
