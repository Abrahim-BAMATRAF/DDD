package domain;

public class Reference {
	private final ProductId ref;
	private final String name;
	private final String description;
	private final int price;
	
	
	public Reference(String n, String des, int p) throws Exception{
		if(p <= 0){
			throw new Exception("the price is not higher then zero");
		}
		if(n.length() > 20){
			throw new Exception("the length of the name > 20");
		}
		if(des.length() > 220){
			throw new Exception("the length of the description > 20");
		}
		this.ref = new ProductId();
		this.ref.used();
		this.name = n;
		this.description = des;
		this.price = p;
		
	}
	
	
	public Reference(String n, String des, int p, ProductId id) throws Exception{
		if(p <= 0){
			throw new Exception("the price is not higher then zero");
		}
		if(n.length() > 20){
			throw new Exception("the length of the name > 20");
		}
		if(des.length() > 220){
			throw new Exception("the length of the description > 20");
		}
		if(id.isUsed()){
			throw new Exception("the product id is already used by an other product");
		}
		this.ref = id;
		this.ref.used();
		this.name = n;
		this.description = des;
		this.price = p;
		
	}
	
	
	public int getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public ProductId getRef() {
		return ref;
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
		Reference other = (Reference) obj;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}


	
}
