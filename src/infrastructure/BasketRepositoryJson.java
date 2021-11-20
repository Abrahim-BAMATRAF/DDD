package infrastructure;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import domain.Basket;
import domain.BasketId;
import domain.BasketRepository;

public class BasketRepositoryJson implements BasketRepository {
	

	@Override
	public Basket findBasketById(BasketId basketId) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		Reader reader;
		try {
			reader = Files.newBufferedReader(Paths.get(basketId.getId()+".json"));
			Basket basket = gson.fromJson(reader,Basket.class);
			reader.close();
			return basket;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
		
	@Override
	public void save(Basket basket) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		try {
			Writer writer = new FileWriter(basket.getIdString()+".json");
			gson.toJson(basket, writer);
			writer.close();
		} catch (JsonIOException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
