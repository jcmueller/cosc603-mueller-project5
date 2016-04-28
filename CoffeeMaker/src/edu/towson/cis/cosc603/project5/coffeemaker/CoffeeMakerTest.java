package edu.towson.cis.cosc603.project5.coffeemaker;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}

	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}

	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}

	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}

	public void testAddInventory1() {
		assertTrue(cm.addInventory(10, 10, 10, 10));
	}

	public void testCheckInventory() {
		assertEquals(i.getCoffee(),cm.checkInventory().getCoffee());
		assertEquals(i.getMilk(),cm.checkInventory().getMilk());
		assertEquals(i.getSugar(),cm.checkInventory().getSugar());
		assertEquals(i.getChocolate(),cm.checkInventory().getChocolate());		
	}

	public void testPurchaseBeverage1() {
		assertEquals(50,cm.makeCoffee(r1, 100));
	}
	/*
	 * Remove these comments to test options
	public void testCheckOptions0(){
		Main main =new Main();
		main.mainMenu();
		fail();
	}
	*/
}