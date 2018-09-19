package ex.lib.v03;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleTest {

    private static final TimeZone DEFRAULT_TIME_ZONE = TimeZone.getTimeZone("Antarctica/McMurdo");
    private static final Locale DEFAULT_LOCALE = Locale.GERMANY;
    // Uses constants to dive a meaning to the variable : NULL, NO_VALUE, INITAL_VALUE...
    private static final Long NULL_LONG = null;
    private Example example;

    /*
     * Uses @BeforeClass to unsure the initial state for all test,
     * or in case to backup the current value.
     *
     */
    private static Locale PREVIOUS_LOCALE;
    private static TimeZone PREVIOUS_TIMEZONE;
    @BeforeClass
    public static void beforeClass() {
        System.out.println("$ - executing @BeforeClass");
        PREVIOUS_LOCALE = Locale.getDefault();
        System.out.println("$ - saving current Locale: " .concat(PREVIOUS_LOCALE.toString()));
        PREVIOUS_TIMEZONE = TimeZone.getDefault();
        System.out.println("$ - saving current TimeZone: " .concat(PREVIOUS_TIMEZONE.toString()));
    }

    /*
     * Uses @AfterClass to restore state or values before this class execution,
     *
     */
    @AfterClass
    public static void afterClass() {
        System.out.println("$ - executing @AfterClass");
        System.out.println("$ - changing current Locale from : " .concat(Locale.getDefault().toString()));
        Locale.setDefault(PREVIOUS_LOCALE);
        System.out.println("$ - changing current Locale to   : " .concat(Locale.getDefault().toString()));
        System.out.println("$ - changing current TimeZone from : " .concat(TimeZone.getDefault().toString()));
        TimeZone.setDefault(PREVIOUS_TIMEZONE);
        System.out.println("$ - changing current TimeZone to   : " .concat(TimeZone.getDefault().toString()));
    }

    /*
     * Uses @Before to unsure the initial state, it will be executed before each @Test method.
     */
    @Before
    public void setup() {
        System.out.println("$ - executing @Before");
        example = new Example();
        Locale.setDefault(DEFAULT_LOCALE);
        TimeZone.setDefault(DEFRAULT_TIME_ZONE);
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

        String result = example.toString(1000L);

        Assert.assertEquals("example+[G]=(n. Chr.)-[yyyy]=(2018)'[MM]=(09)'[dd]=(20)-[a]=(AM)'[HH]=(02)'[mm]=(34)'[ss]=(40)'[SSSSSS]=(000495)'[Z]=(+1200)+null", result);
    }

    /*
     * Write test for NULL values..
     */
    @Test
    public void toStringLocaleWithNull() {
        System.out.println("$ - executing the test");

        String result = example.toString(NULL_LONG);

        Assert.assertEquals("example+[G]=(n. Chr.)-[yyyy]=(2018)'[MM]=(09)'[dd]=(20)-[a]=(AM)'[HH]=(02)'[mm]=(34)'[ss]=(40)'[SSSSSS]=(000495)'[Z]=(+1200)+null", result);
    }
}
