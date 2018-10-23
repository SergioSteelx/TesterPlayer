package Tester;

public class Smartphone implements Device
{
	public void nombre()
	{
		System.out.println("Reproductor Smartphone");
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
