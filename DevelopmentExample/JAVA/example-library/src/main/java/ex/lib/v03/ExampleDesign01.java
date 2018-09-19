package ex.lib.v03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import ex.lib.CustomGeneralFormatter;

public class ExampleDesign01 {

    private static final String FULL = new CustomGeneralFormatter().formatDatePattern();

    public String toString(
        final Long number) {
        return "example+"
                .concat(formatDate())
                .concat("+")
                .concat(format(number));
    }

    private String format(
        final Long number) {
        return new CustomGeneralFormatter().format(number);
    }

    private String formatDate() {
        return new SimpleDateFormat(FULL, Locale.getDefault()).format(date());
    }

    /**
     * move to a protected method in order to overide it in testing.
     * @return
     */
    protected Date date() {
        return new Date();
    }
}
