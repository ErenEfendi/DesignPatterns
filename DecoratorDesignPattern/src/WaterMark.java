
public class WaterMark extends TextDocumentDecorator{

	private String waterMark;
	public WaterMark(TextDocument document, String waterMark) {
		super(document);
		this.waterMark = waterMark;
	}
	
	@Override
	public String getText() {
		return super.getText() + "\nWatermark: "+waterMark;
	}

}
