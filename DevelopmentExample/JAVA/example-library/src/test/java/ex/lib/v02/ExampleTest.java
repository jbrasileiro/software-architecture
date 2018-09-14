package ex.lib.v02;

import java.util.Locale;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleTest {

    // Uses constants to dive a meaning to the variable : NULL, NO_VALUE, INITAL_VALUE...
    private static final String NULL_STRING = null;
    private Example example;

    /*
     * Uses @BeforeClass to unsure the initial state for all test,
     * or in case to backup the current value.
     *
     */
    private static Locale PREVIOUS_LOCALE;
    @BeforeClass
    public static void beforeClass() {
        System.out.println("$ - executing @BeforeClass");
        PREVIOUS_LOCALE = Locale.getDefault();
        System.out.println("$ - saving current Locale:" .concat(Locale.getDefault().toString()));
    }

    /*
     * Uses @AfterClass to restore state or values before this class execution,
     *
     */
    @AfterClass
    public static void afterClass() {
        System.out.println("$ - executing @AfterClass");
        System.out.println("$ - current Locale:" .concat(Locale.getDefault().toString()));
        Locale.setDefault(PREVIOUS_LOCALE);
        System.out.println("$ - current Locale:" .concat(Locale.getDefault().toString()));
    }

    /*
     * Uses @Before to unsure the initial state, it will be executed before each @Test method.
     */
    @Before
    public void setup() {
        System.out.println("$ - executing @Before");
        example = new Example();
        Locale.setDefault(Locale.GERMANY);
    }

    /*
     * Uses @After to unsure the initial state, it will be executed after each @Test method.
     */
    @After
    public void cleanUp() {
        System.out.println("$ - executing @After");
    }

    /*
     * Write posite test.
     */
    @Test
    public void toStringLocale() {
        System.out.println("$ - executing the test");

        String input = "ok";

        String result = example.toStringLocale(input);

        Assert.assertEquals("example+de_DE+ok", result);
    }

    /*
     * Write posite test and verify possible NULL values..
     */
    @Test
    public void toStringLocaleWithNull() {
        System.out.println("$ - executing the test");

        String result = example.toStringLocale(NULL_STRING);

        Assert.assertEquals("example+de_DE+null", result);
    }
}
