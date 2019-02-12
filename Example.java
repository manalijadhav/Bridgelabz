
public class Example {

	public static void main(String[] args)
	{
			//Words word = new Words();
			

	}
	
	
	
	class Alphabet{ }

	class Words extends Alphabet
	{
		Words createWords()
		{
			System.out.println("Alphabets creating words.......");
			System.out.println("Words are being produced.....");
			Words wrd = new Words();
			System.out.println("Words produced!!!");
			return wrd;
		}
	}
	
	class Sentence extends Words
	{
		Sentence createSentence()
		{
			System.out.println("Words creating sentences.......");
			System.out.println("Sentences are being produced.....");
			Sentence sent = new Sentence();
			System.out.println("Sentence produced!!!");
			return sent;
		}
	}
	
	class Paragraph extends Sentence
	{
		Paragraph createParagraph()
		{
			System.out.println("Sentences creating Paragraph.......");
			System.out.println("Paragraph is being produced.....");
			Paragraph para = new Paragraph();
			System.out.println("Paragraph produced!!!");
			return para;
		}
	}
}

