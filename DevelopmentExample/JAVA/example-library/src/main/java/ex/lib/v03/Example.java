package ex.lib.v03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import ex.lib.CustomGeneralFormatter;

public class Example {

    private static final String PATTERN_TIME_FULL = new CustomGeneralFormatter().formatDatePattern();

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
        return new SimpleDateFormat(PATTERN_TIME_FULL, Locale.getDefault()).format(new Date());
    }
}
