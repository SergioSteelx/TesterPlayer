package Tester;

public class Tester 
{
	public void testDvd(DVDPlayer dvd)
	{
		System.out.println("Reproductor DVD");
		dvd.turnON();
		dvd.play();
		dvd.stop();
		dvd.turnOFF();
	}
	
	public void testMp3(MP3Player mp3)
	{
		System.out.println("Reproductor MP3");
		mp3.turnON();
		mp3.play();
		mp3.stop();
		mp3.turnOFF();
	}
	
	public void testBlueRay(BlueRayPlayer br)
	{
		System.out.println("Reproductor BlueRay");
		br.turnON();
		br.play();
		br.stop();
		br.turnOFF();
	}
	
}
