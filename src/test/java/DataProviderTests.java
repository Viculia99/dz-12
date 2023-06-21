import org.testng.annotations.DataProvider;

public class DataProviderTests {
    @DataProvider(name="age")
    public static Object [][] ageDataProvider(){
        return new Object[][]{{59},{60},{61},{64}, {65}, {35}};
    }

    @DataProvider(name="lastName")
    public static Object [][] lastNameDataProvider(){
        return new Object[][]{{"Daria"}, {"Bilyk"}, {63}, {"Anton Rymar"}};
    }

    @DataProvider(name="deregisterPartnership")
    public static Object [][] partnerDivorcedDataProvider(){
        return new Object[][]{{"Daria"}, {"Bilyk"}, {63}, {null}};
    }
}