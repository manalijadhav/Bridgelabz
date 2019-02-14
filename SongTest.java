public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piano p=new Piano();
		Music ref=p.createMusic();
		System.out.println("Music is on...");
		ref.song();
    }
}
class Instrument
{
}
class Music
{	
	void song() {
	System.out.println("Song is on");
}
}
class Piano extends Instrument
{
	
	Music createMusic()
	{
		System.out.println("Music is being produced");
		
		Music m=new Music();
		System.out.println("Music is produced");
		return m;
	}
}

	