package Tester;

public class DVDPlayer implements Device
{
	public void nombre()
	{
		System.out.println("Reproductor DVD");
	}
	public void turnON()
	{
		System.out.println("Encender Reproductor");
	}
	
	public void play()
	{
		System.out.println("Reproducir");
	}
	
	public void stop()
	{
		System.out.println("Detener");
	}
	
	public void turnOFF()
	{
		System.out.println("Apagar Reproductor");
	}

}
