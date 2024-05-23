

//Main class to demonstrate decorations
public class Main {
 public static void main(String[] args) {
	 String input = "This is an eror in the document.";
	 System.out.println("Input: " + input + "\n");
     TextDocument document = new SimpleTextDocument("This is an eror in the document.");

     // Decorate with SpellChecker
     TextDocument spellCheckedDoc = new SpellChecker(document);
     System.out.println("SpellChecked Document:");
     spellCheckedDoc.printDocument();

     // Further decorate the spell-checked document with Formatter
     TextDocument formattedDoc = new Formatter(spellCheckedDoc);
     System.out.println("\nFormatted Document:");
     formattedDoc.printDocument();

     // Decorate original document with Watermark
     TextDocument watermarkedDoc = new WaterMark(document, "Confidential");
     System.out.println("\nWatermarked Document:");
     watermarkedDoc.printDocument();
 }
}