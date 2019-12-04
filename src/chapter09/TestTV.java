package chapter09;
/**
 *
 * 10/04/2019   5:08:37 AM
 *  
 * @author Romani Ezzat
 *
 *
 * TestTV
 *
 */
public class TestTV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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
