package RomaniTests;

public class TV {
	
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
	public TV()
	{
		
	}
	
	public void turnOn()
	{
		on = true;
	}
	
	public void turnOff()
	{
		on = false;
	}
	
	public void setChannel(int newChannel)
	{
		if (on && newChannel > 1 && newChannel <= 3000)
			channel = newChannel;
	}
	
	public void setVolume(int newVolume)
	{
		if (on && newVolume > 1 && newVolume <= 7)
			volumeLevel = newVolume;
	}
	
	public void channelUp()
	{
		channel++;
	}
	
	public void channelDown()
	{
		channel--;
	}
	
	public void volumeUp()
	{
		volumeLevel++;
	}
	
	public void volumeDown()
	{
		volumeLevel--;
	}

}
