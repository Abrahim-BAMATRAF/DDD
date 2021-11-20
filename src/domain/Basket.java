package domain;

import java.util.HashMap;
import java.util.Map;

public class Basket {
	
	private final BasketId id;
	private Map<Reference,CommandLine> commands;
	private int price;
	private boolean isValidated;
	
	public Basket(){
		this.id = new BasketId();
		this.commands = new HashMap<Reference,CommandLine>();
		this.price = 0;
		this.isValidated = false;
	}
	
	public void addCommand(Reference ref, int q){
		if (!isValidated) {
			CommandLine tmp = new CommandLine(ref, q);
			this.commands.put(ref, tmp);
			this.price += tmp.getPrice();
		}
	}
	
	public void addCommand(CommandLine com){
		if (!isValidated) {
			Reference tmp = com.getReference();
			this.commands.put(tmp, com);
			this.price += com.getPrice();
		}
	}
	
	public int getPrice(){
		return price;
	}
	
	public void removeProduct(Reference ref){
		if(!this.isValidated){
			this.price -= this.commands.get(ref).getPrice();
			this.commands.remove(ref);
		}
	}
	
	public void validate(){
		this.isValidated = true;
	}
	
	public BasketId getId(){
		return this.id;
	}
	
	public String getIdString(){
		return this.id.getId();
	}
	

}
