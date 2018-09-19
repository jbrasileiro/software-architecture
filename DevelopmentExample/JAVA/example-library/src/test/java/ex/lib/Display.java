package ex.lib;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Display {

    private static final String FULL = "yyyyMMdd-HHmmssSSSSSSZ";

    /**
     * not a test - just for curiosity.
     */
    @Test
    public void display01_Locale() {
        for (Locale locale : Locale.getAvailableLocales()) {
            System.out.println("------------");
            Locale.setDefault(locale);
            System.out.println(locale.toString());
            System.out.println(format());
        }
    }

    /**
     * not a test - just for curiosity.
     */
    @Test
    public void display02_TimeZone() {
        for (String timezone : TimeZone.getAvailableIDs()) {
            System.out.println("------------");
            TimeZone.setDefault(TimeZone.getTimeZone(timezone));
            System.out.println(TimeZone.getDefault().toString());
            System.out.println(format());
        }
    }

    /**
     * not a test - just for curiosity.
     */
    @Test
    public void display03_ZoneId() {
        for (String zoneid :  ZoneId.getAvailableZoneIds()) {
            System.out.println("------------");
            String format = String.format("id[%s] = %s", zoneid, ZoneId.of(zoneid));
            System.out.println(format);
        }
    }

    private String format() {
        StringBuilder builder = new StringBuilder();
        builder.append("time: ");
        Object time = new SimpleDateFormat(FULL, Locale.getDefault()).format(new Date());
        builder.append(String.format("[%s]", time));
        builder.append("number: ");
        String number = String.format("%1$,.2f\"", Double.valueOf((1000000) / 2));
        builder.append(String.format("[%s]", number));
        return builder.toString();
    }

}
