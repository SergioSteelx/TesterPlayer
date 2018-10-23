package Tester;

public class Tester 
{
	private Device device;

	public void test()
	{
		device.nombre();
		device.turnON();
		device.play();
		device.stop();
		device.turnOFF();
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	
	
}
