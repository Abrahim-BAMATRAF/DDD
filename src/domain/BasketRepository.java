package domain;

public interface BasketRepository {
	
	public Basket findBasketById(BasketId basketId);
	
	public void save(Basket basket);

}
