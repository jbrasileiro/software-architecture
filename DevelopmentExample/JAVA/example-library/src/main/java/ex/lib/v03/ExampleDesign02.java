package ex.lib.v03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import ex.lib.CustomGeneralFormatter;
import ex.lib.DateProvider;

public class ExampleDesign02 {

    private static final String FULL = new CustomGeneralFormatter().formatDatePattern();

    private final DateProvider provider;

    public ExampleDesign02(
        final DateProvider provider) {
        super();
        this.provider = provider;
    }

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
     * Make it external, moving to a class, making it more testable wihout change the code or relation between 'testing' code X 'production' code.
     * @return
     */
    private Date date() {
        return provider.now();
    }
}
