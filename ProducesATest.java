public class ProducesATest {
	public static void main(String[] args) {
		Kid kd = new Kid();
		Alphabet alpha = kd.writingAlphabet();
		System.out.println("Kid is writing ");
        alpha.showAlphabet();
        System.out.println("-------------------");
        
        Toddler tod = new Toddler();
        Word wd = tod.writingWord();
        System.out.println("Toddler is writing");
        wd.showWord();
        System.out.println("--------------------");
		
	}
}
class infant {}

class Kid extends infant //isA
{
	Alphabet writingAlphabet()
	{
		Alphabet a = new Alphabet ('G');
		return a;
	}
}
class Toddler extends Kid
{
	Word writingWord()
	{
		Word w = new Word("Ganesha");
		return w;
	}
}

class Alphabet
{
	char alpha;
	
	Alphabet(){}
	
	Alphabet(char a) {
		alpha = a;
	}
	void showAlphabet() {
		System.out.println("Alphabet is : "+alpha);
	}

}
class Word extends Alphabet
{
	String word;
	Word() { }
	
	Word(String w) {
		word = w;
	}
	void showWord() {
		System.out.println("Word is : "+word);
	}
}
class Sentence extends Word
{
	
}
class Paragraph extends Sentence
{
	
}

