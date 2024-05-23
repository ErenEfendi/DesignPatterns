package MediaPlayerApplication;

public class MediaPlayerClient {

	public static void main(String[] args) {
		

		MediaPlayerFacade facade = new MediaPlayerFacade();
		facade.playAudio("song.mp3");
		facade.playVideo("movie.mp4");
		facade.addToPlayList("song.mp3");
		facade.addToPlayList("movie.mp4");
		facade.playNextInList();
	}

}
