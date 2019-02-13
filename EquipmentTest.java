public class EquipmentTest
{
    public void emptyConstructorTest() throws AssertException
    {
        Equipment equipment = new Equipment("name/55,1.1,1.2,description");

        Assert.assertEquals("name", equipment.getName());
        Assert.assertEquals(55, equipment.getCount());
        Assert.assertEquals(1.2, equipment.getTotalPrice(), 0.01);
        Assert.assertEquals(1.1, equipment.getTotalWeight(), 0.01);
    }
    public void toStringTest() throws AssertException
    {
    	Equipment equipment = new Equipment("Batarang/5,3.22,700.25,bat-shaped boomerangs");
    	Assert.assertEquals(equipment.toString(),"Name: Batarang, Number: 5, Weight: 3.22 lbs, Price: $700.25 - bat-shaped boomerangs");
    }
}