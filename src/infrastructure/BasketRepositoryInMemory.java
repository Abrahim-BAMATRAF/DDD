package infrastructure;

import java.util.HashMap;
import java.util.Map;

import domain.Basket;
import domain.BasketId;
import domain.CommandLine;
import domain.Reference;
import domain.BasketRepository;

public class BasketRepositoryInMemory implements BasketRepository {
	private Map<BasketId, Basket> listBasket = new HashMap<>();

	@Override
	public Basket findBasketById(BasketId basketId) {
		// TODO Auto-generated method stub
		return this.listBasket.get(basketId);
	}

	@Override
	public void save(Basket basket) {
		this.listBasket.put(basket.getId(), basket);
	}
}
