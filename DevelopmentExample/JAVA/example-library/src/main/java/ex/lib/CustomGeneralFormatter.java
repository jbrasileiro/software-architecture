package ex.lib;

import java.util.Objects;

public class CustomGeneralFormatter {

    private static final String PATTERN_DOUBLE = "%1$,.2f";

    public String formatDatePattern() {
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

    private static String build(
        final String value) {
        return String.format("'[%s]=('%s')'", value, value);
    }

    public String formatDoublePattern() {
        return "%1$,.2f";
    }

    public String format(
        final Long number) {
        if(Objects.isNull(number)) {
            return Objects.toString(number);
        }else {
            return String.format(PATTERN_DOUBLE, Double.valueOf((number * 1000) / 2));
        }
    }
}
