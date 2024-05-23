
public class SpellChecker extends TextDocumentDecorator {

	public SpellChecker(TextDocument document) {
		super(document);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getText() {
		return super.getText().replace("eror", "error");
	}
}
