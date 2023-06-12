import org.example.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTests {
    private Man man;

    @Test(description = "Check if a man is retired")
    public void testIsRetired(){
        man = new Man("Anton", "LastName", 67, "Daria Rymar");
        Assert.assertTrue(man.isRetired());
    }

    @Test(description = "Check if a man isn't retired")
    public void testIsNotRetired(){
        man = new Man("Alex", "Nikishyn",45, "Anna Nikishyn");
        Assert.assertFalse(man.isRetired());
    }
}
