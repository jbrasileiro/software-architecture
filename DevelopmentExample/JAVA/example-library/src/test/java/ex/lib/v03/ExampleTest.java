package ex.lib.v03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExampleTest {

    // Uses constants to dive a meaning to the variable : NULL, NO_VALUE, INITAL_VALUE...
    private static final Long NULL_LONG = null;

    private Example example;

    /*
     * Uses @Before to unsure the initial state, it will be executed before each @Test method.
     */
    @Before
    public void setup() {
        System.out.println("$ - executing @Before");
        example = new Example();
    }

    /*
     * Write posite test.
     */
    @Test
    public void toStringLocale() {
        System.out.println("$ - executing the test");

        String result = example.toString(1000L);

        Assert.assertEquals("example+[G]=(AD)-[yyyy]=(2018)'[MM]=(09)'[dd]=(19)-[a]=(PM)'[HH]=(13)'[mm]=(16)'[ss]=(02)'[SSSSSS]=(000141)'[Z]=(-0300)+500.000,00", result);
    }

    /*
     * Write test for NULL values..
     */
    @Test
    public void toStringLocaleWithNull() {
        System.out.println("$ - executing the test");

        String result = example.toString(NULL_LONG);

        Assert.assertEquals("example+[G]=(AD)-[yyyy]=(2018)'[MM]=(09)'[dd]=(19)-[a]=(PM)'[HH]=(13)'[mm]=(16)'[ss]=(02)'[SSSSSS]=(000141)'[Z]=(-0300)+null", result);
    }
}
