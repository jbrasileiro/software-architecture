package ex.lib.v03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Example {

    public static final String FULL = format();

    private static String format() {
        StringBuilder builder = new StringBuilder();
        builder.append(build("G"));
        builder.append("-");
        builder.append(build("yyyy"));
        builder.append(build("MM"));
        builder.append(build("dd"));
        builder.append("-");
        builder.append(build("a"));
        builder.append(build("HH"));
        builder.append(build("mm"));
        builder.append(build("ss"));
        builder.append(build("SSSSSS"));
        builder.append(build("Z"));
        return builder.toString();
    }

    private static String build(final String value) {
        return String.format("'[%s]=('%s')'", value, value);
    }

    public String toString(
        final Long number) {
        return "example+"
                .concat(date())
                .concat("+")
                .concat(format(number));
    }

    private String format(
        final Long number) {
        if(Objects.isNull(number)) {
            return Objects.toString(number);
        }else {
            return String.format("%1$,.2f\"", Double.valueOf((number * 1000) / 2));
        }
    }

    private String date() {
        return new SimpleDateFormat(FULL, Locale.getDefault()).format(new Date());
    }
}
