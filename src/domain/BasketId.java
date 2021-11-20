package domain;

import java.util.Random;

public class BasketId {
	
	private final String ref;
	
	public BasketId(){
		this.ref = getRandom();
	}
	
	public String getId(){
		return this.ref;
	}
	
	
	
    public static String getRandom(){
        Random rand = new Random();
        String total_characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String randomString = "";
         for (int i = 0; i < 20; i++) {
             int index = rand.nextInt(total_characters.length()-1);
             randomString += total_characters.charAt(index);
         }
         return randomString;
     }

}
