package MediaPlayerApplication;

public class MediaPlayerFacade {

	private AudioPlayer audioPlayer;
	private VideoPlayer videoPlayer;
	private PlaylistManager playListManager;
	
	public MediaPlayerFacade() {
		audioPlayer = new AudioPlayer();
		videoPlayer = new VideoPlayer();
		playListManager = new PlaylistManager();
	}
	
	public void playAudio(String audioFile) {
		audioPlayer.playAudio(audioFile);
	}
	
	public void stopAudio() {
		audioPlayer.stopAudio();
	}
	
	public void playVideo(String videoFile) {
		videoPlayer.playVideo(videoFile);
	}
	
	public void stopVideo() {
		videoPlayer.stopVideo();
	}
	
	public void addToPlayList(String mediaFile) {
		playListManager.addToPlaylist(mediaFile);
	}
	
	public void removeFromPlayList(String mediaFile) {
		playListManager.removeFromPlaylist(mediaFile);
	}
	
	public void playNextInList() {
		playListManager.playNext();
	}
}
