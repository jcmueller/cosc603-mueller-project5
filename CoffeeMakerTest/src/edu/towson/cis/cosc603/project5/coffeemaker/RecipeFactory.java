package edu.towson.cis.cosc603.project5.coffeemaker;



/**
 * The class <code>RecipeFactory</code> implements static methods that return instances of the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 4/27/16 10:45 PM
 * @author jeek
 * @version $Revision: 1.0 $
 */
public class RecipeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 4/27/16 10:45 PM
	 */
	private RecipeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Recipe}</code>.
	 *
	 * @generatedBy CodePro at 4/27/16 10:45 PM
	 */
	public static Recipe createRecipe() {
		return new Recipe();
	}
}