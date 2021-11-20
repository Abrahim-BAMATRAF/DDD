package domain;

import java.util.Random;

public class ProductId {
	private final String ref;
	private boolean isUsed;
	
	public ProductId(){
		this.ref = getRandom();
		this.isUsed = false;
	}
	
	public String getRef() {
		return ref;
	}
	
	public boolean isUsed() {
		return isUsed;
	}
	public void used(){
		this.isUsed = true;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductId other = (ProductId) obj;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}

}
