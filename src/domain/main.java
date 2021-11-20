package domain;

import infrastructure.BasketRepositoryJson;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Reference ref = new Reference("water", "a bottle of water", 1);
			Reference ref2 = new Reference("OJ", "OJ did it", 2);
			
			CommandLine command1 = new CommandLine(ref, 5);
			CommandLine command2 = new CommandLine(ref2, 10);
			
			Basket basket1 = new Basket();
			
			basket1.addCommand(command1);
			
			System.out.println("the price after adding command1 : expected 5 got : " + basket1.getPrice());
			
			//after validating we can't add
			/*
			basket1.validate();
			basket1.addCommand(command2);
			System.out.println(basket1.getPrice());
			*/
			
			//removing a command
			/*
			basket1.removeProduct(ref);
			System.out.println("the price after removing command1 : expected 0 got : " + basket1.getPrice());
			*/
			
			//testing Gson writing
			
			BasketRepositoryJson repG = new BasketRepositoryJson();
			repG.save(basket1);
			
			//testing Gson reading
			//Basket test = repG.findBasketById(basket1.getId());
			//System.out.println(test.getPrice() == basket1.getPrice());
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		

	}

}
