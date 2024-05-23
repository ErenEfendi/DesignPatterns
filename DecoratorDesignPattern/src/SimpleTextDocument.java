
public class SimpleTextDocument implements TextDocument {

	private String text;
	
	
	

	public SimpleTextDocument(String text) {
		super();
		this.text = text;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return text;
	}

	@Override
	public void printDocument() {
		System.out.println(getText());
		
	}

	

}
