/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }
    public void fullConstructorTest() throws AssertException
    {
    	Animal Panda = new Animal ("black", "Panda", 19.9, .5);
    	Assert.assertEquals("black", Panda.getColor());
    	Assert.assertEquals("Panda", Panda.getName());
    	Assert.assertEquals(19.9, Panda.getWeight());
    	Assert.assertEquals(.5, Panda.getHeight());

    	Assert.assertEquals(Panda.toString(),"Panda, a black-colored animal. 19.9 pounds, 0.5 inches\n");
    	
    			
    }

    // TODO: test full constructor, getters, and toString
}

