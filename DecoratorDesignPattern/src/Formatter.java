
public class Formatter extends TextDocumentDecorator{

	public Formatter(TextDocument document) {
		super(document);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getText() {
		return super.getText().toUpperCase();
	}

}
