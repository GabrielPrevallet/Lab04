public class ZooTest
{
	public void ZooTest() throws AssertException
	{
		Zoo zoo = new Zoo(2);
    	Animal Panda = new Animal ("black", "Panda", 2.5, .5);
    	Animal Ape = new Animal ("brown", "Ape", 7.5, 1.5);

		
		Assert.assertEquals(2, zoo.getCapacity());
		Assert.assertEquals(2, zoo.getAnimals().length);
		zoo.addAnimal(Panda);
		Assert.assertEquals(2, zoo.getAnimals().length);
		Assert.assertEquals(.5, zoo.getTotalHeight());
		Assert.assertEquals(2, zoo.getAverageWeight());
		Assert.assertEquals(0, zoo.getAverageWeight("brown"));
		zoo.addAnimal(Ape);
		Assert.assertEquals(5, zoo.getAverageWeight());
		Assert.assertEquals(2.0,zoo.getTotalHeight() );
		Assert.assertEquals(2,zoo.getAnimals().length );
		

		
	}
}