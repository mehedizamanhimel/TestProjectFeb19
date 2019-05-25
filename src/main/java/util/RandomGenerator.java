package util;

import java.util.Random;

import net.bytebuddy.utility.RandomString;

public class RandomGenerator {
	
	public String randomMobileNumberGenerator() {
		int mobileNumber;
		Random randOne = new Random();
		mobileNumber = randOne.nextInt(99999999);
		return "011"+mobileNumber;
	}
	
	public String randomeString() {
		String string ;
		RandomString rand = new RandomString();
		string = rand.nextString();

		return "mehedizaman"+string+"@gmail.com";
	}

}
