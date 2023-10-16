package exercise.composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IComponent{

    public String playlistName;
    public float playbackSpeed;
    public ArrayList<IComponent> playlist = new ArrayList();

    public List<IComponent> getAllSongs(){
        return playlist;
    }

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void add(IComponent song) {
        playlist.add(song);
    }

    public void add(Playlist newPlaylist){
        for (IComponent song : newPlaylist.getAllSongs()){
            playlist.add(song);
        }
    }

    public void setPlaybackSpeed(float speed) {
        this.playbackSpeed = speed;
    }

    @Override
    public void play() {
        for (IComponent song: playlist){
            song.play();
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }
}
