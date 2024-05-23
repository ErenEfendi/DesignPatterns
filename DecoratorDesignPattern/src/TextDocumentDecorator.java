
public class TextDocumentDecorator implements TextDocument{

	private TextDocument document;
	
	public TextDocumentDecorator(TextDocument document) {
		super();
		this.document = document;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return document.getText();
	}

	@Override
	public void printDocument() {
		System.out.println(getText());
		
	}

}
