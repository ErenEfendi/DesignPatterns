package MediaPlayerApplication;

public class AudioPlayer {

	public void playAudio(String audioFile) {
		System.out.println("Playing audio file: "+audioFile);
	}
	
	public void stopAudio() {
		System.out.println("Stopping audio playback.");
	}
}

class VideoPlayer{
	
	public void playVideo(String videoFile) {
		System.out.println("Playing video file: "+videoFile);
	}
	
	public void stopVideo() {
		System.out.println("Stopping video playback.");
	}
}

class PlaylistManager{
	
	public void addToPlaylist(String mediaFile) {
		System.out.println("Adding "+mediaFile+" to the playlist");
	}
	
	public void removeFromPlaylist(String mediaFile) {
		System.err.println("Removing "+ mediaFile+" from the playlist");
	}

	public void playNext() {
		System.out.println("Playing next item in the playlist.");
	}
}

