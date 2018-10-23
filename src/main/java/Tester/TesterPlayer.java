package Tester;

public class TesterPlayer {

	public static void main(String[] args) 
	{
			DVDPlayer dvd = new DVDPlayer();
			MP3Player mp3 = new MP3Player(); 
			BlueRayPlayer br = new BlueRayPlayer();
			
			Tester test = new Tester();
			
			test.testDvd(dvd);
			System.out.println("\n");
			test.testMp3(mp3);
			System.out.println("\n");
			test.testBlueRay(br);
			
	}

}
