package domain;

public class CommandLine {
	private final Reference product;
	private int quantity;
	private int price;
	
	public CommandLine(Reference prod, int q){
		this.product = prod;
		this.setQuantity(q);
		this.price = q * product.getPrice();
		
	}

	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Reference getReference(){
		return this.product;
	}
}
