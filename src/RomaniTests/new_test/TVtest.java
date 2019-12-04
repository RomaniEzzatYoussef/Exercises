package RomaniTests.new_test;

public class TVtest {
	
	public static void main(String[] args)
	{
		TV romani = new TV();
		romani.turnOn();
		romani.setChannel(30);
		romani.setVolume(3);
		romani.channelDown();
		romani.volumeUp();
		
		System.out.println("Romani Object's TV is " + romani.on + "  in channel " + romani.channel + " and volume " + romani.volumeLevel);
		
		TV beshoy = new TV();
		beshoy.turnOn();
		beshoy.setChannel(1100);
		beshoy.setVolume(7);
		beshoy.channelUp();
		beshoy.volumeUp();
		beshoy.turnOff();
		
		System.out.println("Beshoy Object's TV is " + beshoy.on + " in channel " + beshoy.channel + " and volume " + beshoy.volumeLevel);
	}

}
