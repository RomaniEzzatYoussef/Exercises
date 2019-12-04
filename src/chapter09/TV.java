package chapter09;
/**
 *
 * 13/12/2017   4:51:48 PM
 *  
 * @author roman
 *
 *
 * TV
 *
 */
public class TV
{
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
	public TV()
	{
		
	}
	
	public void turnOn()
	{
		this.on = true;
	}
	
	public void turnOff()
	{
		this.on = false;
	}
	
	public void setChannel(int channel)
	{
		if (on && channel >= 1 && channel <= 120)
			this.channel = channel;
	}
	
	public void setVolumeLevel(int volume)
	{
		if (on && volume >= 1 && volume <= 7)
			this.volumeLevel = volume;
	}
	
	public void channelUp()
	{
		if (on && channel < 120)
			channel++;
	}
	
	public void channelDown()
	{
		if (on && channel > 1)
			channel--;
	}
	
	public void volumeUp()
	{
		if (on && volumeLevel < 7)
			volumeLevel++;
	}
	
	public void volumeDown()
	{
		if (on && volumeLevel > 1)
			volumeLevel--;
	}
	
	public static void main(String args)
	{
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(99);
		tv1.channelUp();
		tv1.setVolumeLevel(7);
		tv1.volumeUp();
		
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tv2's channel is " + tv2.channel + " and volumelevel is " + tv2.volumeLevel);
	}

}
