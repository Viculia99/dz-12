import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTests {
    private Woman woman;

    @Test(description = "Check if a woman is retired", dataProvider = "age", dataProviderClass = DataProviderTests.class)
    public void testIsRetired(){
        woman = new Woman("Daria", "Bilyk", 63, "Anton Rymar");
        Assert.assertTrue(woman.isRetired());
    }

    @Test(description = "Check if a woman isn`t retired", dataProvider = "age", dataProviderClass = DataProviderTests.class)
    public void testIsNotRetired(){
        woman = new Woman("Anna", "Lebed", 35, "Alex Nikishyn");
        Assert.assertFalse(woman.isRetired());
    }


    @Test(description = "Check the partnership is deregister", dataProvider = "deregisterPartnership", dataProviderClass = DataProviderTests.class)
    public void testDeregisterPartnership(){
        woman = new Woman("Daria", "Bilyk", 63, null);
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(),woman.getLastNameOriginal());
    }

    @Test(description = "Check if getLastName() works", dataProvider = "lastName", dataProviderClass = DataProviderTests.class)
    public void testGetLastNameOriginal(){
        woman = new Woman("Olesia", "Sydorchuk", 61, "Sydorchuk");
        String checkGetter = woman.getLastNameOriginal();
        Assert.assertEquals(checkGetter, woman.getLastNameOriginal());
    }

    @Test(description = "Check if a woman has getLastName() not NULL", dataProvider = "lastName", dataProviderClass = DataProviderTests.class)
    public void testGetLastNameOriginalNotNull(){
        woman = new Woman("Olesia", "Sydorchuk", 61, "Sydorchuk");
        String checkGetter = null;
        Assert.assertNotEquals(woman.getLastNameOriginal(),checkGetter);
    }

    @Test(description = "Check if a woman has setLastName()", dataProvider = "lastName", dataProviderClass = DataProviderTests.class)
    public void testSetLastNameOriginal(){
        woman = new Woman("Anna","Lebed", 35, "Alex Nikishyn");
        String lastName = "test";
        woman.setLastName(lastName);
        Assert.assertEquals(woman.getLastNameOriginal(), lastName);
    }

    @Test(description = "Check if setLastNameO() is not set to NULL", dataProvider = "lastName", dataProviderClass = DataProviderTests.class)
    public void testSetLastNameOriginalNotNull(){
        woman = new Woman("Anna", "Lebed", 35, "Alex Nikishyn");
        String lastName = "test";
        woman.setLastName(lastName);
        Assert.assertNotEquals(woman.getLastNameOriginal(), null);
    }

}