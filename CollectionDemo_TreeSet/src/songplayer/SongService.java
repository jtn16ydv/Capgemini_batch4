package songplayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SongService {

	public void start() {
		// getSongList from songlist.txt file
		List<Song> songs = getSongs();

		// Display song list
		System.out.println("---------Before Sorting------------");
		for (Song song : songs) {
			System.out.println(song.getTitle() + " : " + song.getSinger());
		}
		// tile based sorting
		//Collections.sort(songs,(s1,s2)->s1.getTitle().compareTo(s2.getTitle()));
//		Collections.sort(songs,new Comparator<Song>() {
//			@Override
//			public int compare(Song s1, Song s2) {
//				return s1.getTitle().compareTo(s2.getTitle());
//			}
//		});
		TreeSet<Song> sortedSet = new TreeSet<>(songs);
		// Display song list
		System.out.println("---------Song Title Based Sorting------------");
//		for (Song song : songs) {
//			System.out.println(song.getTitle() + " : " + song.getSinger());
//		}
		
		for (Song song : sortedSet) {
			System.out.println(song.getTitle() + " : " + song.getSinger());
		}

		

	}

	private List<Song> getSongs() {
		List<Song> songList = new ArrayList<>();
		try {
			File file = new File("songlist.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split("/");
				Song song = new Song();
				song.setTitle(tokens[0]);
				song.setSinger(tokens[1]);
				song.setRating(Integer.parseInt(tokens[2]));
				song.setYear(tokens[3]);
				songList.add(song);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return songList;
	}

}
