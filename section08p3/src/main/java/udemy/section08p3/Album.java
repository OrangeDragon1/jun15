package udemy.section08p3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            return false;
        }
        this.songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int listIndex = trackNumber - 1;
        if ((listIndex >= 0) && (listIndex < this.songs.size())) {
            playList.add(this.songs.get(listIndex));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }

}
