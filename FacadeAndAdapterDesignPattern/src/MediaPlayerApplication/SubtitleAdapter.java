package MediaPlayerApplication;

public class SubtitleAdapter implements SubtitleRenderer{

	private ThirdPartySubtitleService subtitleService;
	
	
	
	public SubtitleAdapter(ThirdPartySubtitleService subtitleService) {
		super();
		this.subtitleService = subtitleService;
	}



	@Override
	public void renderSubtitle(String subtitleText) {
		
		subtitleService.displaySubtitle(subtitleText);
	}

}
