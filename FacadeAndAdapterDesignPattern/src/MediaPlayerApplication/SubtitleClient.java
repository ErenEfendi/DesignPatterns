package MediaPlayerApplication;

public class SubtitleClient {

	public static void main(String[] args) {

		ThirdPartySubtitleService tps = new ThirdPartySubtitleService();
		SubtitleRenderer sr = new SubtitleAdapter(tps);
		sr.renderSubtitle("Hello World :))))))))");
	}

}
