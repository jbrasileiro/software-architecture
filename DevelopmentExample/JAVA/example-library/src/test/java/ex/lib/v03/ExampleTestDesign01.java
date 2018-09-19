package ex.lib.v03;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleTestDesign01 {

    private static final ZoneId DEFAULT_ZONE_ID = ZoneId.of("Antarctica/McMurdo");
    private static final TimeZone DEFAULT_TIME_ZONE = TimeZone.getTimeZone(DEFAULT_ZONE_ID);
    private static final Locale DEFAULT_LOCALE = Locale.GERMANY;
    // Uses constants to dive a meaning to the variable : NULL, NO_VALUE, INITAL_VALUE...
    private static final Long NULL_LONG = null;
    /*
     * Uses @BeforeClass to unsure the initial state for all test,
     * or in case to backup the current value.
     *
     */
    private static Locale PREVIOUS_LOCALE;
    private static TimeZone PREVIOUS_TIMEZONE;
    private static ZoneId PREVIOUS_ZONE_ID;
    private ExampleDesign014T example;

    class ExampleDesign014T extends ExampleDesign01{

        @Override
        protected Date date() {
            int year = 2000;
            Month month = Month.DECEMBER;
            int day = 31;
            int hour = 23;
            int minute = 59;
            int second = 59;
            int nanoSecond = 999999999;
            LocalDateTime.of(year, month, day, hour, minute, second, nanoSecond);
            LocalDateTime time = LocalDateTime.of(year, month, day, hour, minute, second, nanoSecond);
            Instant instant = time.toInstant(ZoneOffset.UTC);
            return Date.from(instant);
        }
    }


    @BeforeClass
    public static void beforeClass() {
        System.out.println("$ - executing @BeforeClass");
        PREVIOUS_LOCALE = Locale.getDefault();
        System.out.println("$ - saving current Locale: " .concat(PREVIOUS_LOCALE.toString()));
        PREVIOUS_TIMEZONE = TimeZone.getDefault();
        System.out.println("$ - saving current TimeZone: " .concat(PREVIOUS_TIMEZONE.toString()));
        PREVIOUS_ZONE_ID = ZoneId.systemDefault();
        System.out.println("$ - saving current ZoneID: " .concat(PREVIOUS_ZONE_ID.toString()));
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
        example = new ExampleDesign014T();
        Locale.setDefault(DEFAULT_LOCALE);
        TimeZone.setDefault(DEFAULT_TIME_ZONE);
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

        Assert.assertEquals("example+[G]=(n. Chr.)-[yyyy]=(2001)'[MM]=(01)'[dd]=(01)-[a]=(PM)'[HH]=(12)'[mm]=(59)'[ss]=(59)'[SSSSSS]=(000999)'[Z]=(+1300)+500.000,00", result);
    }

    /*
     * Write test for NULL values..
     */
    @Test
    public void toStringLocaleWithNull() {
        System.out.println("$ - executing the test");

        String result = example.toString(NULL_LONG);

        Assert.assertEquals("example+[G]=(n. Chr.)-[yyyy]=(2001)'[MM]=(01)'[dd]=(01)-[a]=(PM)'[HH]=(12)'[mm]=(59)'[ss]=(59)'[SSSSSS]=(000999)'[Z]=(+1300)+null", result);
    }
}
